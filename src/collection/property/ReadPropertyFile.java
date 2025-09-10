package collection.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
    public static void main(String[] args) throws IOException {
        String fileName = "/src/propertyFiles/db.properties";
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
//        Using File readeer
        FileReader fr = new FileReader(dir + fileName);

        Properties properties = new Properties();
        properties.load(fr);

        System.out.println(properties.getProperty("user"));
        System.out.println(properties.getProperty("password"));

//        Using File InputStream
        FileInputStream fileInputStream = new FileInputStream(dir + fileName);
        Properties p = new Properties();
        p.load(fileInputStream);

        System.out.println(p.getProperty("user", "Not Found"));
        System.out.println(p.getProperty("Password", "Not Found")); // Case sensitive

    }
}
