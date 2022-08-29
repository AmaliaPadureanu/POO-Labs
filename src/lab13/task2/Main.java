package lab13.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO: Initialize the calculator
        Calculator calculator = new CalculatorClass();

        System.out.println(calculator.add(2d, 3d));
        System.out.println(calculator.divide(9d, 4d));
        System.out.println(calculator.average(List.of(1d, 2d, 3d, 4d)));

        // TODO: Test edge cases that would throw exceptions
        //NullParameter
        //System.out.println(calculator.add(null, 3d));
        //Overflow
        //System.out.println(calculator.add(1.0615472972511642E308, 1.246498306457423E308));
        //Underflow
        //System.out.println(calculator.add(-1.0615472972511642E308, -1.246498306457423E308));

        //NullParameter
        //System.out.println(calculator.divide(null, 3d));
        //Overflow
        //System.out.println(calculator.divide(1.0615472972511642E308, 1.246498306457423E308));
        //Underflow
        //System.out.println(calculator.divide(-1.0615472972511642E308, -1.246498306457423E308));

        //NullParameter
        //System.out.println(calculator.average(null));
        //Overflow
        //System.out.println(calculator.average(List.of(1.0615472972511642E308, 1.246498306457423E308)));
        //Underflow
        //System.out.println(calculator.average(List.of(-1.0615472972511642E308, -1.246498306457423E308)));
    }
}
