package lab3.tasks1235;

public class Lindt extends CandyBox {
    float length;
    float width;
    float height;

    public Lindt() {}

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getVolume() {
        float result = length * width * height;
        return result;
    }

    public String toString() {
        return super.toString() + " has volume " + getVolume();
    }

    public void printLindtDim() {
        System.out.print("length = " + length + "\n" + "width = " + width + "\n" + "height = " + height + "\n");
    }

    public void printDim(){
        System.out.print("length = " + length + "\n" + "width = " + width + "\n" + "height = " + height + "\n");
    }
}
