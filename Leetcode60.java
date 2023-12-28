class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();

        // add all the numbers in arraylist numbers
        for(int i = 1; i < n; i++){
            fact = fact * i;
            numbers.add(i);
        }
        numbers.add(n);

        String ans = "";
        k = k - 1;

        while(true){
            if(fact == 0){
                ans = ans + "" + numbers.get(0);
                numbers.remove(0);
            }else{
                ans = ans + "" + numbers.get(k / fact);
                numbers.remove(k / fact);
            }
            

            if(numbers.size() == 0){
                break;
            }
            k = k % fact;
            fact = fact / numbers.size();
        }

        return ans;
    }
}