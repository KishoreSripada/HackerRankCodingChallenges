import java.util.Scanner;

/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Sample Input
07:05:45PM
Sample Output
19:05:45
 */
public class TimeConverter12hto24h {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

    private static String timeConversion(String s) {
        String convertedDate;
        if ( s == null ) return null;

        String[] splitData = s.split(":");
        String amOrPm = splitData[2].substring(splitData[2].length()-2, splitData[2].length());
        int splitData1 = Integer.parseInt(splitData[0]);
        if ( amOrPm.equals("PM")) {
                if ( splitData1>1 && splitData1<12) {
                    convertedDate = String.valueOf(Integer.parseInt(splitData[0]) + 12);
                } else convertedDate = splitData[0];
            } else {
                if(splitData1==12) {
                    convertedDate = "00";
                } else convertedDate = splitData[0];
            }
        convertedDate += ":" + splitData[1] + ":"+ splitData[2].substring(0, splitData[2].length()-2);
        return convertedDate;
    }
}