//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

public class StockSpanUsingStack
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();x
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends



class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<Integer> s = new Stack<Integer>();
        s.push(0);
        int[] span = new int[n];
        span[0] = 1;
        
        
        for(int i = 1; i < price.length; i++){
            while(!s.empty() && price[s.peek()] <= price[i]){
                s.pop();
            }
            
            span[i] = s.empty() ? i+1 : i - s.peek();   
            s.push(i);
        }
        
        return span;
    }
    
}