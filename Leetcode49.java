
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        Map<Map<Character, Integer>, List<String>> mapofmap = new HashMap<>();

        for(String word : strs){
            Map<Character, Integer> charCountKey = new HashMap<>();

            for(char c : word.toCharArray()){
                charCountKey.put(c, charCountKey.getOrDefault(c,0)+1);
            }

            if(!mapofmap.containsKey(charCountKey)){
                mapofmap.put(charCountKey, new ArrayList<>());
            }

            mapofmap.get(charCountKey).add(word);

        }

        return new ArrayList<>(mapofmap.values());

        // Map<String, List<String>> map = new HashMap<>();

        // for(String word : strs){
        //     char[] chars = word.toCharArray();
        //     Arrays.sort(chars);
        //     String sortedWord = new String(chars);

        //     if(!map.containsKey(sortedWord)){
        //         map.put(sortedWord, new ArrayList<>());
        //     }
        //     map.get(sortedWord).add(word);
        // }    

        // return new ArrayList<>(map.values());    
    }
}