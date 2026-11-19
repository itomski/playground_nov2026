package de.lubowiecki.collections;

import java.io.*;
import java.util.Properties;

public class Configuration {

    private static final String USER_DIR = System.getProperty("user.home") + "/";
    private static final String XML_FILE = USER_DIR + "config.xml";
    private static final String PROP_FILE = USER_DIR + "config.properties";

    public static void main(String[] args) {

        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("user.home"));

        System.out.println();

        Properties props = new Properties();
//        props.setProperty("db.url", "localhost");
//        props.setProperty("db.user", "admin");
//        props.setProperty("db.password", "geheim123");
//
//        writeProp(props);
        // writeXml(props);

        readProp(props);
        //readXml(props);

        System.out.println(props);
        System.out.println(props.getOrDefault("db.user", "Unbekannt"));
        System.out.println(props.getOrDefault("db.mysql.user", "Unbekannt"));
    }

    private static void readProp(Properties props) {
        try(InputStream in = new FileInputStream(PROP_FILE)) {
            props.load(in);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readXml(Properties props) {
        try(InputStream in = new FileInputStream(XML_FILE)) {
            props.loadFromXML(in);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeXml(Properties props) {
        try(OutputStream out = new FileOutputStream(XML_FILE)) {
            props.storeToXML(out, null);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeProp(Properties props) {
        try(OutputStream out = new FileOutputStream(PROP_FILE)) {
            props.store(out, null);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


}
