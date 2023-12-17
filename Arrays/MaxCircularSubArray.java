    public class MaxCircularSubArray {

        public static int Kadans(int arr[], int size) {
            int maxSum = arr[0];
            int currentSum = 0;

            if (size == 0) {
                return 0;
            }
            if (size == 1) {
                return arr[0];
            }

            for (int i = 1; i < size; i++) {
                currentSum += arr[i];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                if (currentSum < 0) {
                    currentSum = 0;
                }

                maxSum = Math.max(currentSum, maxSum);
                // System.out.print(maxSum+ " ");
            }
            return maxSum;
        }

        public static void main(String[] args) {
            // int arr[] = { 2, 4, 7, 11, 14, 16, 20, 21 };
            // int arr[] = { 4, -4, 6, -6, 10, -11, 12 };
            // int arr[] = {1,2,-3,-2,6};
            int arr[] = {1,2,3,-3,-2};


            int nonWrapSum = Kadans(arr, arr.length);
            System.out.println("non wrap sum:"+nonWrapSum);

            int totalSum = 0;
            for (int i = 0; i < arr.length; i++) {
                totalSum += arr[i];
                arr[i] = -arr[i];
                // System.out.println(arr[i]); // 11
            }
            System.out.println("Total sum: " + totalSum);

            int wrapSum = totalSum + Kadans(arr, arr.length);
            System.out.println("reverse kadans: "+Kadans(arr, arr.length));
            System.out.println("wrap sum:"+wrapSum);
            System.out.println(Math.max(nonWrapSum, wrapSum));
        }
    }
