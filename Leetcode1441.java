class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int curr = 1;
        for(int i = 0; i < target.length; i++){
            if(curr > n){
                break;
            }
           if(target[i] == curr){
               result.add("Push");
               curr++;
           }else{
               result.add("Push");
               result.add("Pop");
               curr++;
           }
        }
        return result;
    }
}