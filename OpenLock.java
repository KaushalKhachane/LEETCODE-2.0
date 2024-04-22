import java.util.*;

public class OpenLock {
    public int openLock(String[] deadends, String target) {
        Set<String> deadSet = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        
        // Add initial state to queue
        queue.offer("0000");
        visited.add("0000");
        
        int moves = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            // Explore all nodes at current level
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                
                // Check if current state is the target
                if (current.equals(target)) {
                    return moves;
                }
                
                // Skip if current state is a dead end
                if (deadSet.contains(current)) {
                    continue;
                }
                
                // Generate next possible states by rotating each wheel
                for (int j = 0; j < 4; j++) {
                    for (int k = -1; k <= 1; k += 2) {
                        char[] nextState = current.toCharArray();
                        // Rotate the wheel
                        nextState[j] = (char)(((nextState[j] - '0') + k + 10) % 10 + '0');
                        String nextStr = new String(nextState);
                        
                        // Add to queue if not visited or a dead end
                        if (!visited.contains(nextStr) && !deadSet.contains(nextStr)) {
                            queue.offer(nextStr);
                            visited.add(nextStr);
                        }
                    }
                }
            }
            
            moves++; // Increment moves for each level
        }
        
        return -1; // If target not reached
    }

    public static void main(String[] args) {
        OpenLock openLock = new OpenLock();
        String[] deadends = {"0201","0101","0102","1212","2002"};
        String target = "0202";
        int result = openLock.openLock(deadends, target);
        System.out.println("Minimum turns required: " + result);
    }
}
