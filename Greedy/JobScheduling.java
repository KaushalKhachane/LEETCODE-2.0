import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;

    Job(int x, int y, int z) {
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

public class JobScheduling {
    // Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n) {
        // Your code here
        Arrays.sort(arr, new JobComparator());

        // find masDeadline within jobs
        int maxDeadline = 0;
        for (Job job : arr) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Initialize an array to keep track of available slots for each deadline.
        int slot[] = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);

        int totalProfit = 0;
        int jobsDone = 0;

        // iterate through each job
        for (int i = 0; i < n; i++) {
            Job job = arr[i];

            // Find a slot for the job starting from its deadline and moving left.
            for (int j = job.deadline; j > 0; j--) {
                if (slot[j] == -1) {
                    slot[j] = job.id;
                    totalProfit += job.profit;
                    jobsDone++;
                    break;

                }
            }
        }
        int[] result = new int[2];
        result[0] = jobsDone;
        result[1] = totalProfit;

        return result;

    }

    public static void main(String[] args) {
        Job arr[] = {
                new Job(1, 4, 20),
                new Job(2, 1, 10),
                new Job(3, 1, 40),
                new Job(4, 1, 30)
        };

        int n = arr.length;
        JobScheduling js = new JobScheduling();
        int[] res = js.JobScheduling(arr, n);

        System.out.println("Maximum Profit: " + res[1]);
        System.out.println("Number of Jobs Done: " + res[0]);
    }
}

class JobComparator implements Comparator<Job> {
    // @override
    public int compare(Job j1, Job j2) {
        // arrange jobs in descending order of their profit
        return j2.profit - j1.profit;
    }
}