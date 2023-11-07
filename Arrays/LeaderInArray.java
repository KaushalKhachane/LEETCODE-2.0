public class LeaderInArray {

    // tc(n square)
    public static void leader(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // order of n
    public static void leaderArray(int arr[]) {
        // last element is always leader
        int currentLeader = arr[arr.length - 1];
        System.out.print(currentLeader + " ");

        // keep track of current leader and check if the arr[i] > current leader if it
        // then only print it
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > currentLeader) {
                System.out.print(arr[i] + " ");
                currentLeader = arr[i];
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 0, 0, 30, 500, 40, 120, 100 };
        leader(arr);
        System.out.println();
        leaderArray(arr);
    }
}
