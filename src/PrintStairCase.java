import java.util.Scanner;

public class PrintStairCase {

    static void staircase(int n) {
        String[][] array = new String[n][n];
        for ( int i=0;i<array.length;i++){
            for ( int j=0;j<array.length;j++){
                array[i][j] = "#";
            }
        }

        for ( int i=0, j=0, k=n-1; i<n; i++,j++, k--) {
                for ( int l = 0; l<k;l++) {
                    array[i][l]=" ";
                }
        }

        for (int i=0;i<array.length;i++) {
            for ( int j=0; j<array.length;j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}