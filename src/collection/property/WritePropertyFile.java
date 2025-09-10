package collection.property;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WritePropertyFile {
    public static void main(String[] args) {
        String fileName = "/src/propertyFiles/write_db.properties";
        String dir = System.getProperty("user.dir");
        String path = dir + fileName;
        System.out.println(dir);

        try {
            FileWriter fw = new FileWriter(path); // using FileWriter
            FileOutputStream os = new FileOutputStream(path); // using FileOutputStream

            Properties p = new Properties();
            p.setProperty("user-name", "manoj");
            p.setProperty("password", "Abcs@112");

//            p.store(fw, "Writing the property file using FileWriter ");
            p.store(os, "Writing the property file using FileOutputStream ");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
