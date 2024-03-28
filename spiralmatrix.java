package lovebabbar;

import java.util.ArrayList;
import java.util.List;

public class spiralmatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(output(matrix));

    }
    static List<Integer> output(int[][] matrix){
        List<Integer> list=new ArrayList<>();


        int row= matrix.length;
        int col=matrix[0].length;
        int d=0;
        int t=0,l=0,b=row-1,r=col-1;
        while (t<=b && l<=r){
            if (d==0){
                for (int i=l;i<=r;i++){
                    list.add(matrix[t][i]);
                }
                d=1;
                t++;
            }
            else if (d==1){
                for (int i=t;i<=b;i++){
                    list.add(matrix[i][r]);
                }
                d=2;
                r--;
            }
            else if (d==2){
                for (int i=r;i>=l;i--){
                    list.add(matrix[b][i]);
                }
                d=3;
                b--;
            }
            else if (d==3){
                for (int i=b;i>=t;i--){
                    list.add(matrix[i][l]);
                }
                d=0;
                l++;
            }

        }
        return list;
    }
}
