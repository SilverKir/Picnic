package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetData {
    public String getData(String path) {
        String data = "";
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                data = data + " " + scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Path not found");
            e.printStackTrace();
        }
        return data;
    }
}
