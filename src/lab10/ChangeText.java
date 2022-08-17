package lab10;

public class ChangeText implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private int element;
    private String previousText;
    private String nextText;

    public ChangeText(DiagramCanvas diagramCanvas, String index, String text) {
        this.diagramCanvas = diagramCanvas;
        this.element = Integer.parseInt(index);
        this.nextText = text;
    }

    @Override
    public void execute() {
        previousText = diagramCanvas.getComponent(element).getText();
        diagramCanvas.getComponent(element).setText(nextText);
    }

    @Override
    public void undo() {
        diagramCanvas.getComponent(element).setText(previousText);
    }

    @Override
    public String toString() {
        return "ChangeText{" +
                "diagramCanvas=" + diagramCanvas +
                ", element=" + element +
                ", previousText='" + previousText + '\'' +
                ", nextText='" + nextText + '\'' +
                '}';
    }
}
