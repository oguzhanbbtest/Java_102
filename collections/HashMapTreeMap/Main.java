package HashMapTreeMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> country = new HashMap<>();

        country.put("TR","TURKIYE");
        country.put("USA","AMERICA");
        country.replace("USA","AMARACA");

        // System.out.println(country.get("TR"));
        // System.out.println(country.get("TR"));

        for (String countryValues : country.values()
             ) {
            System.out.println(countryValues);
        }
    }
}
