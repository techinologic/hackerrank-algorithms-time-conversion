import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Solution {
    static String timeConversion(String s) throws ParseException {
        // Complete this function

        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ssaa");
        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");

        return date24Format.format(date12Format.parse(s));
    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
/*

01:22:11PM

 */