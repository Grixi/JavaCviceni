
import java.util.Scanner;

public class Priklad2 {
	public static void main (String[] args) {
        String cisloS1, cisloS2;
        int cislo1, cislo2, cislo3;
        int vysledek = 0;

        Scanner scanner = new Scanner(System.in,"Windows-1250");

        System.out.println("Zadej cislo, ktere chces umocnit");

        cisloS1 = scanner.nextLine();

        cislo1 = Integer.parseInt(cisloS1);

        System.out.println("Zadej exponent");

        cisloS2 = scanner.nextLine();

        cislo2 = Integer.parseInt(cisloS2);

        vysledek = cislo1*cislo1;

        cislo3 = cislo2 - 2;
        if (cislo3 == 0) {        
        System.out.println(vysledek);
        } else {
            for (int i = 0; i < cislo3; i++) {
                vysledek = vysledek * cislo1;
            }
        System.out.println(vysledek);
        }
    }
}