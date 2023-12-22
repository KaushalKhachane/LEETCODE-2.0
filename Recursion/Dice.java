import java.util.ArrayList;

public class Dice {
    public static ArrayList<String> dice(String p, int target){
        if(target == 0){
            ArrayList<String> res = new ArrayList<String>();
            res.add(p);
            return res;
        }
        ArrayList<String> res = new ArrayList<String>();
        for(int i = 1; i <= 6 && i <= target; i++){
            res.addAll(dice(p+i, target-i));
        }
        return res;
    }
    public static ArrayList<String> dice2(String p, int target, ArrayList<String> res){
        if(target == 0){
            res.add(p);
            return res;
        }
        for(int i = 1; i <= 6 && i <= target; i++){
            dice2(p+i, target-i, res);
        }
        return res;
    }
    public static void main(String[] args) {
        // ArrayList<String> res = dice("", 4);
        // System.out.println(res);

        ArrayList<String> res = new ArrayList<String>();
        System.out.println(dice2("", 4, res));
    }
}
