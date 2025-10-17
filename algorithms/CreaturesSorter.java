package algo_exercise;

/**
 * Author: Tabornal, Tyrone M.
 * Description: Something
 * Activity:
 */
import java.util.Scanner;


public class CreaturesSorter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] creatures = new int[N];
        
        for(int i = 0; i < N; i++) {
            creatures[i] = s.nextInt();
        }

        int[] zombies = new int[N];
        int[] vampires = new int[N];
        int zombieCount = 0;
        int vampireCount = 0;

        for(int power : creatures) {
            if(power % 2 == 0) {
                zombies[zombieCount++] = power;
            } else {
                vampires[vampireCount++] = power;
            }
        }

        // Insertion sort for zombies
        for(int i = 1; i < zombieCount; i++) {
            int temp = zombies[i];
            int j = i - 1;
            while(j >= 0 && zombies[j] > temp) {
                zombies[j + 1] = zombies[j];
                j--;
            }
            zombies[j + 1] = temp;
        }

        // Insertion sort for vampires
        for(int i = 1; i < vampireCount; i++) {
            int temp = vampires[i];
            int j = i - 1;
            while(j >= 0 && vampires[j] > temp) {
                vampires[j + 1] = vampires[j];
                j--;
            }
            vampires[j + 1] = temp;
        }

        int totalZombie = 0;
        int totalVampire = 0;

        for(int i = 0; i < zombieCount; i++) {
            totalZombie += zombies[i];
        }

        for(int i = 0; i < vampireCount; i++) {
            totalVampire += vampires[i];
        }

        // Print sorted zombies
        for(int i = 0; i < zombieCount; i++) {
            System.out.print(zombies[i] + " ");
        }
        System.out.print(totalZombie + " ");

        // Print sorted vampires
        for(int i = 0; i < vampireCount; i++) {
            System.out.print(vampires[i] + " ");
        }
        System.out.print(totalVampire);
    }
    
}
