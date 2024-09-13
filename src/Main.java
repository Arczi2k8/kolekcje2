import java.util.*;

public class Main {
    public static void main(String[] args) {
        Gra gra1 = new Gra();
        gra1.zagraj();

        System.out.println("liczby pierwsze" + sito(200));

    }

    //do kartkówkki

    static ArrayList<Integer> sito(int liczba){
        //przygotowanie listy
        ArrayList<Boolean> logiczne = new ArrayList<>();
        logiczne.add(false);
        logiczne.add(false);
        for (int i = 0; i < liczba; i++) {
            logiczne.add(true);
        }

        //wykreslanie wielokrotnosci
        for (int i = 0; i < logiczne.size(); i++) {
            if (logiczne.get(i).equals(true)){
                //wykrweslanie zmiana na false
                for (int j = i*2; j < logiczne.size(); j =j + i) {
                    logiczne.set(j, false);
                }
            }

        }
        ArrayList<Integer> pierwsze = new ArrayList<>();
        for (int i = 0; i < logiczne.size(); i++) {
            if (logiczne.get(i).equals(true)){
                pierwsze.add(i);
            }
        }
        return pierwsze;
    }

}