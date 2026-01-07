package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    public static String readKey(String key){

String filepath = System.getProperty("user.dir") + "/src/main/resources/data.properties";


        FileInputStream fileInputStream = null;
        Properties p ;
        try {
            fileInputStream = new FileInputStream(filepath);
             p = new Properties();
            p.load(fileInputStream);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return p.getProperty(key);

    }


}
