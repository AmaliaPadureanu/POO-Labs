package lab12.reports;

import lab12.entities.*;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class BusinessReport {
    public static Map<Disability, List<Employee>> getEmployeesOnSameDisability(Business business) {
        // Get employees and map them on the type of disability they possess
        return business.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getDisability));
    }

    public static long getNumberOfDifferentProjectsWorkedByCurrentFemaleEmployees(Business business) {
        // Get employees, filter by gender, get their projects without duplicates, count
        Set<Employee> femaleEmployee = business.getEmployees().stream().filter(employee -> employee.getGender() == Gender.FEMALE).collect(Collectors.toSet());
        var total = femaleEmployee.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .collect(Collectors.toSet())
                .stream().distinct().count();
        return total;
    }

    public static Map<Religion, Map<Gender, List<Employee>>> getEmployeesOnSameReligionAndGender(Business business) {
        // Map the employees by religion (Map<Religion, List<Employee>>) then map each of the lists by city (Map<String, List<Employee>>)
        return business.getEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getReligion, Collectors.groupingBy(Employee::getGender)));
    }
}
