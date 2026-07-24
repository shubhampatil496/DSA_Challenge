import java.util.*;

public class TwoDimension{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of columns : ");
        int columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];
        //INPUT
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //OUTPUT
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}