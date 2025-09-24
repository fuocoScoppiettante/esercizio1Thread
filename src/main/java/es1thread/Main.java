package es1thread;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        Cavallo c1 = new Cavallo("Cavallo1");
        Cavallo c2 = new Cavallo("Cavallo2");
        Cavallo c3 = new Cavallo("Cavallo3");
        Cavallo c4 = new Cavallo("Cavallo4");
        Cavallo c5 = new Cavallo("Cavallo5");

        ArrayList<Cavallo> classifica = new ArrayList<>();

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();
        c5.join();

        classifica.add(c1);
        classifica.add(c2);
        classifica.add(c3);
        classifica.add(c4);
        classifica.add(c5);

        classifica.sort(Comparator.comparingLong(Cavallo :: gettArrivo));

    }
}