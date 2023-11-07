public class ReverseStringWords {
    public String reverseWords(String s) {
        String result = new String();
        int n = s.length();
        int i = 0;

        while(i < n){
            while(s.charAt(i) == ' ' && i < n){
                i++;
            }
            if(i >= n) break;
            int j = i +1;
            while(j < n &&  s.charAt(j) != ' '){
                j++;
            }
            String sub = s.substring(i,j);
            if(result.length() == 0){
                result = sub;
            }else{
                result = sub + " " + result;
            }
            i = j + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        ReverseStringWords obj = new ReverseStringWords();
        String res = obj.reverseWords("Kaushal Khachane");
        System.out.println("res: "+res);
    }
}