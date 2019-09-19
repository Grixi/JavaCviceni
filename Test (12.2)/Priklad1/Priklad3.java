import java.util.Scanner;

public class Priklad3{
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
        
        for (int i = 2; i < cislo2; i++) {
            vysledek = vysledek * cislo1;
        }

        System.out.println(vysledek);
        
    }
}