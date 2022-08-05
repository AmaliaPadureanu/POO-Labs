package lab5.task1;

public class CounterOutTask implements Task {
    public static int counter = 0;

    public CounterOutTask() {
        counter++;
    }

    @Override
    public void execute() {
        System.out.println("The counter is " + counter);
    }

    @Override
    public String toString() {
        return "CounterOutTask{" + "counter = " + counter + "}";
    }
}
