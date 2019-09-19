
// do sveho programu importujete tridu Scanner
// ta umoznuje napr. cteni textu z terminaloveho radku
import java.util.Scanner;

// nadefinujte tridu JmenoVek
public class JmenoVek {

    // spustit lze pouze pokud trida obsahuje metodu main
    public static void main(String[] args) {

        // nadeklarujte promenne, ktere budete pouzivat
        String jmeno;               // promenna jmenotypu String - ulozi se do ni textovy retezec
        String zadanyRok;           // zadanyRok bude typu String, protoze vse co cteme z terminaloveho radku je pro nas textovy retezec
        int vekJakoCislo;           // vekjakoCislo - jedna se o promennou do ktere ulozime vysledek matematicke operace, prtoo musi byt typu int
        int aktualniRok = 2018;     // aktualniRok v sobe uchovava aktualni rok
        
        // abychom mohli vyuzit schopnosti Scanneru musime vytvorit jeho Objekt pomoci slova new
        // tohle budeme jeste detailne a hodne probirat
        // zatim staci vedet, ze chceme-li pouzit Scanner terminaloveho radku, vytvorime objekt scanner timto zpusobem
        Scanner scanner = new Scanner(System.in,"Windows-1250");
        
        System.out.println("Ahoj, zadej sve jmeno:"); // vypsani textu do terminalu
        
        jmeno = scanner.nextLine(); // cteni radku z terminalu a to co se precte se ulozi do promenne jmeno
        
        System.out.println("Ve kterem roce jsi se narodil?"); // vypsani textu do terminalu
        
        zadanyRok = scanner.nextLine(); // cteni radku z terminalu a to co se precte se ulozi do promenne zadanyRok

        vekJakoCislo = aktualniRok - Integer.parseInt(zadanyRok); // vypocet veku s prevodem textove promenne zadanyRok na cislo typu integer
        
        System.out.println("Osoba, ktera se jmenuje: " + jmeno + " ma " + vekJakoCislo + " let."); // vypsani textu s promennymi

        scanner.close(); // zavreni scanneru, aby jiz dal necekal, ze se bude provadet cteni z terminaloveho radku
        
    }
}