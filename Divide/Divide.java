//Made with <3 by Adam Bárta
import java.util.Scanner;

public class Divide {
    double vysledek;
    double prvniCislo;
    double druheCislo;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");
        Divide d = new Divide();

        System.out.println(d.vydel(sc, d));

    }

    public String vydel(Scanner sc, Divide d){
        System.out.println("Zadej prvni cislo");
        prvniCislo = sc.nextDouble();

        System.out.println("Zadej druhe cislo");
        druheCislo = sc.nextDouble();

        if (druheCislo == 0){
            return "Nelze dělit nulou";
        }

        return Double.toString(prvniCislo/druheCislo);
    }
}