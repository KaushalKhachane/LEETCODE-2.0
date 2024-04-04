class Solution {
    public int totalFruit(int[] fruit) {
        // int maxLen = 0;
        // for(int i = 0; i < fruits.length; i++){
        //     Set<Integer> s = new HashSet<>();
        //     for(int j = i; j < fruits.length; j++){
        //         s.add(fruits[j]);
        //         if(s.size() <= 2){
        //             maxLen = Math.max(maxLen, j - i +1);
        //         }else{
        //             break;
        //         }
        //     }
        // }
        // return maxLen;

        int l = 0; int r = 0, maxlen = 0;
        Map<Integer, Integer> m = new HashMap<>();
        int i = 0;

        while(i < fruit.length){
            m.put(fruit[i], m.getOrDefault(fruit[i],0)+1);
            if(m.size() > 2){
                m.put(fruit[l],m.get(fruit[l])-1);
                if(m.get(fruit[l]) == 0){
                    m.remove(fruit[l]);
                }
                l++;
            }
            if(m.size() <= 2){
                    maxlen = Math.max(maxlen, i - l + 1);
                }
            i++;
        }
        return maxlen;

    }
}