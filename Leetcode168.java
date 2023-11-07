class Solution {
    public String convertToTitle(int col) {
        StringBuilder sb = new StringBuilder();

        while(col > 0){
            int r = (col-1) % 26;
            sb.append((char)(r+'A'));
            System.out.println(sb);
            col = (col-1) /26;
        }

        return sb.reverse().toString();
    }
}