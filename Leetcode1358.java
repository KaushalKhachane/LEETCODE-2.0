class Solution {
    public int numberOfSubstrings(String s) {
        // int hash[] = new int[3];
        // int count = 0;

        // for(int i = 0; i < s.length(); i++){
        //     for(int k = 0; k < hash.length; k++){
        //         hash[k] = 0;
        //     }

        //     for(int j = i; j < s.length(); j++){
        //         hash[s.charAt(j)-'a']++;
        //         if(hash[0] > 0 && hash[1] > 0 && + hash[2] > 0){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        int []lastscene = new int[3];
        Arrays.fill(lastscene, -1);

        int count = 0;

        for(int i = 0; i < s.length(); i++){
            lastscene[s.charAt(i) - 'a'] = i;
            if(lastscene[0] != -1 && lastscene[1] != -1 && lastscene[2] != -1){
                count += 1 + Math.min(lastscene[0], Math.min(lastscene[1], lastscene[2]));
            }
        }
        return count;
    }
}