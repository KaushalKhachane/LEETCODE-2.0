class Solution {
    public int reverse(int x) {
        boolean negativeNumber = false;
        int result = 0;
        if (x < 0) {
            x = x * (-1);
            if (x < 0) {
                return 0;
            }
            negativeNumber = true;
        }
        while (x >= 0) {
            if (result > 214748364){
                return 0;
            }
            if (x >= 10) {
                int x1 = x % 10;
                x = x / 10;
                result = (result * 10) + x1;
            } else {
                result = (result * 10) + x;
                x = -1;
            }
        }
        if (negativeNumber) {
            result = result * (-1);
        }
        return result;
        
    }
}