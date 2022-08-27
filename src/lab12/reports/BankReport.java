package lab12.reports;

import lab12.entities.Account;
import lab12.entities.Bank;
import lab12.entities.Employee;
import java.util.*;
import java.util.stream.Collectors;

public class BankReport {
    // Customer = Employee of the Business
    // Business = a client of the Bank
    // Customers of the Bank = all the Employees that work for the Businesses that are clients of the Bank

    public static int getNumberOfCustomers(Bank bank) {
        // All the customers that have accounts at the bank
        return (int)bank.getClients().stream()
                .flatMap(business -> business.getEmployees().stream())
                .distinct().count();
    }

    public static int getNumberOfAccounts(Bank bank) {
        // Accounts of all the customers of the bank
        return (int) bank.getClients().stream()
                .flatMap(business -> business.getEmployees().stream())
                .flatMap(employee -> employee.getAccounts().stream())
                .distinct().count();
    }

    public static SortedSet<Employee> getCustomersSorted(Bank bank) {
        // Display the set of customers in alphabetical order;
        SortedSet<Employee> set = new TreeSet<>(Comparator.comparing(Employee::getName));
        bank.getClients().stream()
                .flatMap(business -> business.getEmployees().stream()).forEach(set::add);
        return set;
    }

    public static double getTotalSumInAccounts(Bank bank) {
        // Sum of all customers' accounts balances
        return bank.getClients().stream()
                .flatMap(business -> business.getEmployees().stream())
                .flatMap(employee -> employee.getAccounts().stream())
                .collect(Collectors.toList()).stream()
                .reduce(0.0, (partialSum, account) -> partialSum + account.getBalance(), Double::sum);
    }

    public static SortedSet<Account> getAccountsSortedBySum(Bank bank) {
        // The set of all accounts, ordered by current account balance
        SortedSet<Account> sortedAccounts = new TreeSet<>(Comparator.comparing(Account::getBalance).thenComparing(Account::getId));
        bank.getClients().stream()
                .flatMap(business -> business.getEmployees().stream())
                .flatMap(employee -> employee.getAccounts().stream())
                .forEach(sortedAccounts::add);
        return sortedAccounts;
    }

    public static Map<Employee, Collection<Account>> getCustomerAccounts(Bank bank) {
        // Return a map of all the customers with their respective accounts
        Map<Employee, Collection<Account>> customerAccount  = new HashMap<>();
         List<Employee> employees = bank.getClients().stream()
                .flatMap(business -> business.getEmployees().stream())
                .collect(Collectors.toList());
         for(Employee e : employees) {
             customerAccount.put(e, e.getAccounts());
         }
         return customerAccount;
    }

    public static Map<String, List<Employee>> getCustomersByCity(Bank bank) {
        // Map all the customers to their respective cities
        return bank.getClients().stream()
                .flatMap(business -> business.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getCity));
    }
}
