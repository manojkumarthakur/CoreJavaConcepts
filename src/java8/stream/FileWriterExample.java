package java8.stream;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

// Class to demonstrate writing to a file
public class FileWriterExample {
    // Main method as the entry point of the application
    public static void main(String[] args) {
        // Array of strings to be written to the file
        String[] phrases = { "Sample", "Text", "For", "File", "Write" };
        // Path to the file where the text will be written
        String filePath = System.getProperty("user.dir") + "/CustomFileReader.txt";
        // Attempt to open the file and write phrases to it
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get(filePath)))) {
            // Writing each string from the array to the file using a stream
            Stream.of(phrases).forEach(writer::println);
            // Notify user of successful write operation
            System.out.println("Text has been successfully written to the file.");
        } catch (IOException e) {
            // Handle potential IO exceptions such as file not found or access issues
            e.printStackTrace();
        }
    }
}
