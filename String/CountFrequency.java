public class CountFrequency{
    public static void countFreq(String str){
        int count[] = new int[26];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)-'a']++;
        }
        for(int i=0; i<count.length; i++){
            if(count[i] > 0){
                System.out.println((char)(i+'a')+" "+count[i]);
            }
        }
    }
    public static void main(String[] args) {
        countFreq("geeksforgeeks");
    }
}