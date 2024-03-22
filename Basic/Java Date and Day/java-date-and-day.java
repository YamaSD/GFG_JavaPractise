//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String findDay(int Day, int Month, int Year){
       Calendar cal = Calendar.getInstance();
    cal.set(Year, Month - 1, Day); // Note: Month in Calendar class starts from 0 (January)

    // Get the day of the week
    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

    // Convert the day of the week to a string representation
    String[] weekdays = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
    return weekdays[dayOfWeek];
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split(" ");
            
            String day = input_line[0];
            String month = input_line[1];
            String year = input_line[2];
            int yyyy = Integer.parseInt(year);
            int mm = Integer.parseInt(month);
            int dd = Integer.parseInt(day);

            Solution ob = new Solution();
            System.out.println(ob.findDay(dd,mm,yyyy));
        }
    }
}
// } Driver Code Ends