import java.util.Arrays;

public record MazeAllPath() {
    static int count = 0;
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, true, true}
,           {true, true, true}
        };
        // getAllMazePath("", maze, 0, 0);
        int [][]path = new int[maze.length][maze[0].length];
        getAllMazePathPrint("", maze, 0, 0, path, 1);
        System.out.println("Ways: "+ count);
    }

    public static void getAllMazePath(String p, boolean maze[][], int r, int c) {
        if ((r == maze.length - 1) && (c == maze[0].length - 1)) {
            System.out.println(p);
            count++;
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering the block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            getAllMazePath(p + "D", maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            getAllMazePath(p + "R", maze, r, c + 1);
        }

        if (r > 0) {
            getAllMazePath(p + "U", maze, r - 1, c);
        }

        if (c > 0) {
            getAllMazePath(p + "L", maze, r, c - 1);
        }

        // this line is where the func will over
        // before the function about to over this func will revert back the changes made
        // by this function call
        maze[r][c] = true;
    }


    // print the actual matrix that is path taken from start to end 
    public static void getAllMazePathPrint(String p, boolean maze[][], int r, int c, int path[][], int step) {
        if ((r == maze.length - 1) && (c == maze[0].length - 1)) {
            for(int arr[]: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            count++;
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering the block in my path
        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            getAllMazePathPrint(p + "D", maze, r + 1, c, path, step+1);
        }

        if (c < maze[0].length - 1) {
            getAllMazePathPrint(p + "R", maze, r, c + 1, path, step+1);
        }

        if (r > 0) {
            getAllMazePathPrint(p + "U", maze, r - 1, c, path, step+1);
        }

        if (c > 0) {
            getAllMazePathPrint(p + "L", maze, r, c - 1, path, step+1);
        }

        // this line is where the func will over
        // before the function about to over this func will revert back the changes made
        // by this function call
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
