package lab10;

import java.util.LinkedList;

/**
 * The layer between the client and the commands that need to be executed on the receivers (DiagramCanvas and DiagramComponent).
 * <br>
 * It is independent of the subtypes of commands, it just receives a command, runs it and implements a redo/undo mechanism.
 */
public class Invoker {
    /**
     * Clear up all the used resources, start fresh :D
     */
    private LinkedList<DrawCommand> history = new LinkedList<>();
    private LinkedList<DrawCommand> undo = new LinkedList<>();

    public void restart() {
        history.clear();
        undo.clear();
    }
    /**
     * Executes a given command
     * @param command
     */
    DrawCommand command;
    public void execute(DrawCommand command) {
        history.push(command);
        command.execute();
    }
    /**
     * Undo the latest command
     */
    public void undo() {
        if (history.isEmpty()) return;

        command = history.pop();

        if (command != null) {
            command.undo();
            undo.push(command);
        }
    }
    /**
     * Redo command previously undone. Cannot perform a redo after an execute, only after at least one undo.
     */
    public void redo() {
        if(undo.isEmpty()) return;

        command = undo.pop();

        if (command != null) {
            history.push(command);
            command.execute();
        }
    }
}
