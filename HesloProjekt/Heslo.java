//Made with <3 by Adam Bárta
import java.util.Scanner;

class Heslo{
    String heslo;
    boolean splnenaPodminka;

    Heslo(String heslo){
        if (jeAlphaNumericke(heslo)){
            splnenaPodminka = true;
        } else {
            splnenaPodminka = false;
        }
    }

    public boolean jeAlphaNumericke(String heslo) {
        return heslo.matches("[a-zA-Z0-9]*");
    }

    /*public boolean maCislice(KontrolaHesla main){
        return heslo.matches
    }*/
}

class KontrolaHesla{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in, "Windows-1250");
        KontrolaHesla main = new KontrolaHesla();

        main.vstupniText(main);
        main.vstupHesla(main, sc);

        Heslo podminky = new Heslo(zadaneHeslo);

        main.vystupniText(podminky);
    }

    static void vstupniText(KontrolaHesla main){
        System.out.println("Heslo musí obsahovat minimálně 8 znaků, pouze písmena A-Z a minimálně 2 číslice.");
        System.out.println("Zadej heslo:");
    }

    static void vstupHesla(KontrolaHesla main, Scanner sc){
        String zadaneHeslo = sc.nextLine();
        Heslo podminky = new Heslo(zadaneHeslo);
    }

    static void vystupniText(Heslo h){
        System.out.println(h.splnenaPodminka);
    }
}