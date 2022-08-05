package lab5.task1;

public class OutTask implements Task {
    String message = null;

    public OutTask(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("The message is " + message);
    }

    @Override
    public String toString() {
        return "OutTask{" +
                "message='" + message + '\'' +
                '}';
    }
}
