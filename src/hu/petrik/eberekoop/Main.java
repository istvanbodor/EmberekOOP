package hu.petrik.eberekoop;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        Ember human = new Ember("Gipsz Jakab", "2000-1-01","Budapest");
        Ember human2 = new Ember("Teszt Elek", "1985-12-15","Debrecen");
        Ember human3 = new Ember("Macska Jajj", "1995-10-22","Baja");
        Ember human4 = new Ember("Lukács Antal", "1945-7-20","Pécs");
        Ember human5 = new Ember("Isten Király", "1955-5-14","Szolnok");
        Emberek emberek = new Emberek(new Ember[]{human, human2, human3, human4, human5});
        System.out.println(emberek);
        String fajlNev = "emberek.txt";
        try {
            Emberek emberek2 = new Emberek(fajlNev);
            System.out.println(emberek2);
        } catch (FileNotFoundException e) {
            System.out.printf("Hiba, nem található a %s fájl",fajlNev );;
        } catch (IOException e)
        {
            System.err.println("Ismeretlen hiba történt a fájl beolvasása során");



        }

    }



}
