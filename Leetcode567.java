class Solution {
    public void perm(String p, String up, ArrayList<String> res){
        if(up.isEmpty()){
            res.add(p);
            return;
        }
        //pick the first char from the UP String
        char ch = up.charAt(0);

        //iterate
        for(int i = 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            perm(f+ch+s, up.substring(1), res);
        }
        // return res;
    }
    public boolean checkInclusion(String s1, String s2) {
        ArrayList<String> res = new ArrayList<>();
        perm("", s1, res);

        for(String s:  res){
            if(s2.contains(s)){
                return true;
            } 
        }
        return false;
    }
}