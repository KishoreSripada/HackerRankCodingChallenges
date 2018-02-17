import java.util.Scanner;

    public class SquareMatrixDiagnolDifference {
        // Problem statement - Find absolute difference betwen sum of diagnol numbers in a n*n matrix
        // Input - First row, should contain number of rows
        // Following rows should contain values of each row separated by space
        /*
            Ex.
            3
            11 2 4
            4 5 6
            10 8 -12
            Should produce answer 15
         */
        static int diagonalDifference(int[][] a) {
            int row, col, firstDiagnolSum=0, lastDiagnolSum=0;
            int reverse;
            for ( row =0 , col=0, reverse=a.length-1; row < a.length; row ++, col++, reverse-- ) {
                if ( row == col) {
                    firstDiagnolSum += a[row][col];
                }
                lastDiagnolSum += a[row][reverse];
            }
            return Math.abs(lastDiagnolSum - firstDiagnolSum);
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[][] a = new int[n][n];
            for(int a_i = 0; a_i < n; a_i++){
                for(int a_j = 0; a_j < n; a_j++){
                    a[a_i][a_j] = in.nextInt();
                }
            }
            int result = diagonalDifference(a);
            System.out.println(result);
            in.close();
        }
}