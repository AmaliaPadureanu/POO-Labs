package lab11.task2;

import java.util.Collection;
import java.util.List;


public class Main {
    public static void main(final String[] args) {
        int[][] arr = new int[4][4];
        int counter = 1;
        for(int x = 0; x < arr.length; x++)
        {
            for(int y = 0; y < arr[x].length; y++)
            {
                arr[x][y] = counter++;
            }
        }

        MyVector3 myVector3 = new MyVector3(2, 3, 4);
        MyMatrix myMatrix = new MyMatrix(arr);

        myVector3.addValue(myVector3);
        myMatrix.addValue(myMatrix);

        summ(List.of(new Summable[]{myVector3, myMatrix}));
    }

    public static int summ (Collection<? extends Summable> collection) {
        int total = 0;

        for(var element: collection) {
            total += element.getValue();
        }

        System.out.println(total);
        return total;
    }
}
