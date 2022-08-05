package lab5.task3;

public class Operation implements Plus, Minus, Div, Mult {
    public void plus(float num) {
        num++;
        System.out.println(num);
    }

    public void minus(float num) {
        num--;
        System.out.println(num);
    }

    public void div(float num) {
        num = num / 2;
        System.out.println(num);
    }

    public void mult(float num) {
        num = num * 2;
        System.out.println(num);
    }
}
