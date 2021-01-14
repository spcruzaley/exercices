package hackerrank.BirthdayCakeCandles;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);

        System.out.println(birthdayCakeCandles(list));
    }

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        SortedMap<Integer, Integer> sortedMap = new TreeMap<>();
        int aux = 0;
        
        for (Integer integer: candles) {
            if(sortedMap.get(integer) != null) {
                aux = sortedMap.get(integer);
                sortedMap.put(integer, ++aux);
            } else {
                sortedMap.put(integer, 1);
            }
        }

        if(sortedMap.size() == 1) return sortedMap.get(sortedMap.firstKey());

        Set<Map.Entry<Integer, Integer>> entry = sortedMap.entrySet();
        int max = 0;
        for (Map.Entry<Integer, Integer> map: entry){
            if(map.getValue() > max) {
                max = map.getValue();
            }
        }

        return max;
    }

}
