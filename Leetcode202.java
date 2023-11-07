class Solution {

    public static int sum_of_square(int num){
        int sum = 0;
        while(num > 0){
            int d =  num % 10;
            sum += d*d;
            num /= 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {

        if(n <= 0){
            return false;
        }

        int slow_sum =  n;
        int fast_sum = sum_of_square(n);

        if(slow_sum ==1 || fast_sum == 1){
            return true;
        }

        while(slow_sum != fast_sum){
            slow_sum = sum_of_square(slow_sum);
            fast_sum = sum_of_square(sum_of_square(fast_sum));
            if(slow_sum ==1 || fast_sum == 1){
                return true;
            }
        }
        return false;
    
        // if(n <= 0){
        //     return false;
        // }

        // Set<Integer> set = new HashSet<>();
        
        // while(!set.contains(n)){
        //     set.add(n);
        //     n = sum_of_square(n);
        //     if(n == 1){
        //         return true;
        //     }
        // }
        // return false;
    }
}