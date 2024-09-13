import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("kebab");

        LinkedList<Integer> wylosowane = wylosujLiczby(7);
        LinkedList<Integer> wpisane = wczytajLiczby(4);
        LinkedList<Integer> trafione = sprawdzKtorePowtarzajaSie(wpisane, wylosowane);
        System.out.println("Liczby wylosowane");
        wypiszListe(wylosowane);
        System.out.println("Liczby wpisane");
        wypiszListe(wpisane);
        System.out.println("Liczby trafione");
        wypiszListe(trafione);


    }

    /**
     * wylosujLiczby - metoda losuje liczby z zakresu 1-100
     *
     * @param ile - liczba wylosowanych wartosci
     * @return lista z wylosowanymi wartosciami
     */
    private static LinkedList<Integer> wylosujLiczby(int ile) {
        LinkedList<Integer> ListaLosowychBezPowtorzen = new LinkedList<>();
        int liczba;
        for (int i = 0; i < 6; i++) {
            liczba = (int) (Math.random() * 10 + 1);
            while (ListaLosowychBezPowtorzen.contains(liczba)) {
                liczba = (int) (Math.random() * 10 + 1);
            }
            ListaLosowychBezPowtorzen.add(liczba);
        }
        return ListaLosowychBezPowtorzen;
    }

    private static LinkedList<Integer> wczytajLiczby(int ile) {
        LinkedList<Integer> listaZKlawiatury = new LinkedList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj liczbe");
        for (int i = 0; i < 6; i++) {
            listaZKlawiatury.add(klawiatura.nextInt());
        }
        return listaZKlawiatury;
    }

    private static void wypiszListe(List<Integer> lista) {
        for (Integer element : lista) {
            System.out.print(element + ", ");
        }
    }

    private static LinkedList<Integer> sprawdzKtorePowtarzajaSie(LinkedList<Integer> wpisane, LinkedList<Integer> wylosowane) {
        LinkedList<Integer> listaTrafione = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
            if (wpisane.get(i) == wylosowane.get(i)) {
                listaTrafione.add(wylosowane.get(i));
            }

        }
        return listaTrafione;
    }
}