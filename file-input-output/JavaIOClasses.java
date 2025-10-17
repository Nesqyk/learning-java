/**
 * Using Java's I/O Classes - Java Tutorial
 *
 * This program demonstrates practical file I/O operations using Java's java.io package.
 * We'll show how to read from and write to files using various I/O classes.
 *
 * Author: Tyrone Tabornal
 * Topic: Using Java's I/O Classes
 *
 * Key Learning Points:
 * - FileReader and BufferedReader for efficient text reading
 * - FileWriter and BufferedWriter for efficient text writing
 * - Proper resource management with try-with-resources
 * - Exception handling for I/O operations
 * - Line-by-line processing of text files
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaIOClasses {

    public static void main(String[] args) {
        System.out.println("=== Using Java's I/O Classes ===\n");

        // Demonstrate file reading
        demonstrateFileReading();

        System.out.println(); // Empty line for separation

        // Demonstrate file writing
        demonstrateFileWriting();

        System.out.println(); // Empty line for separation

        // Demonstrate advanced I/O techniques
        demonstrateAdvancedIO();
    }

    /**
     * Demonstrates how to read from a text file using FileReader and BufferedReader
     * BufferedReader is preferred because it provides efficient reading and the readLine() method
     */
    public static void demonstrateFileReading() {
        System.out.println("📖 FILE READING EXAMPLE:");

        // Use try-with-resources to automatically close the file
        // This ensures proper cleanup even if an exception occurs
        try (BufferedReader reader = new BufferedReader(new FileReader("sample-input.txt"))) {

            System.out.println("Reading from file: sample-input.txt");
            System.out.println("File contents:");

            String line; // Variable to hold each line read from the file
            int lineNumber = 1; // Counter for line numbers

            // Read the file line by line until we reach the end
            // readLine() returns null when there's nothing more to read
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

            System.out.println("✓ File reading completed successfully!");

        } catch (IOException e) {
            // Handle I/O errors (file not found, permission issues, etc.)
            System.err.println("❌ Error reading file: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n📝 CODE EXPLANATION:");
        System.out.println("1. BufferedReader wraps FileReader for efficiency");
        System.out.println("2. try-with-resources automatically closes the file");
        System.out.println("3. readLine() reads one line at a time");
        System.out.println("4. Loop continues until readLine() returns null");
        System.out.println("5. IOException catches file-related errors");
    }

    /**
     * Demonstrates how to write to a text file using FileWriter and BufferedWriter
     * BufferedWriter is preferred for efficient writing and newLine() method
     */
    public static void demonstrateFileWriting() {
        System.out.println("📝 FILE WRITING EXAMPLE:");

        // Use try-with-resources for automatic resource management
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sample-output.txt"))) {

            System.out.println("Writing to file: sample-output.txt");

            // Write some sample content
            writer.write("Hello, World!"); // Write text
            writer.newLine(); // Write a newline character (platform-specific)
            writer.write("This is a sample file created by Java I/O classes.");
            writer.newLine();
            writer.write("Current date and time: " + java.time.LocalDateTime.now());
            writer.newLine();

            // Write multiple lines using a loop
            for (int i = 1; i <= 5; i++) {
                writer.write("Line number " + i);
                writer.newLine();
            }

            System.out.println("✓ File writing completed successfully!");

        } catch (IOException e) {
            // Handle I/O errors (permission issues, disk full, etc.)
            System.err.println("❌ Error writing file: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n📝 CODE EXPLANATION:");
        System.out.println("1. BufferedWriter wraps FileWriter for efficiency");
        System.out.println("2. write() method writes string content");
        System.out.println("3. newLine() writes platform-specific line endings");
        System.out.println("4. try-with-resources ensures file is properly closed");
        System.out.println("5. IOException handles write-related errors");
    }

    /**
     * Demonstrates advanced I/O techniques like appending and processing data
     */
    public static void demonstrateAdvancedIO() {
        System.out.println("🔧 ADVANCED I/O TECHNIQUES:");

        // Demonstrate appending to an existing file
        demonstrateFileAppending();

        // Demonstrate reading and processing data
        demonstrateDataProcessing();
    }

    /**
     * Shows how to append data to an existing file instead of overwriting it
     */
    public static void demonstrateFileAppending() {
        System.out.println("\n📎 FILE APPENDING:");

        // To append, pass 'true' as the second parameter to FileWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("sample-output.txt", true))) {

            writer.newLine(); // Add a blank line
            writer.write("=== APPENDED CONTENT ===");
            writer.newLine();
            writer.write("This content was added later.");
            writer.newLine();
            writer.write("Append mode preserves existing content.");

            System.out.println("✓ Content appended successfully!");

        } catch (IOException e) {
            System.err.println("❌ Error appending to file: " + e.getMessage());
        }
    }

    /**
     * Demonstrates reading data and performing operations on it
     */
    public static void demonstrateDataProcessing() {
        System.out.println("\n🔄 DATA PROCESSING:");

        try (BufferedReader reader = new BufferedReader(new FileReader("sample-input.txt"))) {

            System.out.println("Processing file contents:");

            String line;
            int totalLines = 0;
            int totalCharacters = 0;

            // Process each line
            while ((line = reader.readLine()) != null) {
                totalLines++;
                totalCharacters += line.length();

                // Example: Convert to uppercase
                String upperCaseLine = line.toUpperCase();
                System.out.println("Original: " + line);
                System.out.println("Uppercase: " + upperCaseLine);
                System.out.println();
            }

            System.out.println("Processing Summary:");
            System.out.println("- Total lines: " + totalLines);
            System.out.println("- Total characters: " + totalCharacters);
            System.out.println("- Average characters per line: " +
                             (totalLines > 0 ? totalCharacters / totalLines : 0));

        } catch (IOException e) {
            System.err.println("❌ Error processing file: " + e.getMessage());
        }
    }

    /**
     * Best practices for file I/O in Java
     */
    public static void showBestPractices() {
        System.out.println("\n✅ BEST PRACTICES:");
        System.out.println("1. Always use try-with-resources for automatic cleanup");
        System.out.println("2. Use BufferedReader/BufferedWriter for text files");
        System.out.println("3. Handle IOException appropriately");
        System.out.println("4. Specify character encoding when needed");
        System.out.println("5. Close files explicitly if not using try-with-resources");
        System.out.println("6. Use Path and Files for newer Java applications");
    }
}
