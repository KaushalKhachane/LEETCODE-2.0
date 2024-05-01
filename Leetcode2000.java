class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            // If the character ch does not exist in word, return the original word
            return word;
        } else {
            // Reverse the segment of word from index 0 to the index of the first occurrence of ch
            StringBuilder sb = new StringBuilder(word.substring(0, index + 1));
            sb.reverse();
            return sb.toString() + word.substring(index + 1);
        }
    }
}