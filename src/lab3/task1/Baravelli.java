package lab3.task1;

public class Baravelli extends CandyBox {
    float radius;
    float height;

    Baravelli() {

    }

    Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    public float getVolume() {
        float result = (float) 3.14 * radius * radius * height;
        return result;
    }

    public String toString() {
        return super.toString() + " has volume " + getVolume();
    }
}
