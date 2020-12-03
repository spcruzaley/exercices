package hackerrank.TimeConversion;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String time = "07:01:00PM";
        System.out.println(timeConversion(time));
    }

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        Map<String, String> hours = buildHours();
        StringTokenizer stringTokenizer = new StringTokenizer(s, ":");
        String[] newHour = new String[3];
        String format = s.contains("AM") ? "AM" : "PM";

        int i = 0;
        while(stringTokenizer.hasMoreElements()) {
            newHour[i++] = stringTokenizer.nextToken().replace(format,"");
        }

        if(format.equals("AM")) {
            if(newHour[0].equals("12")) newHour[0] = "00";
        } else {
            newHour[0] = hours.get(newHour[0]);
        }
        newHour[2] = newHour[2].replace(format,"");

        return newHour[0]+":"+newHour[1]+":"+newHour[2];
    }

    private static Map<String, String> buildHours() {
        Map<String, String> hours = new HashMap<>();

        for(int i = 1, j = 12;i<=12;i++){
            if(i<10) {
                hours.put("0" + i, ""+(i + j));
            } else {
                if((i+j) == 24) {
                    hours.put("12", "12");
                } else {
                    hours.put("" + i, ""+(i + j));
                }
            }
        }
        return hours;
    }

}
