public class Stock {

    static int maxProfit(int a[]){
        int start = Integer.MAX_VALUE;
        int cum = 0;
        int profit = 0;
        for(int i = 0; i < a.length - 1; i++){
            if(start > a[i]){
                start = a[i];
            }
            cum = a[i] - start;
            if(cum > profit){
                profit = cum;
            }
           
        }
        return profit;
    }
    public static void main(String[] args) {
    int arr[] = {7,1,5,3,6,4};

    int maxPro = maxProfit(arr);
    System.out.println("Max profit is: " + maxPro);
    }
}
