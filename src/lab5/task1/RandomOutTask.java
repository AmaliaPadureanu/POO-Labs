package lab5.task1;

import java.util.Random;

public class RandomOutTask implements Task {
    int randomVal;

    public RandomOutTask() {
        Random random = new Random();
        randomVal = random.nextInt(100);
    }

    @Override
    public void execute() {
        System.out.println("The random number is " + randomVal);
    }

    @Override
    public String toString() {
        return "RandomOutTask{" +
                "randomVal=" + randomVal +
                '}';
    }
}
