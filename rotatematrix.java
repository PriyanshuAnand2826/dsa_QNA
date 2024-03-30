package lovebabbar;

import java.util.Arrays;

public class rotatematrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] ans=(rotated(matrix));
        System.out.println(ans);

    }
    static int[][] rotated(int[][] matrix){
        int n=matrix.length;
        //transpose
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reverse
        for (int i=0;i<n;i++){
            for (int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
        return matrix;
    }
}
