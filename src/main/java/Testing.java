import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Testing {

    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("a","Aldo");
        hashtable.put("b","Beto");
        hashtable.put("c","Cesar");
        hashtable.put("d","David");


        Set<Map.Entry<String, String>> set = hashtable.entrySet();
        for (Map.Entry<String, String> m : set) {
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }

}
