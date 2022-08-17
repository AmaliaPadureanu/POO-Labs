package lab10;

public class ConnectComponents implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private int element1;
    private int element2;
    private String previous;
    private String next;

    public ConnectComponents(DiagramCanvas diagramCanvas, String index1, String index2) {
        this.diagramCanvas = diagramCanvas;
        element1 = Integer.parseInt(index1);
        element2 = Integer.parseInt(index2);
    }

    @Override
    public void execute() {
        diagramCanvas.getComponent(element1).connectTo(diagramCanvas.getComponent(element2).toString());
        previous = diagramCanvas.getComponent(element2).toString();
    }

    @Override
    public void undo() {
        if (diagramCanvas.getComponent(element1).getConnectedComponents().size() > 0) {
            diagramCanvas.getComponent(element1).removeConnection(diagramCanvas.getComponent(element2).toString());
        } else {
            diagramCanvas.getComponent(element1).connectTo(diagramCanvas.getComponent(element2).toString());
        }
    }

    @Override
    public String toString() {
        return "ConnectComponents{" +
                "diagramCanvas=" + diagramCanvas +
                ", element1=" + element1 +
                ", element2=" + element2 +
                '}';
    }
}
