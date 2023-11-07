class Solution {

    //Optimal Approach 2
    public static int longestConsecutive(int []a) {
        int n = a.length;

        if(n == 0){
            return 0;
        }

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            set.add(a[i]);
        }

        // find the longest sequence
        for(int it: set){
            // if it is starting number
            if(!set.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x + 1)){
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    //Optimal Approach 1
    // public static int longestConsecutive(int []a) {
    //     int n = a.length;
    //     if(n == 0) return 0;
    //     Arrays.sort(a);
      
    //     int lastSmallest = Integer.MIN_VALUE;
    //     int cnt = 0;
    //     int longest = 1;

    //     for(int i = 0; i < n; i++){
    //         if(a[i]-1 == lastSmallest){
    //             cnt++;
    //             lastSmallest = a[i];
    //         }else if(a[i] != lastSmallest){
    //             cnt = 1;
    //             lastSmallest = a[i];
    //         }
    //         longest = Math.max(longest, cnt);
    //     }
    //     return longest;
    // }




    //Brute Force TC O(n^2)
    // public static boolean linearSearch(int []a, int num) {
    //     int n = a.length; //size of array
    //     for (int i = 0; i < n; i++) {
    //         if (a[i] == num)
    //             return true;
    //     }
    //     return false;
    // }   
    // public static int longestConsecutive(int []a) {
    //     int n = a.length; //size of array
    //     int longest = 1;
    //     //pick a element and search for its
    //     //consecutive numbers:
    //     for (int i = 0; i < n; i++) {
    //         int x = a[i];
    //         int cnt = 1;
    //         //search for consecutive numbers
    //         //using linear search:
    //         while (linearSearch(a, x + 1) == true) {
    //             x += 1;
    //             cnt += 1;
    //         }

    //         longest = Math.max(longest, cnt);
    //     }
    //     return longest;
    // }
}