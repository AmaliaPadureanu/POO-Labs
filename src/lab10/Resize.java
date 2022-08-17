package lab10;

public class Resize implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private int element;
    private int previousWeight;
    private int previousHeight;
    private int nextWeight;
    private int nextHeight;

    public Resize(DiagramCanvas diagramCanvas, String index, String width, String height) {
        this.diagramCanvas = diagramCanvas;
        this.element = Integer.parseInt(index);
        this.nextWeight = Integer.parseInt(width) * diagramCanvas.getComponent(element).getWeight() / 100 + diagramCanvas.getComponent(element).getWeight();
        this.nextHeight = Integer.parseInt(height) * diagramCanvas.getComponent(element).getHeight() / 100 + diagramCanvas.getComponent(element).getHeight();
    }

    @Override
    public void execute() {
       previousWeight = diagramCanvas.getComponent(element).getWeight();
       previousHeight = diagramCanvas.getComponent(element).getHeight();

       diagramCanvas.getComponent(element).setWeight(nextWeight);
       diagramCanvas.getComponent(element).setHeight(nextHeight);
    }

    @Override
    public void undo() {
//        nextWeight = previousWeight;
//        previousWeight = diagramCanvas.getComponent(element).getWeight();
        diagramCanvas.getComponent(element).setWeight(previousWeight);

//        nextHeight = previousHeight;
//        previousHeight = diagramCanvas.getComponent(element).getHeight();
        diagramCanvas.getComponent(element).setHeight(previousHeight);
    }

    @Override
    public String toString() {
        return "Resize{" +
                "diagramCanvas=" + diagramCanvas +
                ", index=" + element +
                ", previousWeight=" + previousWeight +
                ", previousHeight=" + previousHeight +
                ", nextWeight=" + nextWeight +
                ", nextHeight=" + nextHeight +
                '}';
    }
}
