package lab11.task2;

public class MyVector3 implements Summable {
    private int vector[] = new int[3];

    public MyVector3(int x, int y, int z) {
        vector[0] = x;
        vector[1] = y;
        vector[2] = z;
    }

    @Override
    public void addValue(Summable value) {
        if (value instanceof MyVector3) {
            int total = this.getValue() + value.getValue();
            System.out.println(total);
        } else {
            System.out.println("the value must be MyVector3");
        }
    }

    @Override
    public int getValue() {
        int total = 0;
        total += vector[0];
        total += vector[1];
        total += vector[2];
        return total;
    }
}
