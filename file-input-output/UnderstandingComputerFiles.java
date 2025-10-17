/**
 * Understanding Computer Files - Java Tutorial
 *
 * This program demonstrates the basic concepts of computer files in Java.
 * We'll explore what files are, their types, and how file systems organize them.
 *
 * Author: Jelian Batobalonos
 * Topic: Understanding Computer Files
 *
 * Key Learning Points:
 * - A computer file is a resource for storing information
 * - Files are durable (persist after program execution)
 * - Files can be text (human-readable) or binary (machine-readable)
 * - File systems organize files in hierarchical structures
 */

public class UnderstandingComputerFiles {

    public static void main(String[] args) {
        System.out.println("=== Understanding Computer Files ===\n");

        // Demonstrate file concepts through explanations
        explainFileBasics();
        explainFileTypes();
        explainFileSystems();
    }

    /**
     * Explains the basic concept of what a computer file is
     */
    public static void explainFileBasics() {
        System.out.println("📁 FILE BASICS:");
        System.out.println("A computer file is a resource for storing information.");
        System.out.println("Files are 'durable' - they remain available after the current program ends.");
        System.out.println("Think of files like books in a library - they store information for later use.\n");
    }

    /**
     * Explains different types of files (text vs binary)
     */
    public static void explainFileTypes() {
        System.out.println("📄 FILE TYPES:");
        System.out.println("1. TEXT FILES (Human-readable):");
        System.out.println("   - Examples: .txt, .java, .html, .css");
        System.out.println("   - Content can be read and understood by humans");
        System.out.println("   - Stored as plain text using character encoding");
        System.out.println();

        System.out.println("2. BINARY FILES (Machine-readable):");
        System.out.println("   - Examples: .jpg, .exe, .mp3, .pdf");
        System.out.println("   - Content appears as gibberish to humans");
        System.out.println("   - Stored in binary format (0s and 1s)");
        System.out.println("   - More efficient for complex data structures\n");
    }

    /**
     * Explains how file systems organize files
     */
    public static void explainFileSystems() {
        System.out.println("🗂️ FILE SYSTEMS:");
        System.out.println("A file system organizes files into a hierarchical structure.");
        System.out.println("Files are stored in directories (folders) which can contain:");
        System.out.println("- Other directories (subfolders)");
        System.out.println("- Files");
        System.out.println("- Symbolic links (shortcuts)\n");

        System.out.println("Example hierarchy:");
        System.out.println("C:\\ (Root)");
        System.out.println("├── Users/");
        System.out.println("│   └── John/");
        System.out.println("│       ├── Documents/");
        System.out.println("│       │   ├── report.txt");
        System.out.println("│       │   └── images/");
        System.out.println("│       │       └── photo.jpg");
        System.out.println("│       └── Downloads/");
        System.out.println("└── Program Files/");
        System.out.println("    └── Java/");
    }
}
