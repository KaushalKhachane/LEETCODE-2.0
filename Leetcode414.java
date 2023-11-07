class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        HashSet<Integer> distinctEle = new HashSet<>();

        for(int ele: nums){
            if(!distinctEle.contains(ele)){
                distinctEle.add(ele);
                pQ.offer(ele);

                if(pQ.size() > 3){
                    pQ.poll();
                }
            }
        }

        if(pQ.size() == 2){
            pQ.poll();
        }

        return pQ.peek();

        
    }
}