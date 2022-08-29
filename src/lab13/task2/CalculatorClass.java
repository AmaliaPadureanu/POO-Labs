package lab13.task2;

import java.util.Collection;

public class CalculatorClass implements Calculator {
    @Override
    public Double add(Double nr1, Double nr2) {
        if (nr1 == null | nr2 == null) throw new NullParameterException();
        if (nr1 + nr2 == Double.POSITIVE_INFINITY) throw new OverflowException();
        if (nr1 + nr2 == Double.NEGATIVE_INFINITY) throw new UnderflowException();
        return nr1 + nr2;
    }

    @Override
    public Double divide(Double nr1, Double nr2) {
        if (nr1 == null | nr2 == null) throw new NullParameterException();
        if (nr1 + nr2 == Double.POSITIVE_INFINITY) throw new OverflowException();
        if (nr1 + nr2 == Double.NEGATIVE_INFINITY) throw new UnderflowException();
        return nr1 / nr2;
    }

    @Override
    public Double average(Collection<Double> numbers) {
        double total = 0;
        for (Double n : numbers) {
            total = add(total, n);
            if(n == null) throw new NullParameterException();
        }
        return divide(total, (double)numbers.size());
    }
}
