class Leetcode242 {
    final int CHAR = 256;
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()){
           return false;
       }
       int count[] = new int[CHAR];
       for(int i = 0; i < s.length(); i++){
           count[s.charAt(i)]++;
           count[t.charAt(i)]--;
       }

       for(int i = 0; i < CHAR; i++){
           if(count[i] != 0){
               return false;
           }
       }

       return true;
    }
    public static void main(String[] args) {
        Leetcode242 obj = new Leetcode242();

        System.out.println(obj.isAnagram("kau","uak"));
    }
}


// class Solution {
//     final int NUM_LETTERS = 26;

//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }

//         int[] countS = new int[NUM_LETTERS];
//         int[] countT = new int[NUM_LETTERS];

//         for (int i = 0; i < s.length(); i++) {
//             countS[s.charAt(i) - 'a']++;
//             countT[t.charAt(i) - 'a']++;
//         }

//         for (int i = 0; i < NUM_LETTERS; i++) {
//             if (countS[i] != countT[i]) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }