import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
     
    //  static Scanner scan = new Scanner(System.in);
    //  static int month = scan.nextInt();
    //  static int day = scan.nextInt();
    //  static int year = scan.nextInt();

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(calendar.YEAR);
        int currentMonth = calendar.get(calendar.MONTH);
        int currentDay = calendar.get(calendar.DATE);
        
        int y = year-currentYear;
        int m = month-currentMonth-1;
        int d = day-currentDay;
         System.out.println(month);
          System.out.println(currentMonth);
        System.out.println(y);
         System.out.println(m);
          System.out.println(d);
        
        calendar.add(calendar.DATE, d);
        System.out.println(calendar.getTime());
        calendar.add(calendar.MONTH, m);
        System.out.println(calendar.getTime());
        calendar.add(calendar.YEAR, y);
        System.out.println(calendar.getTime());
        
        int dayOfWeek = calendar.get(calendar.DAY_OF_WEEK);
        
        String[] daysOfWeek = {"SUNDAY","MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        
        String resultDay = daysOfWeek[dayOfWeek-1];
        
        return resultDay;
        
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

