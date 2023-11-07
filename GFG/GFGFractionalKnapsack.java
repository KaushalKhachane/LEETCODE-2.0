//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}
// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class ItemComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        // Calculate value-to-weight ratios for both items
        double ratio1 = (double) item1.value / item1.weight;
        double ratio2 = (double) item2.value / item2.weight;

        // Compare based on the value-to-weight ratio
        if (ratio1 < ratio2) {
            return 1;  // item2 should come before item1
        } else if (ratio1 > ratio2) {
            return -1; // item1 should come before item2
        } else {
            return 0;  // They have the same ratio
        }
    }
}

class Solution
{
    //Function to get the maximum total value in the knapsack. 
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        double res = 0.0;
        Arrays.sort(arr, new ItemComparator());
        
        for(int i = 0; i < n; i++){
            if(arr[i].weight <= W){
                res += arr[i].value;
                W -= arr[i].weight;
            }else{
                res += arr[i].value * (double)W / arr[i].weight;
                break;
            }
        }
        
        return res;
        
        
    }
}