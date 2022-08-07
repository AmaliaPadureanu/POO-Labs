package lab7;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

import static java.nio.file.FileVisitResult.CONTINUE;

/**
 * Counter for java files of a given directory using java.nio API
 */
public class JavaFilesVisitor extends SimpleFileVisitor<Path> {
    private ArrayList<Path> javaFiles;

    public final ArrayList<Path> getJavaFiles() {
        return javaFiles;
    }

    /**
     * TODO - override the visitFile(Path file, BasicFileAttributes attr) method of the SimpleFileVisitor.
     * Add to javaFiles all the Java related files: the ones with .java and .class extensions.
     */

    int countJavaFiles = 0;
    int countClassFiles = 0;

    public FileVisitResult visitFile(Path file, BasicFileAttributes attributes) {
        javaFiles = new ArrayList<>();
        if(file.toString().endsWith("java") && attributes.isRegularFile()) {
            javaFiles.add(file);
            countJavaFiles++;
            System.out.println(file);
        } else if (file.toString().endsWith("class") && attributes.isRegularFile()) {
            javaFiles.add(file);
            countClassFiles++;
            System.out.println(file);
        }
        return CONTINUE;
    }

    public static void main(String[] args) {

        Path startingDir = Paths.get("src/lab7");
        JavaFilesVisitor filesVisitor = new JavaFilesVisitor();

        /*
         * The walkFileTree methods does a depth-first traversal of a directory, starting from startingDir.
         * When it reaches a file, the visitFile method is invoked on the currently visited file.
         */
        try {
            Files.walkFileTree(startingDir, filesVisitor);
            ArrayList<Path> javaFiles = filesVisitor.getJavaFiles();

            // TODO: Print the number of files visited and their names
            System.out.println("Java files nr: " + filesVisitor.countJavaFiles);
            System.out.println("Class files nr: " + filesVisitor.countClassFiles);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
