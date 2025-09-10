package collection.property;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ReadingSytemProperties {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        Set<Map.Entry<Object, Object>> set = p.entrySet();

        for (Map.Entry<Object, Object> entry : set) {
            System.out.println("Key: " +entry.getKey() + "; value: " + entry.getValue());
        }

    }
}
