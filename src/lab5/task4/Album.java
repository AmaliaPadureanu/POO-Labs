package lab5.task4;

import java.util.ArrayList;

public abstract class Album {
    private ArrayList<Song> songsList = new ArrayList<>();

    abstract void addSong(Song song);

    public void removeSong(Song song) {
        songsList.remove(song);
    }

    @Override
    public String toString() {
        return "Album{" +
                "songsList=" + songsList +
                '}';
    }
}
