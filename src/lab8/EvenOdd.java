package lab8;

import java.util.LinkedHashSet;

public class EvenOdd extends LinkedHashSet {
    public Integer number;
    LinkedHashSet set = new LinkedHashSet();

    @Override
    public boolean add(Object number) {
        if ((Integer)number % 2 == 0) {
            set.add(number);
        } return false;
    }

    public static void main(String[] args) {
        EvenOdd isEven = new EvenOdd();
        isEven.add(43868);
        isEven.add(2);
        isEven.add(3);
        isEven.add(6);
        isEven.add(245);
        isEven.add(548);
        isEven.add(1);


        isEven.set.forEach(System.out::println);
    }
}
