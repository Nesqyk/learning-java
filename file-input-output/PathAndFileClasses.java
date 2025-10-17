/**
 * Using Path and File Classes - Java Tutorial
 *
 * This program demonstrates how to work with files and directories in Java
 * using both the modern Path class (NIO) and the traditional File class.
 *
 * Author: Joseph
 * Topic: Using Path and File Classes
 *
 * Key Learning Points:
 * - Path class is part of the newer NIO (New I/O) API
 * - Path is generally preferred over the older File class
 * - Both classes help us work with file system paths and metadata
 * - Path provides better support for symbolic links and modern file systems
 */

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFileClasses {

    public static void main(String[] args) {
        System.out.println("=== Using Path and File Classes ===\n");

        // Demonstrate Path class usage
        demonstratePathClass();

        System.out.println(); // Empty line for separation

        // Demonstrate File class usage
        demonstrateFileClass();
    }

    /**
     * Demonstrates the Path class from Java NIO (New I/O)
     * The Path class represents a file system path and is the preferred way
     * to work with file paths in modern Java applications.
     */
    public static void demonstratePathClass() {
        System.out.println("📍 THE PATH CLASS (Modern NIO Approach):");

        // Create a Path object using Paths.get()
        // This represents the path to a file in the file system
        Path filePath = Paths.get("C:\\Users\\Default\\Documents\\example.txt");

        System.out.println("Full Path: " + filePath);

        // Extract useful information from the path
        System.out.println("File Name: " + filePath.getFileName());
        System.out.println("Parent Directory: " + filePath.getParent());
        System.out.println("Number of Path Elements: " + filePath.getNameCount());

        // Get individual path elements (like splitting a path into folders)
        System.out.println("\nPath Elements:");
        for (int i = 0; i < filePath.getNameCount(); i++) {
            System.out.println("  [" + i + "] " + filePath.getName(i));
        }

        // Check if path is absolute (starts from root) or relative
        System.out.println("\nIs Absolute Path: " + filePath.isAbsolute());

        // Demonstrate creating paths in different ways
        System.out.println("\nDifferent ways to create paths:");
        System.out.println("Current Directory + file: " + Paths.get("documents", "report.txt"));
        System.out.println("From URI (for network paths): " + Paths.get("file:///C:/Users/file.txt"));
    }

    /**
     * Demonstrates the traditional File class
     * The File class has been available since Java 1.0 and is still widely used,
     * especially in legacy code. However, Path is generally preferred for new code.
     */
    public static void demonstrateFileClass() {
        System.out.println("📁 THE FILE CLASS (Traditional Approach):");

        // Create a File object representing a file or directory
        File file = new File("C:\\Users\\Default\\Documents\\example.txt");

        System.out.println("File Path: " + file.getPath());
        System.out.println("Absolute Path: " + file.getAbsolutePath());

        // Check if the file exists in the file system
        System.out.println("File exists: " + file.exists());

        // Get file properties (these return 0 if file doesn't exist)
        System.out.println("File size: " + file.length() + " bytes");
        System.out.println("Is Directory: " + file.isDirectory());
        System.out.println("Is File: " + file.isFile());

        // Get timing information
        System.out.println("Last Modified: " + file.lastModified());

        // Demonstrate creating File objects for directories
        File directory = new File("C:\\Users\\Default\\Documents");
        System.out.println("\nDirectory exists: " + directory.exists());
        System.out.println("Is Directory: " + directory.isDirectory());

        // List contents if it's a directory
        if (directory.isDirectory()) {
            String[] contents = directory.list();
            if (contents != null) {
                System.out.println("Directory contents:");
                for (String item : contents) {
                    System.out.println("  - " + item);
                }
            }
        }

        // Demonstrate relative paths
        File relativeFile = new File("relative", "path", "file.txt");
        System.out.println("\nRelative path example: " + relativeFile.getPath());
    }
}
