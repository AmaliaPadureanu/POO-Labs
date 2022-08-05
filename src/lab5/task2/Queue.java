package lab5.task2;

import lab5.task1.Task;

import java.util.ArrayList;

public class Queue implements Container {

    private ArrayList<Task> elements = new ArrayList<>();

    public Task pop() {
        if(elements.isEmpty()) {
            return null;
        }
        Task top = elements.get(0);
        elements.remove(0);
        return top;
    }

    public void push(Task task) {
        elements.add(task);
    }

    public int size() {
        return elements.size();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public void transferFrom(Container container) {
        elements = new ArrayList<>(container.size());
        while (!(container.isEmpty())) {
            Task t = container.pop();
            elements.add(t);
        }
    }

    @Override
    public String toString() {
        return "Queue{" +
                "elements=" + elements +
                '}';
    }
}
