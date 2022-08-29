package lab13.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static void readAndPrintLine() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        try {
            String name = reader.readLine();
            System.out.println("Welcome " + name);
        } catch (IOException exception) {
            System.out.println("exception");
        } finally {
            reader.close();
            System.out.println("reader closed");
        }
    }

    public static void main(String[] args) throws IOException {
        readAndPrintLine();
    }
}
