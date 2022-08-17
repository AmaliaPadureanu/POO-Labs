package lab10;

public class ChangeColor implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private int index;
    private String previousColor;
    private String nextColor;

    public ChangeColor(DiagramCanvas diagramCanvas, String index, String color) {
        this.diagramCanvas = diagramCanvas;
        this.index = Integer.parseInt(index);
        nextColor = color;
    }

    @Override
    public void execute() {
        previousColor = diagramCanvas.getComponent(index).getColor();
        diagramCanvas.getComponent(index).setColor(nextColor);
    }

    @Override
    public void undo() {
        diagramCanvas.getComponent(index).setColor(previousColor);
    }

    @Override
    public String toString() {
        return "ChangeColor{" +
                "diagramCanvas=" + diagramCanvas +
                ", index=" + index +
                ", previousColor='" + previousColor + '\'' +
                ", nextColor='" + nextColor + '\'' +
                '}';
    }
}
