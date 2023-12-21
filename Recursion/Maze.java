import java.util.ArrayList;

public class Maze {
    // count the number of possible ways
    public static int count(int r, int c){
        // if the row or column 1 then we return 1 insted of reaching to the end
        if(r == 1 || c == 1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);

        return left + right;
    }

    // process to process print path without array list
    public static void path(String p, int r, int c){
        // here both row and column has to be 1 then only add path and return the process
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1){
            path(p+"D", r-1, c);
        }
        if(c > 1){
            path(p+"R", r, c-1);
        }
    }

    // print the path also using arraylist
    public static ArrayList<String> pathRet(String p, int r, int c){
        // here both row and column has to be 1 then only add path and return the process
        if(r == 1 && c == 1){
            ArrayList<String> res = new ArrayList<>();
            res.add(p);
            return res;
        }

        ArrayList<String> list = new ArrayList<String>();

        if(r > 1){
            list.addAll(pathRet(p+"D", r-1, c));
        }
        if(c > 1){
            list.addAll(pathRet(p+"R", r, c-1));
        }

        return list;
    }

    // we can also go dignolally in maze prob
    public static ArrayList<String> pathRetDig(String p, int r, int c){
        // here both row and column has to be 1 then only add path and return the process
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<String>();

        if(r > 1 && c > 1){
            list.addAll(pathRetDig(p+"D", r-1, c-1));
        }

        if(r > 1){
            list.addAll(pathRetDig(p+"V", r-1, c));
        }
        if(c > 1){
            list.addAll(pathRet(p+"H", r, c-1));
        }

        return list;
    }    

    // maze with rock insted of startig from 3 * 3 now will start from 0 * 0
    // NOTE:--> when we land on new cell, check whether that is river or not
    // if we land on river stop recusion for that call
    // just return from there

    public static void getPathRiver(String p, boolean maze[][], int r, int c){
        if((r == maze.length-1) && (c == maze[0].length-1)){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r < maze.length-1){
            getPathRiver(p+"D", maze, r+1, c);
        }
        if(c < maze[0].length-1){
            getPathRiver(p+"R", maze, r, c+1);
        }
    }

    public static void main(String[] args) {
        // System.out.println(count(3, 3));
        path("", 3, 3);
        boolean maze[][] = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        // System.out.println(pathRetDig("", 3, 3));
        // getPathRiver("", maze, 0,0);
        System.out.println(pathRet("", 3, 3));
    }
}
