package lab5.task4;

import java.util.ArrayList;

public class ThrillerAlbum extends Album {
    private ArrayList<Song> songsThriller = new ArrayList<>();

    @Override
    public void addSong(Song song) {
        if(song.getComposer().equals("Michael Jackson") && song.getId()%2 == 0) {
            songsThriller.add(song);
        } else {
            System.out.println("The composer must be Michael Jackson and the ID must be an even number");
        }
    }

    @Override
    public void removeSong(Song song) {
        songsThriller.remove(song);
    }

    @Override
    public String toString() {
        return "ThrillerAlbum{" +
                "songsThriller=" + songsThriller +
                "} ";
    }
}
