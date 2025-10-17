/**
 * Creating and Using Sequential Data Files - Java Tutorial
 *
 * This program demonstrates how to create and use sequential data files in Java.
 * Sequential files store records one after another and are accessed in the same order.
 *
 * Author: Joan Borres
 * Topic: Creating and Using Sequential Data Files
 *
 * Key Learning Points:
 * - Sequential files store records in a specific order
 * - Records are accessed one after another (sequential access)
 * - CSV (Comma-Separated Values) is a common format for sequential data
 * - Proper error handling is crucial for file operations
 * - Data validation ensures data integrity
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SequentialDataFiles {

    public static void main(String[] args) {
        System.out.println("=== Creating and Using Sequential Data Files ===\n");

        // Demonstrate creating a sequential file
        createStudentRecordsFile();

        System.out.println(); // Empty line for separation

        // Demonstrate reading from a sequential file
        readStudentRecordsFile();

        System.out.println(); // Empty line for separation

        // Demonstrate advanced sequential file operations
        demonstrateAdvancedOperations();
    }

    /**
     * Demonstrates creating a sequential file with student records
     * Records are written one after another in CSV format
     */
    public static void createStudentRecordsFile() {
        System.out.println("📝 CREATING A SEQUENTIAL FILE:");

        // Sample student data to write to file
        String[] studentRecords = {
            "101,John Doe,A",
            "102,Jane Smith,B+",
            "103,Bob Johnson,A-",
            "104,Alice Brown,B",
            "105,Charlie Wilson,A"
        };

        // Use try-with-resources to ensure proper file closure
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {

            System.out.println("Creating students.txt with student records...");

            // Write each record followed by a newline
            for (String record : studentRecords) {
                writer.write(record);
                writer.newLine();
                System.out.println("✓ Wrote: " + record);
            }

            System.out.println("✓ Sequential file created successfully!");
            System.out.println("✓ File contains " + studentRecords.length + " student records");

        } catch (IOException e) {
            System.err.println("❌ Error creating file: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n📝 CODE EXPLANATION:");
        System.out.println("1. Records are written sequentially (one after another)");
        System.out.println("2. Each record is a single line in the file");
        System.out.println("3. CSV format: ID,Name,Grade");
        System.out.println("4. newLine() ensures proper line endings");
        System.out.println("5. try-with-resources handles file cleanup");
    }

    /**
     * Demonstrates reading from a sequential file
     * Records are read in the same order they were written
     */
    public static void readStudentRecordsFile() {
        System.out.println("📖 READING FROM A SEQUENTIAL FILE:");

        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {

            System.out.println("Reading student records from students.txt:");
            System.out.println("ID   | Name        | Grade");
            System.out.println("-----|-------------|------");

            String line;
            int recordCount = 0;

            // Read each line (record) from the file
            while ((line = reader.readLine()) != null) {
                recordCount++;

                // Parse the CSV record
                String[] parts = line.split(",");

                if (parts.length == 3) {
                    String id = parts[0].trim();
                    String name = parts[1].trim();
                    String grade = parts[2].trim();

                    // Display the record in a formatted way
                    System.out.printf("%-5s| %-12s| %s%n", id, name, grade);
                } else {
                    System.out.println("⚠️  Invalid record format: " + line);
                }
            }

            System.out.println("✓ Read " + recordCount + " records successfully!");

        } catch (IOException e) {
            System.err.println("❌ Error reading file: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n📝 CODE EXPLANATION:");
        System.out.println("1. readLine() reads records in sequential order");
        System.out.println("2. split(',') parses CSV format");
        System.out.println("3. Records are processed in the order they appear");
        System.out.println("4. trim() removes extra whitespace");
        System.out.println("5. Error handling for malformed records");
    }

    /**
     * Demonstrates advanced operations with sequential files
     */
    public static void demonstrateAdvancedOperations() {
        System.out.println("🔧 ADVANCED SEQUENTIAL FILE OPERATIONS:");

        // Demonstrate searching for specific records
        searchStudentById("103");

        System.out.println();

        // Demonstrate filtering records
        findStudentsByGrade("A");

        System.out.println();

        // Demonstrate calculating statistics
        calculateGradeStatistics();
    }

    /**
     * Searches for a student by their ID in the sequential file
     * Demonstrates sequential search (must read all records until found)
     */
    public static void searchStudentById(String targetId) {
        System.out.println("🔍 SEARCHING FOR STUDENT ID: " + targetId);

        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {

            String line;
            boolean found = false;

            // Sequential search: read each record until we find the target
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 1 && parts[0].trim().equals(targetId)) {
                    System.out.println("✓ Found: " + line);
                    found = true;
                    break; // Stop searching once found
                }
            }

            if (!found) {
                System.out.println("❌ Student with ID " + targetId + " not found");
            }

        } catch (IOException e) {
            System.err.println("❌ Error searching file: " + e.getMessage());
        }
    }

    /**
     * Finds all students with a specific grade
     * Demonstrates filtering data from a sequential file
     */
    public static void findStudentsByGrade(String targetGrade) {
        System.out.println("🎯 FINDING STUDENTS WITH GRADE: " + targetGrade);

        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {

            String line;
            List<String> matchingStudents = new ArrayList<>();
            int totalProcessed = 0;

            // Process each record sequentially
            while ((line = reader.readLine()) != null) {
                totalProcessed++;
                String[] parts = line.split(",");
                if (parts.length >= 3 && parts[2].trim().equals(targetGrade)) {
                    matchingStudents.add(parts[1].trim()); // Add student name
                }
            }

            System.out.println("Found " + matchingStudents.size() + " students with grade " + targetGrade + ":");
            for (String name : matchingStudents) {
                System.out.println("  - " + name);
            }
            System.out.println("Processed " + totalProcessed + " total records");

        } catch (IOException e) {
            System.err.println("❌ Error filtering file: " + e.getMessage());
        }
    }

    /**
     * Calculates statistics from the student records
     * Demonstrates data analysis using sequential file processing
     */
    public static void calculateGradeStatistics() {
        System.out.println("📊 CALCULATING GRADE STATISTICS:");

        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {

            String line;
            int totalStudents = 0;
            int gradeCountA = 0;
            int gradeCountB = 0;
            double totalGpa = 0.0;

            // Process all records to calculate statistics
            while ((line = reader.readLine()) != null) {
                totalStudents++;
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String grade = parts[2].trim();

                    // Count grades
                    if (grade.startsWith("A")) {
                        gradeCountA++;
                    } else if (grade.startsWith("B")) {
                        gradeCountB++;
                    }

                    // Calculate GPA (simple conversion)
                    totalGpa += convertGradeToGpa(grade);
                }
            }

            // Display statistics
            System.out.println("Statistics:");
            System.out.println("- Total Students: " + totalStudents);
            System.out.println("- Grade A Count: " + gradeCountA);
            System.out.println("- Grade B Count: " + gradeCountB);
            System.out.println("- Average GPA: " + String.format("%.2f", totalGpa / totalStudents));

        } catch (IOException e) {
            System.err.println("❌ Error calculating statistics: " + e.getMessage());
        }
    }

    /**
     * Helper method to convert letter grades to GPA values
     */
    private static double convertGradeToGpa(String grade) {
        switch (grade) {
            case "A": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B": return 3.0;
            case "B-": return 2.7;
            default: return 0.0;
        }
    }

    /**
     * Best practices for working with sequential files
     */
    public static void showBestPractices() {
        System.out.println("\n✅ BEST PRACTICES FOR SEQUENTIAL FILES:");
        System.out.println("1. Use consistent record formats (like CSV)");
        System.out.println("2. Include headers to document the format");
        System.out.println("3. Validate data before writing to files");
        System.out.println("4. Handle exceptions appropriately");
        System.out.println("5. Use try-with-resources for automatic cleanup");
        System.out.println("6. Consider file locking for concurrent access");
        System.out.println("7. Document the file format for future reference");
    }
}
