import java.util.HashMap;

public class DebugVisualizerExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);


        // Place a breakpoint here ↓
        System.out.println("Pause here for Debug Visualizer"); 

        // Keep the program running to inspect variables
        try {
            Thread.sleep(5000); // Keeps the debugger active for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
