public class KnapsackRecursive {

    public static int knapsack(int[] weights, int[] values, int capacity, int n) {
        // Base case: if either the capacity or the number of items is 0, return 0
        if (n == 0 || capacity == 0) {
            return 0;
        }

        // If the weight of the current item is more than the remaining capacity,
        // then this item cannot be included in the optimal solution
        if (weights[n - 1] > capacity) {
            return knapsack(weights, values, capacity, n - 1);
        }

        // Return the maximum of two cases:
        // 1. The nth item is included
        // 2. The nth item is not included
        else {
            return Math.max(
                values[n - 1] + knapsack(weights, values, capacity - weights[n - 1], n - 1),
                knapsack(weights, values, capacity, n - 1)
            );
        }
    }

    public static void main(String[] args) {
        int[] values = {60, 100, 120};
        int[] weights = {10, 20, 30};
        int capacity = 50;
        int n = values.length;

        int maxValue = knapsack(weights, values, capacity, n);
        System.out.println("Maximum value that can be obtained: " + maxValue);
    }
}
