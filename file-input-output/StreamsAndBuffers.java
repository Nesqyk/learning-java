/**
 * Streams and Buffers - Java Tutorial
 *
 * This program explains the fundamental concepts of streams and buffers in Java I/O.
 * Understanding these concepts is crucial for efficient file operations.
 *
 * Author: Shainey Selgas
 * Topic: Streams and Buffers
 *
 * Key Learning Points:
 * - Streams are sequences of data flowing from source to destination
 * - Input streams read data, output streams write data
 * - Byte streams handle binary data, character streams handle text
 * - Buffers improve I/O performance by reducing system calls
 * - BufferedReader and BufferedWriter are essential for efficient text I/O
 */

public class StreamsAndBuffers {

    public static void main(String[] args) {
        System.out.println("=== Streams and Buffers in Java ===\n");

        // Explain streams concepts
        explainStreams();
        explainBuffers();
        demonstrateStreamTypes();
    }

    /**
     * Explains the fundamental concept of streams in Java I/O
     */
    public static void explainStreams() {
        System.out.println("🌊 UNDERSTANDING STREAMS:");
        System.out.println("A stream is a sequence of data that flows from a source to a destination.");
        System.out.println("Think of it like water flowing through a pipe.");
        System.out.println();

        System.out.println("Stream Types:");
        System.out.println("1. Input Stream: Reads data FROM a source (file, network, keyboard)");
        System.out.println("2. Output Stream: Writes data TO a destination (file, network, screen)");
        System.out.println();

        System.out.println("Stream Categories:");
        System.out.println("1. Byte Streams: Handle binary data (8-bit bytes)");
        System.out.println("   - Used for images, audio, video, or any binary files");
        System.out.println("   - Classes: InputStream, OutputStream");
        System.out.println();

        System.out.println("2. Character Streams: Handle text data (16-bit Unicode characters)");
        System.out.println("   - Used for text files, human-readable content");
        System.out.println("   - Classes: Reader, Writer");
        System.out.println();
    }

    /**
     * Explains how buffers improve I/O performance
     */
    public static void explainBuffers() {
        System.out.println("🗂️ UNDERSTANDING BUFFERS:");
        System.out.println("A buffer is a temporary storage area in memory that holds data.");
        System.out.println("Buffers improve I/O performance by reducing expensive system calls.");
        System.out.println();

        System.out.println("How Buffering Works:");
        System.out.println("1. Without buffer: Each read/write operation calls the OS");
        System.out.println("2. With buffer: Data is read/written in larger chunks");
        System.out.println("3. System calls happen less frequently");
        System.out.println();

        System.out.println("Performance Impact:");
        System.out.println("✓ Reduces the number of I/O operations");
        System.out.println("✓ Improves overall application performance");
        System.out.println("✓ Especially beneficial for network and file I/O");
        System.out.println("✗ Uses more memory (trade-off for speed)");
        System.out.println();

        System.out.println("Common Buffered Classes:");
        System.out.println("- BufferedReader: Efficient text reading with readLine()");
        System.out.println("- BufferedWriter: Efficient text writing with newLine()");
        System.out.println("- BufferedInputStream: Efficient binary data reading");
        System.out.println("- BufferedOutputStream: Efficient binary data writing");
        System.out.println();
    }

    /**
     * Demonstrates different types of streams and their use cases
     */
    public static void demonstrateStreamTypes() {
        System.out.println("📝 STREAM USE CASES:");

        System.out.println("1. File Streams:");
        System.out.println("   - FileInputStream/FileOutputStream: Binary file I/O");
        System.out.println("   - FileReader/FileWriter: Text file I/O");
        System.out.println("   - Use case: Reading/writing local files");
        System.out.println();

        System.out.println("2. Memory Streams:");
        System.out.println("   - ByteArrayInputStream/ByteArrayOutputStream: In-memory data");
        System.out.println("   - CharArrayReader/CharArrayWriter: In-memory text");
        System.out.println("   - Use case: Manipulating data without files");
        System.out.println();

        System.out.println("3. Network Streams:");
        System.out.println("   - Socket.getInputStream()/Socket.getOutputStream()");
        System.out.println("   - Use case: Client-server communication");
        System.out.println();

        System.out.println("4. System Streams:");
        System.out.println("   - System.in: Standard input (keyboard)");
        System.out.println("   - System.out: Standard output (console)");
        System.out.println("   - System.err: Standard error (error messages)");
        System.out.println();

        System.out.println("5. Compressed Streams:");
        System.out.println("   - GZIPInputStream/GZIPOutputStream: Compressed data");
        System.out.println("   - Use case: Reducing file sizes for storage/transmission");
        System.out.println();

        System.out.println("💡 Best Practice:");
        System.out.println("Always use buffered streams for file I/O:");
        System.out.println("  ❌ FileReader reader = new FileReader(\"file.txt\");");
        System.out.println("  ✅ BufferedReader reader = new BufferedReader(new FileReader(\"file.txt\"));");
    }

    /**
     * Demonstrates the performance difference between buffered and unbuffered I/O
     */
    public static void demonstrateBufferingBenefits() {
        System.out.println("\n⚡ BUFFERING PERFORMANCE DEMONSTRATION:");
        System.out.println("Without buffering:");
        System.out.println("- Each character read requires a system call");
        System.out.println("- 1000 character file = 1000 system calls");
        System.out.println("- High system overhead");
        System.out.println();

        System.out.println("With buffering:");
        System.out.println("- Characters read in chunks (e.g., 8192 bytes)");
        System.out.println("- 1000 character file = 1 system call");
        System.out.println("- Much lower system overhead");
        System.out.println();

        System.out.println("Performance Improvement:");
        System.out.println("- Can be 10-100x faster for file I/O");
        System.out.println("- Especially noticeable with large files");
        System.out.println("- Network I/O benefits even more");
    }
}
