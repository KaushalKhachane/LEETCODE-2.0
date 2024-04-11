class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(k >= n) return "0";
        
        Stack<Character> s = new Stack<>();
        for(char digit : num.toCharArray()){
            while(k > 0 && !s.isEmpty() && s.peek() > digit){
                s.pop();
                k--;
            }
            s.push(digit);
        }

        while(k > 0){
            s.pop();
            k--;
        }

        //build String back
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.insert(0, s.pop());
        }

        //remove trailing zero's
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}