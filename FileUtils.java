package petadoption.utils;

import java.io.*;
import java.util.*;

public class FileUtils {

    public static List<String> readAll(String path) {
        try {
            File f = new File(path);
            if (!f.exists()) {
                File parent = f.getParentFile();
                if (parent != null && !parent.exists()) parent.mkdirs();
                f.createNewFile();
            }

            List<String> list = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (!line.trim().isEmpty()) list.add(line);
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void writeAll(String path, List<String> lines) {
        try {
            File f = new File(path);
            File parent = f.getParentFile();
            if (parent != null && !parent.exists()) parent.mkdirs();
            try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
                for (String l : lines) pw.println(l);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void append(String path, String line) {
        try {
            File f = new File(path);
            File parent = f.getParentFile();
            if (parent != null && !parent.exists()) parent.mkdirs();
            try (PrintWriter pw = new PrintWriter(new FileWriter(f, true))) {
                pw.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
