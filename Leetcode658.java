class Solution {
    public List<Integer> findClosestElements(int[] a, int k, int x) {
        int n = a.length;
        int l = 0;
        int r = n -1;

        while(r - l + 1 > k){
            if(Math.abs(a[l]-x) <= Math.abs(a[r]-x)){
                r--;
            }else{
                l++;
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i = l; i <= r; i++){
            list.add(a[i]);
        }

        return list;

    }
}