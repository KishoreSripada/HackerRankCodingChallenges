import java.text.DecimalFormat;
import java.util.Scanner;

public class FractionOfElementsInArray {
    // Problem Statement
    /*
    Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to
10 to the power of -4 are acceptable.
Input Format
The first line contains an integer,
N
, denoting the size of the array.
The second line contains
N
space-separated integers describing an array of numbers
(a0, a1, ... an-1)

Output Format
You must print the following 3 lines:
A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeroes in the array compared to its size.
Sample Input
6
-4 3 -9 0 4 1
Sample Output
0.500000
0.333333
0.166667

Explanation
There are
3
positive numbers,
2
negative numbers, and
0
zero in the array.
The respective fractions of positive numbers, negative numbers and zeroes are
3/6 = 0.500000,
2/6 = 0.333333
and
1/6 = 0.166667
, respectively.
     */

    static void plusMinus(int[] arr) {
        double positiveIntegers =0, negativeIntegers =0, zeroIntegers=0;
        for(int a : arr) {
            if ( a > 0) {
                positiveIntegers++;
            } else if (a<0) negativeIntegers++;
            else zeroIntegers++;
        }
        System.out.println(appendZeros(positiveIntegers/arr.length));
        System.out.println(appendZeros(negativeIntegers/arr.length));
        System.out.println(appendZeros(zeroIntegers/arr.length));
    }

    private static String appendZeros(double v) {
        DecimalFormat format = new DecimalFormat("#.000000");
        return format.format(v);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}