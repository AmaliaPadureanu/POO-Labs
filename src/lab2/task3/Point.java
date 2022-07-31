package lab2.task3;

public class Point {
    float x;
    float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void changeCoords(float first, float second) {
        x = first;
        y = second;
    }

    @Override
    public String toString() {
        return "(" + x +
                ", " + y + ")";
    }

    public static void main(String[] args) {
        Point point = new Point(2, 8);
        System.out.println(point);
        point.changeCoords(4, 9);
        System.out.println(point);
    }
}
