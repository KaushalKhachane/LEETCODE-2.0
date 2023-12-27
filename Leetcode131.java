class Solution {
    boolean isPalindrome(String str, int s, int e){
        while(s <= e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    void partitionHelper(int ind, String s, List<String> path, List<List<String>> res){
        if(ind == s.length()){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = ind; i < s.length(); i++){
            if(isPalindrome(s, ind, i)){
                path.add(s.substring(ind, i+1));
                partitionHelper(i+1, s, path, res);
                //backtrack 
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp =  new ArrayList<>();
        partitionHelper(0, s, temp, res);
        return res;
    }
}