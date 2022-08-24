package lab11.task2;

public class MyMatrix implements Summable {
    private int[][] matrix = new int[4][4];

    public MyMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public void addValue(Summable value) {
        if (value instanceof MyMatrix) {
            int total = this.getValue() + value.getValue();
            System.out.println(total);
        } else {
            System.out.println("the value must be MyMatrix");
        }
    }

    @Override
    public int getValue() {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                total += matrix[i][j];
            }
        }
        return total;
    }
}
