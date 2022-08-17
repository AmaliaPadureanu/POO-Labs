package lab10.task2;

public class House {

    private String location;
    private int floors;
    private int rooms;
    private String color;
    private boolean pool;
    private boolean powerGrid;

    private House(HouseBuilder builder) {
        this.location = builder.location;
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.color = builder.color;
        this.pool = builder.pool;
        this.powerGrid = builder.powerGrid;
    }

    public String getLocation() {
        return location;
    }

    public int getFloors() {
        return floors;
    }

    public int getRooms() {
        return rooms;
    }

    public String getColor() {
        return color;
    }

    public boolean hasPool() {
        return pool;
    }

    public boolean hasPowerGrid() {
        return powerGrid;
    }

    @Override
    public String toString() {
        return "House{" +
                "location='" + location + '\'' +
                ", floors=" + floors +
                ", rooms=" + rooms +
                ", color='" + color + '\'' +
                ", pool=" + pool +
                ", powerGrid=" + powerGrid +
                '}';
    }

    public static class HouseBuilder {

        private String location;
        private int floors;
        private int rooms;
        private String color;
        private boolean pool;
        private boolean powerGrid;

        public HouseBuilder(String location, int floors, int rooms) {
           this.location = location;
           this.floors = floors;
           this.rooms = rooms;
        }

        public HouseBuilder color(String color) {
            this.color = color;
            return this;
        }

        public HouseBuilder pool(boolean pool) {
            this.pool = pool;
            return this;
        }

        public HouseBuilder powerGrid(boolean powerGrid) {
            this.powerGrid = powerGrid;
            return this;
        }

        public House build() {

            return new House(this);
        }
    }

    public static void main(String[] args) {
        House house = new HouseBuilder("london", 2, 5)
                .color("blue")
                .pool(true)
                .powerGrid(false)
                .build();

        System.out.println(house);
    }
}
