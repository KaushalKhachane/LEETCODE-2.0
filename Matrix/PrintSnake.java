public class PrintSnake {

    public static void printSnake(int mat[][]){
        int r = mat.length; // Number of rows
        int c = mat[0].length; // Number of columns
        for(int i = 0; i < r; i++){
            if(i % 2 == 0){
                for(int j = 0; j < c; j++){
                    System.out.print(mat[i][j]+ " ");
                }
                System.out.println();
            }else{
                for(int j = c -1; j >= 0; j--){
                    System.out.print(mat[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        printSnake(matrix);
    }    
}
