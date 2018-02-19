import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
You are in-charge of the cake for your niece's birthday and have decided the cake will have one candle for each year of her total age. When she blows out the candles, she’ll only be able to blow out the tallest ones.
For example, if your niece is turning 4 years old, and the cake will have4 candles of height
3,2,1,3 she will be able to blow out
2 candles successfully, since the tallest candle is of height
3 and there are 2 such candles.
Complete the function birthdayCakeCandles that takes your niece's age and an integer array containing height of each candle as input, and return the number of candles she can successfully blow out.
 */
public class BirthdayCakeCandleSolution {

    static int birthdayCakeCandles(int n, int[] ar) {
        int noOfCandlesBlown = 0;
        List<Integer> testList = new ArrayList<>();
        for ( int a: ar) {
            testList.add(a);
        }
        int max = testList.stream().reduce(0, Integer::max);
        for ( int a: ar) {
            if ( a > max || a==max) {
                noOfCandlesBlown++;
            }
        }
        return noOfCandlesBlown;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}

