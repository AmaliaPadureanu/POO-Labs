package lab6;

public class Car {
    public enum CarType {BMW, AUDI, FORD};
    private int price;
    private int fabricationYear;
    private CarType type;

    public Car(CarType type, int price, int fabricationYear) {
        this.type = type;
        this.price = price;
        this.fabricationYear = fabricationYear;
    }

    public CarType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", fabricationYear=" + fabricationYear +
                ", type=" + type +
                '}';
    }
}
