package lab10;

/**
 * Receives commands in clear text from the user and transforms them in DrawCommand objects. It uses the Invoker to
 * execute the given commands.
 */
public class Client {
    private Invoker invoker;
    private DiagramCanvas diagramCanvas;

    Client() {
        invoker = new Invoker();
        diagramCanvas = new DiagramCanvas();
    }

    public void showDiagram() {
        diagramCanvas.show();
    }

    public void newDiagram() {
        diagramCanvas = new DiagramCanvas();
    }

    public void executeAction(String commandName, String ...args) {
        DrawCommand command;
        try {
            CommandType commandType = CommandType.fromString(commandName);
            command = getCommand(commandType, args);
            if (command == null) {
                throw new IllegalArgumentException();
            }
        } catch(IllegalArgumentException ex) {
            System.out.println("Invalid command: " + commandName);
            System.out.println("Available commands:");
            for (CommandType type : CommandType.values()) {
                System.out.println("\t- " + type.text);
            }
            return;
        }
        invoker.execute(command);
    }

    private DrawCommand getCommand(CommandType type, String ...args) throws IllegalArgumentException {
        DrawCommand drawCommand = null;
        switch (type) {
            case DRAW_RECTANGLE -> drawCommand = new DrawRectangle(diagramCanvas);
            case RESIZE -> drawCommand = new Resize(diagramCanvas, args[0], args[1], args[2]);
            case CHANGE_COLOR -> drawCommand = new ChangeColor(diagramCanvas, args[0], args[1]);
            case CHANGE_TEXT -> drawCommand = new ChangeText(diagramCanvas, args[0], args[1]);
            case CONNECT -> drawCommand = new ConnectComponents(diagramCanvas, args[0], args[1]);
        }
        return drawCommand;
    }

    public void undo(){
        invoker.undo();
    }

    public void redo() {
        invoker.redo();
    }
}
