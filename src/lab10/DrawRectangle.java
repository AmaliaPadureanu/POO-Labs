package lab10;

public class DrawRectangle implements DrawCommand {
    private DiagramComponent component;
    private DiagramCanvas diagramCanvas;

    public DrawRectangle(DiagramCanvas diagramCanvas) {
        this.diagramCanvas = diagramCanvas;
    }

    @Override
    public void execute() {
        component = new DiagramComponent();
        diagramCanvas.addComponent(component);
    }

    @Override
    public void undo() {
        diagramCanvas.removeComponent(component);
    }

    @Override
    public String toString() {
        return "DrawRectangle{" +
                "component=" + component +
                ", diagramCanvas=" + diagramCanvas +
                '}';
    }
}
