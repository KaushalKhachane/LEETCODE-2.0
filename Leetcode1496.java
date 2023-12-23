class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int x = 0;
        int y = 0;
        set.add(0+" "+0);

        for(char c : path.toCharArray()){
            if(c == 'N'){
                y++;
            }else if(c == 'E'){
                x++;
            }else if(c == 'S'){
                y--;
            }else{
                x--;
            }
            String pos = x + " " + y;

            if(set.contains(pos)){
                return true;
            }
            set.add(pos);
        } 
        return false;
    }
}