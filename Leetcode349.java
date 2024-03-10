class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s = new HashSet<>();
        for(int e: nums1){
            s.add(e);
        }

        ArrayList<Integer> res= new ArrayList<>();

        for(int ele: nums2){
            if(s.contains(ele)){
                res.add(ele);
                s.remove(ele);
            }
        }

        int finalres[] = new int[res.size()];
        for(int i = 0; i < res.size(); i++){
            finalres[i] = res.get(i);
        }

        return finalres;
    }
}