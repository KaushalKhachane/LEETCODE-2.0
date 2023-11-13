class Solution {
    public String sortVowels(String s) {
        List<Character> vowel= new ArrayList();
        for(int i = 0; i< s.length(); i++){
            if(isVowel(s.charAt(i)))
                vowel.add(s.charAt(i));
        }

         Collections.sort(vowel);
         StringBuilder sb = new StringBuilder(s);
         int j = 0;
            for(int i = 0; i< s.length(); i++){
             if (isVowel(s.charAt(i))){
                    char newChar=vowel.get(j++);
                    sb.setCharAt(i, newChar);
                }
            }
            return sb.toString();
        }
        private boolean isVowel(char c){
            if (Character.toLowerCase(c)=='a' ||
                Character.toLowerCase(c)=='e' ||
                Character.toLowerCase(c)=='i' ||
                Character.toLowerCase(c)=='o' ||
                Character.toLowerCase(c)=='u')
            return true;
            return false;
        }
    }