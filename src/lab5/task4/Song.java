package lab5.task4;

public class Song {
    private String name;
    private  int id;
    private String composer;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getComposer() {
        return composer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", composer='" + composer + '\'' +
                '}';
    }
}
