
import java.util.Scanner;

public class Priklad1 {
	public static void main (String[] args) {
        String druh, aString = "0", bString = "0";
        int a = 0;
        int b = 0;
        int vysledek;

        Scanner scanner = new Scanner(System.in,"Windows-1250");

        System.out.println("Pro vypocet obsahu zadej S a pro obvod O");

        druh = scanner.nextLine();

        char druhChar = druh.charAt(0);

        if (druhChar == 'O') {
            System.out.println("Zadej rozmer a");
            aString = scanner.nextLine();
            System.out.println("Zadej rozmer b");
            bString = scanner.nextLine();

            a = Integer.parseInt(aString);
            b = Integer.parseInt(bString);

            vysledek = 2*(a+b);
            System.out.println("Vysledek: " + vysledek);

        } else if (druhChar == 'S') {
            System.out.println("Zadej rozmer a");
            aString = scanner.nextLine();
            System.out.println("Zadej rozmer b");
            bString = scanner.nextLine();

            a = Integer.parseInt(aString);
            b = Integer.parseInt(bString);

            vysledek = a*b;
            System.out.println("Vysledek: " + vysledek);
            
        } else {
            System.out.println("Error");
        }
    }
}