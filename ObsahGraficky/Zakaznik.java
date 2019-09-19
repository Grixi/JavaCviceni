//Made by: Adam Barta
import java.util.Scanner;
import java.util.Random;

public class Zakaznik{
    String vek;
    int rokNarozeni;
    int cena = 100;
    int penize;
    int zustatek;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Random rand = new Random();

        Zakaznik z = new Zakaznik();
        Zakaznik z1 = new Zakaznik();
        Zakaznik z2 = new Zakaznik();

        z.spustVysledek(z, sc, rand);
        z.spustVysledek(z1, sc, rand);
        z.spustVysledek(z2, sc, rand);

    }

    public void spustVysledek(Zakaznik z, Scanner sc, Random rand){
        z.vypisRokNarozeni(sc);
        z.zaplat(rand);
        z.vypisZustatek();
    }

    public void vypisRokNarozeni(Scanner sc){
        System.out.println("Zadej vek");
        vek = sc.nextLine();
        int vekCislo = Integer.parseInt(vek);
        rokNarozeni = 2018 - vekCislo;
        System.out.println("Rok narozeni: " + rokNarozeni);
    }

    public void zaplat(Random rand){
        penize = rand.nextInt(500) + 200;
        System.out.println("Konto pred platbou: " + penize);
        zustatek = penize - cena;
    }

    public void vypisZustatek(){
        System.out.println("Konto po platbe: " + zustatek);
    }


}