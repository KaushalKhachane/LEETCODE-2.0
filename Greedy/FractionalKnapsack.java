    import java.util.Arrays;

    class Item implements Comparable<Item>{
        int wt, val;
        public Item(int wt, int val){
            this.wt = wt;
            this.val = val;
        }

        // this method sort the value/weight in descending order
        public int compareTo(Item i){
            return (wt)*(i.val) - (val*(i.wt));
        }
    }

    public class FractionalKnapsack{

        public static double fractionalKnapsack(Item arr[], int w){
            Arrays.sort(arr);
            double res = 0.0;


            for(int i = 0; i < arr.length; i++){
                // if item weight is less than or equal to current 
                // capacity then include item directly and minus the weight of that item from current capacity weight
                if(arr[i].wt <= w){
                    res = res + arr[i].val;
                    w -= arr[i].wt;
                
                }else{ // else take the fractional part of the weight from current capacity
                    res = res + arr[i].val * (double)w / (double)arr[i].wt;
                    break;
                }
            }
            return res;
        }


        public static void main(String[] args) {
            Item arr[] = {
                new Item(10,60),
                new Item(40, 40),
                new Item(20, 100),
                new Item(30,120)
            };

            int w = 50;
            System.out.println(fractionalKnapsack(arr, w));
        }
    }
