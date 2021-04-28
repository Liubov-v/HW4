//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import Country.Map;
import Population.Sick;
import Virus.ChineseVariant;

import javax.swing.*;
import java.util.Random;


class MenuExample {
    JMenu menu, submenu1, submenu2, submenu3;
    JMenuItem i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;

    MenuExample() {
        JFrame f = new JFrame("Menu and MenuItem Example");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Menu");
        submenu1 = new JMenu("File");
        submenu2 = new JMenu("Simulation");
        submenu3 = new JMenu("Help");
        i1 = new JMenuItem("Load");
        i2 = new JMenuItem("Statistics");
        i3 = new JMenuItem("Edit Mutations");
        i4 = new JMenuItem("Exit");
        i5 = new JMenuItem("Play");
        i6 = new JMenuItem("Pause");
        i7 = new JMenuItem("Stop");
        i8 = new JMenuItem("Set Ticks Per Day");
        i9 = new JMenuItem("Help");
        i10 = new JMenuItem("About");


        submenu1.add(i1);
        submenu1.add(i2);
        submenu1.add(i3);
        submenu1.add(i4);
        submenu2.add(i5);
        submenu2.add(i6);
        submenu2.add(i7);
        submenu2.add(i8);
        submenu3.add(i9);
        submenu3.add(i10);
        menu.add(submenu1);
        menu.add(submenu2);
        menu.add(submenu3);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static class Main {
        static int simulation_loop = 5;


        public Main() {
        }

        public static void main(String[] args) {
            new MenuExample();
          /*  new Map();
            Map m = SimulationFile.SimulationFile();
            dataInitialization(m);

            for (int i = 0; i < simulation_loop; ++i) {
                simulation(m);
                Clock.nextTick();
            }
*/
        }

        private static void dataInitialization(Map m) {
            for (int i = 0; i < m.getSettlementAmount(); ++i) {
                for (int j = 0; (double) j < (double) m.getSettelmentFromMapByIndex(i).getPeopleAmount() * 0.01D; ++j) {
                    if (!m.getSettelmentFromMapByIndex(i).getPeronByIndex(j).ifSick()) {
                        try {
                            Sick sick = new Sick(m.getSettelmentFromMapByIndex(i).getPeronByIndex(j).contagion(new ChineseVariant()));
                            m.getSettelmentFromMapByIndex(i).removePerson(m.getSettelmentFromMapByIndex(i).getPeronByIndex(j));
                            m.getSettelmentFromMapByIndex(i).addPerson(sick);
                        } catch (Exception var4) {
                            System.out.print(var4);
                        }
                    }
                }
            }

        }

        private static void simulation(Map m) {
            ChineseVariant variant = new ChineseVariant();

            for (int i = 0; i < m.getSettlementAmount(); ++i) {
                for (int j = 0; j < m.getSettelmentFromMapByIndex(i).getPeopleAmount(); ++j) {
                    if (!m.getSettelmentFromMapByIndex(i).getPeronByIndex(j).ifSick()) {
                        for (int k = 0; k < 6; ++k) {
                            int index = 0;
                            boolean flag = false;

                            while (!flag) {
                                Random x = new Random();
                                index = x.nextInt(m.getSettelmentFromMapByIndex(i).getPeopleAmount());
                                if (index != j) {
                                    flag = true;
                                }
                            }

                            if (m.getSettelmentFromMapByIndex(i).getPeronByIndex(index).ifSick() && variant.tryToContagion(m.getSettelmentFromMapByIndex(i).getPeronByIndex(index), m.getSettelmentFromMapByIndex(i).getPeronByIndex(j))) {
                                try {
                                    Sick sick = new Sick(m.getSettelmentFromMapByIndex(i).getPeronByIndex(j).contagion(new ChineseVariant()));
                                    m.getSettelmentFromMapByIndex(i).removePerson(m.getSettelmentFromMapByIndex(i).getPeronByIndex(j));
                                    m.getSettelmentFromMapByIndex(i).addPerson(sick);
                                } catch (Exception var8) {
                                    System.out.print(var8);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}