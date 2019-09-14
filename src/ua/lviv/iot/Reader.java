package ua.lviv.iot;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Reader {
    public ArrayList<Screen> reader(String name) {
        ArrayList<Screen> screens = new ArrayList<Screen>();
        try (FileInputStream fis = new FileInputStream(name);
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader bufReader = new BufferedReader(isr)) {
            String line = bufReader.readLine();
            while (line!= null) {
                String[] lines = line.split(",");
                screens.add(new Screen(Double.parseDouble(lines[0]),Double.parseDouble(lines[1]),lines[2],MountingType.valueOf(lines[3])));
                line = bufReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return screens;
    }
}
