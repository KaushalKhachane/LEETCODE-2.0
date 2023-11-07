class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res = 'a';
        int low = 0;
        int high = letters.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(letters[mid] > target){
                res = letters[mid];
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        if(res <= target){
            return letters[0];
        }

        return res;
    }
}