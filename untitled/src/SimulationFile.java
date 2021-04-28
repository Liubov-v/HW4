//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import Country.*;
import Location.Location;
import Location.Point;
import Location.Size;
import Population.Healthy;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class SimulationFile {
    public SimulationFile() {
    }

    public static Map SimulationFile() {
        Map simulation_map = new Map();
        boolean flag1 = true;
        String file_path = null;

        while(flag1) {
            file_path = chooseFile();
            if (!Objects.equals("No file selected", file_path)) {
                flag1 = false;
            }
        }

        try {
            File myObj = new File(file_path);
            Scanner myReader = new Scanner(myObj);

            while(myReader.hasNextLine()) {
                String str = myReader.nextLine();
                str = str.replaceAll("\\s", "");
                String[] words = str.split(";");
                simulation_map.addSettelmentToMap(createNewSettlementByType(words[0], words[1], new Location(new Point(Integer.parseInt(words[2]), Integer.parseInt(words[3])), new Size(Integer.parseInt(words[4]), Integer.parseInt(words[5]))), Integer.parseInt(words[6])));
            }

            myReader.close();
        } catch (FileNotFoundException var7) {
            System.out.println("An error occurred.");
            var7.printStackTrace();
        }

        return simulation_map;
    }

    private static Settlement createNewSettlementByType(String type, String name, Location l, int people_amount) {
        if (Objects.equals("City", type)) {
            City c = new City(name, l);
            addPeopleToSettlementByAmount(c, people_amount);
            return c;
        } else if (Objects.equals("Moshav", type)) {
            Moshav m = new Moshav(name, l);
            addPeopleToSettlementByAmount(m, people_amount);
            return m;
        } else if (Objects.equals("Kibbutz", type)) {
            Kibbutz k = new Kibbutz(name, l);
            addPeopleToSettlementByAmount(k, people_amount);
            return k;
        } else {
            return null;
        }
    }

    private static void addPeopleToSettlementByAmount(Settlement s, int people_amount) {
        for(int i = 0; i < people_amount; ++i) {
            s.addPerson(new Healthy(determiningAge(), s.randomLocation(), s));
        }

    }

    public static int determiningAge() {
        Random randomX = new Random();
        Random randomY = new Random();
        int x = (int)(randomX.nextGaussian() * 6.0D + 9.0D);
        int y = randomY.nextInt(5);
        int DA = 5 * x + y;
        return DA;
    }

    private static String chooseFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(fileChooser);
        if (result == 0) {
            File selectedFile = fileChooser.getSelectedFile();
            return selectedFile.getAbsolutePath();
        } else {
            return "No file selected";
        }
    }

    public String toString() {
        return "SimulationFile{}";
    }
}
