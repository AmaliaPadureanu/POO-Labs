package lab2.task4;

import java.text.Normalizer;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + Normalizer.normalize(title, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "") + '\'' +
                ", author='" + Normalizer.normalize(author, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "") + '\'' +
                ", year=" + year +
                '}';
    }
}
