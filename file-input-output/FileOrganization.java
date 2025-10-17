/**
 * File Organization - Java Tutorial
 *
 * This program explains different methods of organizing data in files.
 * File organization determines how efficiently data can be stored and retrieved.
 *
 * Author: Laurence Cabizares Lo
 * Topic: File Organization
 *
 * Key Learning Points:
 * - Sequential Organization: Simple but slow for random access
 * - Random Access Organization: Fast random access but complex
 * - Indexed Sequential: Combines benefits of both approaches
 * - Choice depends on the specific use case and access patterns
 */

public class FileOrganization {

    public static void main(String[] args) {
        System.out.println("=== File Organization Methods ===\n");

        // Explain different file organization methods
        explainSequentialOrganization();
        explainRandomAccessOrganization();
        explainIndexedSequentialOrganization();
    }

    /**
     * Explains Sequential File Organization
     * Records are stored in a specific order (like alphabetical or numerical)
     * Simple to implement but requires scanning for specific records
     */
    public static void explainSequentialOrganization() {
        System.out.println("📋 SEQUENTIAL ORGANIZATION:");
        System.out.println("Records are stored in a specific order, such as by a key field.");
        System.out.println("This is the simplest form of file organization to implement.");
        System.out.println();

        System.out.println("Characteristics:");
        System.out.println("✓ Simple to implement and understand");
        System.out.println("✓ Efficient for bulk operations (reading all records)");
        System.out.println("✓ Good for reports and batch processing");
        System.out.println("✗ Slow for random access (finding specific records)");
        System.out.println("✗ Requires scanning from the beginning to find records");
        System.out.println();

        System.out.println("Example: Student Records stored by Student ID:");
        System.out.println("Record 1: ID=1001, Name=Alice, Grade=A");
        System.out.println("Record 2: ID=1002, Name=Bob, Grade=B");
        System.out.println("Record 3: ID=1003, Name=Charlie, Grade=A");
        System.out.println("To find Bob (ID=1002), you scan from record 1 to record 2.");
        System.out.println();
    }

    /**
     * Explains Random Access (Direct Access) Organization
     * Records are stored at calculated addresses for fast direct access
     * Like having a street address for each record
     */
    public static void explainRandomAccessOrganization() {
        System.out.println("🎯 RANDOM ACCESS ORGANIZATION:");
        System.out.println("Records are stored at specific locations that can be calculated from a key field.");
        System.out.println("This allows for very fast access to any specific record.");
        System.out.println();

        System.out.println("Characteristics:");
        System.out.println("✓ Very fast random access (constant time lookup)");
        System.out.println("✓ No need to scan through other records");
        System.out.println("✓ Efficient for databases with frequent random queries");
        System.out.println("✗ More complex to implement");
        System.out.println("✗ Can waste space due to fixed record sizes");
        System.out.println("✗ Requires predictable key distribution");
        System.out.println();

        System.out.println("Example: Hash Table Storage");
        System.out.println("Key: 1001 → Address: hash(1001) = 45 → Go directly to position 45");
        System.out.println("Key: 1002 → Address: hash(1002) = 78 → Go directly to position 78");
        System.out.println("Key: 1003 → Address: hash(1003) = 12 → Go directly to position 12");
        System.out.println();
    }

    /**
     * Explains Indexed Sequential Access Method (ISAM)
     * Combines sequential storage with an index for fast lookups
     * Like having a table of contents in a book
     */
    public static void explainIndexedSequentialOrganization() {
        System.out.println("📖 INDEXED SEQUENTIAL ACCESS METHOD (ISAM):");
        System.out.println("A hybrid approach that combines sequential and random access.");
        System.out.println("Records are stored sequentially, but an index speeds up access.");
        System.out.println();

        System.out.println("Characteristics:");
        System.out.println("✓ Good balance between simplicity and performance");
        System.out.println("✓ Supports both sequential and random access");
        System.out.println("✓ Index provides fast lookups");
        System.out.println("✓ Sequential storage is space-efficient");
        System.out.println("✗ Index requires additional storage space");
        System.out.println("✗ Index maintenance adds complexity");
        System.out.println();

        System.out.println("Structure:");
        System.out.println("Main File (Sequential):");
        System.out.println("  Record 1: ID=1001, Name=Alice, Grade=A");
        System.out.println("  Record 2: ID=1002, Name=Bob, Grade=B");
        System.out.println("  Record 3: ID=1003, Name=Charlie, Grade=A");
        System.out.println();

        System.out.println("Index (Key → Position):");
        System.out.println("  1001 → Position 1");
        System.out.println("  1002 → Position 2");
        System.out.println("  1003 → Position 3");
        System.out.println();

        System.out.println("Access Pattern:");
        System.out.println("1. Look up key in index (fast)");
        System.out.println("2. Go directly to record position");
        System.out.println("3. Read the record");
        System.out.println();
    }

    /**
     * Demonstrates how to choose the right file organization method
     */
    public static void demonstrateChoosingOrganization() {
        System.out.println("🤔 CHOOSING THE RIGHT ORGANIZATION:");
        System.out.println("The choice depends on your application's needs:");
        System.out.println();

        System.out.println("Use Sequential when:");
        System.out.println("- You mostly read/write files completely");
        System.out.println("- Simple implementation is preferred");
        System.out.println("- Storage space is limited");
        System.out.println();

        System.out.println("Use Random Access when:");
        System.out.println("- Fast lookups are critical");
        System.out.println("- You frequently search for specific records");
        System.out.println("- Key distribution is predictable");
        System.out.println();

        System.out.println("Use Indexed Sequential when:");
        System.out.println("- You need both sequential and random access");
        System.out.println("- You're willing to trade some complexity for performance");
        System.out.println("- Memory for index is available");
    }
}
