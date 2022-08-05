package lab5.task4;

import java.util.ArrayList;

public class BadAlbum extends Album {
    private ArrayList<Song> songsBad = new ArrayList<>();

    boolean isPalindrome(Song song) {
        boolean result;
        int num = song.getId();
        int reversedNum = 0;
        int remainder;
        int originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    @Override
    public void addSong(Song song) {

    boolean isPalindrome = isPalindrome(song);

    if(song.getName().toCharArray().length <= 3 && isPalindrome) {
           songsBad.add(song);
    } else {
        System.out.println("The song name maximum length must be 3 and the song ID must be a palindrome");
        }
    }

    @Override
    public void removeSong(Song song) {
        songsBad.remove(song);
    }

    @Override
    public String toString() {
        return "BadAlbum{" +
                "songsBad=" + songsBad +
                "} ";
    }
}
