package lab2.task3;

public class Polygon {
    Point[] points;


    public Polygon(int n) {
       points = new Point[n];
    }

    public Polygon(float[] vector) {
        this(vector.length / 2);

        for(int i = 0; i < points.length; i++) {
            float x = vector[i * 2];
            float y = vector[i*2+1];
            points[i] = new Point(x, y);
        }
    }



    public static void main(String[] args) {
        Polygon p = new Polygon(5);
    }

}
