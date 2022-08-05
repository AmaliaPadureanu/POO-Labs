package lab5.task2;

import lab5.task1.Task;

public interface Container {
    Task pop();
    void push(Task task);
    int size();
    boolean isEmpty();
    void transferFrom(Container container);


}
