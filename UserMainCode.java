import java.util.*;

public class UserMainCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of persons:");
        int input1 = scanner.nextInt(); // Number of persons
        int[] input2 = new int[input1]; // Array to store salaries
        
        System.out.println("Enter the salaries of each person:");
        // Input salaries of each person
        for (int i = 0; i < input1; i++) {
            input2[i] = scanner.nextInt();
        }
        
        // Create an object of UserMainCode class
        UserMainCode userMainCode = new UserMainCode();
        
        // Call the findMinimumNotes method and store the result
        int result = userMainCode.findMinimumNotes(input1, input2);
        
        // Output the minimum number of notes required
        System.out.println("Minimum number of notes required: " + result);
        
        scanner.close();
    }
    
    // public int findMinimumNotes(int input1, int[] input2) {
    //     int minNotes = Integer.MAX_VALUE;
    //     for (int i = 0; i < input1; i++) {
    //         int totalNotes = 0;
    //         int modifiedSalary = input2[i];
    //         for (int j = 0; j < input1; j++) {
    //             totalNotes += input2[j] / modifiedSalary;
    //             if (input2[j] % modifiedSalary != 0) {
    //                 totalNotes++;
    //             }
    //         }
    //         minNotes = Math.min(minNotes, totalNotes);
    //     }
    //     return minNotes;
    // }

    public static int findMinimumNotes(int input1, int[] input2) {
        if (input1 == 0) return 0;
        if (input1 == 1) return 1; // Only one person, so only one note needed regardless of its value.

        // Initial GCD of the first two salaries.
        int gcd = findGCD(input2[0], input2[1]);

        // Finding GCD of all salaries.
        for (int i = 2; i < input1; i++) {
            gcd = findGCD(gcd, input2[i]);
        }

        // Trying to adjust one salary to see if we can get a better (higher) GCD.
        int maxGCD = gcd;
        for (int i = 0; i < input1; i++) {
            for (int adjust = -1; adjust <= 1; adjust += 2) {
                int adjustedSalary = input2[i] + adjust;
                int tempGCD = adjustedSalary;
                for (int j = 0; j < input1; j++) {
                    if (i == j) continue; // Skip the adjusted salary.
                    tempGCD = findGCD(tempGCD, input2[j]);
                }
                maxGCD = Math.max(maxGCD, tempGCD);
            }
        }

        // Calculating the minimum number of notes needed with the optimal GCD.
        int notes = 0;
        for (int salary : input2) {
            notes += (salary / maxGCD);
        }

        return notes;
    }

    private static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}