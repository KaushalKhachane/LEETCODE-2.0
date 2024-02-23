public class Diamond {

    public static void pattern5(int n){
        for(int i = 0; i < 2*n; i++){
            int totalColInRow = i > n ? 2*n - i : i;

            for(int j = 0; j < totalColInRow; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//push
    public static void pattern28(int n){
        for(int i = 0; i < 2*n; i++){
            
            int totalColInRow = i > n ? 2*n - i : i;
            int spaces = n - totalColInRow;
            for(int s = 0; s < spaces; s++){
                System.out.print(" ");
            }

            for(int j = 0; j < totalColInRow; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern17(int n){
        for(int row = 1; row <= 2*n; row++){
            int c = row > n ? 2*n - row : row;
            
            for(int s = 0; s < n - c; s++){
                System.out.print(" ");
            }

            for(int col = c; col >= 1; col--){
                System.out.print(col);
            }
            
            for(int col = 2; col <= c; col++){
                System.out.print(col);
            }
            System.out.println();
        } 
    }


    public static void pattern31(int n){

    }

    public static void pattern50(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern50(5);
    }    
}
