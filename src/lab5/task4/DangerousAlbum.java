package lab5.task4;

import java.util.ArrayList;

public class DangerousAlbum extends Album {
    private ArrayList<Song> songsDangerous = new ArrayList<>();

    boolean isPrime(Song song) {
        int num = song.getId();

        if (num <= 1)
        {
            return false;
        }

        for (int i = 2; i < num / 2; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void addSong(Song song) {
        if(isPrime(song)) {
            songsDangerous.add(song);
        } else {
            System.out.println("Song ID must be a prime number");
        }
    }

    @Override
    public void removeSong(Song song) {
        songsDangerous.remove(song);
    }

    @Override
    public String toString() {
        return "DangerousAlbum{" +
                "songsDangerous=" + songsDangerous +
                "} ";
    }
}
