public class Solution {
    public boolean checkValidString(String s) {
        int leftMin = 0, leftMax = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftMin++;
                leftMax++;
            } else if (c == ')') {
                leftMin--;
                leftMax--;
            } else {
                leftMin--;
                leftMax++;
            }
            if (leftMax < 0) return false;
            if (leftMin < 0) leftMin = 0;
        }
        
        return leftMin == 0;
    }
}


// class Solution {
//     public boolean checkValidString(String s) {
//         int star = 0;
//         Stack<Character> stack = new Stack<>();

//         for(int i = 0; i < s.length(); i++){
//             Character c = s.charAt(i);
//             if(c == '('){
//                 stack.push(c);
//             } else if(c == ')'){
//                 if(!stack.isEmpty()){
//                     stack.pop();
//                 } else if (star > 0) {
//                     star--; // Consume a star if there's no opening parenthesis to match
//                 } else {
//                     return false; // Unmatched closing parenthesis, no star to match
//                 }
//             } else if(c == '*'){
//                 star++;
//             }
//         }

//         // Iterate through the stack and consume stars for unmatched opening parenthesis
//         while (!stack.isEmpty() && star > 0) {
//             stack.pop();
//             star--;
//         }

//         return stack.isEmpty();
//     }
// }
