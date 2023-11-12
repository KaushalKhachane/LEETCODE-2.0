class Solution {
    public boolean rotateString(String s, String goal) {
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(0);
           s=s.substring(1)+ch;
           if(s.equals(goal))
           return true;
       }
       return false;
    }
}