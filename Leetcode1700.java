class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int student : students){
            q.offer(student);
        }
        
        int unableEat = 0;
        int index = 0;


        while(!q.isEmpty() && index < sandwiches.length){
            int currentStud = q.poll();
            int currentEat = sandwiches[index];

            if(currentStud == currentEat){
                index++;
                unableEat = 0;
            }else{
                q.offer(currentStud);
                unableEat++;

            }

            // If all students unable to eat, break the loop
            if (unableEat == q.size()) {
                break;
            }
        }
        return q.size();

    }
}


/*
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int student : students) {
            queue.offer(student);
        }

        int unableToEat = 0;
        int currentIndex = 0;

        while (!queue.isEmpty() && currentIndex < sandwiches.length) {
            int currentStudent = queue.poll();
            int currentSandwich = sandwiches[currentIndex];

            if (currentStudent == currentSandwich) {
                currentIndex++; // Move to the next sandwich
                unableToEat = 0; // Reset unableToEat count
            } else {
                queue.offer(currentStudent); // Put the student back to the end of the queue
                unableToEat++;
            }

            // If all students unable to eat, break the loop
            if (unableToEat == queue.size()) {
                break;
            }
        }

        return queue.size(); // Number of students unable to eat

*/