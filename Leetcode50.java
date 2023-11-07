class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long  nn = n;

        if(nn < 0) nn = -1 * nn;

        while(nn > 0){
            //if nn is odd then ans = x * ans and decrement nn by 
            if(nn % 2 == 1){
                ans = x * ans;
                nn = nn - 1; 
            }else{ // if nn is even 
                x = x * x;
                nn = nn / 2;
            }
        }
        //if n s negative then simply 1/ans (reciprocal)
        if(n  < 0){
            ans = (double)1.0 / (double)(ans);
        }
        return ans;

    }
}