import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("kebab");
        //tablica
        //tablica musi mieć zdefiniowany rozmiar, który jest niezmienny. przechowuje ona typy proste i złożone
        int [] tablicaLiczb = new int [6];
        //losowanie 1-100
        for (int i = 0; i < tablicaLiczb.length; i++) {
            tablicaLiczb[i] = (int) (Math.random()*100);
        }
        //wypisanie elementów
        for (int element:tablicaLiczb) {
            System.out.print(element+", ");
        }
        //wypelnianie kolekcji
        //kolekcja moze przechowywac tylko typy zlozone np. Integer. Kolekcja nie musi miec zdefiniowanego rozmiaru - mozna go zmieniac
        //Interfejsy:
        // List -> ArrayList, LinkedList
        // Set -> HashSet

        ArrayList<Integer> listaLiczb = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int)(Math.random()*100);
            listaLiczb.add(liczba);
        }
        System.out.println("Wylosowana lista");
        for (Integer element:listaLiczb){
            System.out.print(element+", ");
        }
        //da sie tak:
        System.out.println(listaLiczb);
        //looswanie bez powtórzeń
        ArrayList<Integer> ListaLosowychBezPowtorzen = new ArrayList<>();
        int liczba;
        for (int i = 0; i < 6; i++) {
            liczba =(int)(Math.random()*10+1);
            while (ListaLosowychBezPowtorzen.contains(liczba)){
                liczba = (int)(Math.random()*10+1);
            }
            ListaLosowychBezPowtorzen.add(liczba);
        }
        System.out.println(ListaLosowychBezPowtorzen);
        //lista: indeksowana, uporządkowana, powtarzalność
        //zbior (zazwyczaj): nieindeksowany, nieuporządkowany, brak powtarzalności
        HashSet<Integer> zbiorLiczbLosowych = new HashSet<>();
        while (zbiorLiczbLosowych.size()<6){
            liczba = (int)(Math.random()*100+1);
            zbiorLiczbLosowych.add(liczba);
        }
        System.out.println(zbiorLiczbLosowych);
        //liczba liczb wczytanych
        LinkedList<Integer> listaZKlawiatury = new LinkedList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj liczbe");
        for (int i = 0; i < 6; i++) {
            int wpisanaliczba = klawiatura.nextInt();
            listaZKlawiatury.add(wpisanaliczba);
        }
        System.out.println(listaZKlawiatury);
        //trafione czyli takie które są i wpisane i wylosowane
        LinkedList <Integer> listaTrafiona = new LinkedList<>();
        LinkedList <Integer> listaTrafiona2 = new LinkedList<>();
        LinkedList <Integer> listaTrafione = new LinkedList<>();
        Scanner klawiatura2 = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            liczba = (int)(Math.random()*100+1);
            listaTrafiona.add(liczba);
        }
        System.out.println(listaTrafiona);
        for (int i = 0; i < 6; i++) {
            int wpisanaliczba = klawiatura.nextInt();
            listaTrafiona2.add(wpisanaliczba);
        }
        for (int i = 0; i < 6; i++) {
            if (listaTrafiona.get(i) == listaTrafiona2.get(i)){
                listaTrafione.add(listaTrafiona2.get(i));
            }
            System.out.println(listaTrafione);
        }


    }
}