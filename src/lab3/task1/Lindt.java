package lab3.task1;

public class Lindt extends CandyBox {
    float length;
    float width;
    float height;

    Lindt() {

    }

    Lindt(String origin, String flavor, float length, float width, float height) {
        super(origin, flavor);
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


    public static void main(String[] args) {
        Lindt l = new Lindt("origin", "flavor", 3, 4, 5);
        System.out.println(l);
        Lindt l2 = new Lindt("origin", "flavor", 5, 4, 5);

        System.out.println(l.equals(l2));

    }
}
