class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
         int time = 0;
         while(true){
             for(int i = 0; i < tickets.length; i++){
                 if(tickets[i] > 0){
                     tickets[i]--;
                     time++;
                 }
                 if(tickets[k] == 0){
                     return time;
                 }
             }
         }
         
         // return time;  as while loop is running till true so this statement is unreachable so return true inside while loop only insted of break the loop and return time.
     }
 }
 
 /* 
         
 
 
         ==
         int total=0;
         while (true){
             for(int i=0;i<tickets.length;i++){
                 if(tickets[i]>0){
                     tickets[i]--;
                     total++;
                 }
                 if(tickets[k]==0){
                     return total;
                 }
 
             }
         }
 
 */