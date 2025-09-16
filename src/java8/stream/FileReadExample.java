package java8.stream;
// Import the necessary classes for handling I/O operations and managing lists
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
// Define a public class named FileReadExample
public class FileReadExample {
    // Define a private static method that filters strings by length and converts them to uppercase
    private static List<String> filterAndConvertToUpper(List<String> lines, int length) {
        // Create a new ArrayList to store filtered and modified strings
        List<String> filteredStrings = new ArrayList<>();
        // Iterate over each string in the list provided
        for (String line : lines) {
            // Check if the length of the string equals the specified length
            if (line.length() == length) {
                // Convert the string to uppercase and add it to the list of filtered strings
                filteredStrings.add(line.toUpperCase());
            }
        }
        // Return the list of filtered and converted strings
        return filteredStrings;
    }
    // Define the main method, which is the entry point for the program
    public static void main(String[] args) {
        // Specify the path to the file that will be read
        String fileName = System.getProperty("user.dir") + "/CustomFileReader.txt";
        // Initialize a new ArrayList to store the lines read from the file
        List<String> lines = new ArrayList<>();
        // Use try-with-resources to ensure the BufferedReader is closed properly
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read each line of the file until no more lines are found
            while ((line = br.readLine()) != null) {
                // Add each line to the list of lines
                lines.add(line);
                // Print out each line that is read, for debugging purposes
                System.out.println("Read line: " + line);
            }
            // Call the filterAndConvertToUpper method to process the lines and store the result
            List<String> filteredStrings = filterAndConvertToUpper(lines, 5);
            // Print out the list of filtered and converted strings
            System.out.println("Filtered strings with length 5 (converted to uppercase): " + filteredStrings);
        } catch (IOException e) {
            // Catch and print details of any IOException that occurs during file reading
            e.printStackTrace();
        }
    }

}
