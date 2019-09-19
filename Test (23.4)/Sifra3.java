//Made by: Adam Bárta
import java.util.Scanner;

public class Sifra3{
    String input;
    int delka;
    char pismeno;
    String sifra;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Sifra3 s = new Sifra3();

        s.zadej(sc, s);
        s.zjistiDelku(s);
        s.zjistiPismeno(s);
        s.vypis(s);
        
    }

    public void zadej(Scanner sc, Sifra3 s){
        System.out.println("Zadej slovo");  
        input = sc.nextLine(); 
    }

    public void zjistiDelku(Sifra3 s){
        delka = input.length();
    }

    //prvni pismeno je 0
    public void zjistiPismeno(Sifra3 s){
        for(int i = 0; i < delka; i++){
            pismeno = input.charAt(i);
            vyber(s);
        } 
    }

    public void vyber(Sifra3 s){
        switch (pismeno) {
            case 'a': sifra = sifra + "0";
            break;
            case 'b': sifra = sifra + "9";
            break;
            case 'c': sifra = sifra + "8";
            break;
            case 'd': sifra = sifra + "7";
            break;
            case 'e': sifra = sifra + "6";
            break;
            case 'f': sifra = sifra + "5";
            break;
            case 'g': sifra = sifra + "4";
            break;
            case 'h': sifra = sifra + "3";
            break;
            case 'i': sifra = sifra + "2";
            break;
            case 'j': sifra = sifra + "1";
            break;
            case 'k': sifra = sifra + "=";
            break;
            case 'l': sifra = sifra + "%";
            break;
            case 'm': sifra = sifra + "}";
            break;
            case 'n': sifra = sifra + "{";
            break;
            case 'o': sifra = sifra + "*";
            break;
            case 'p': sifra = sifra + "&";
            break;
            case 'q': sifra = sifra + "^";
            break;
            case 'r': sifra = sifra + "~";
            break;
            case 's': sifra = sifra + "$";
            break;
            case 't': sifra = sifra + "#";
            break;
            case 'u': sifra = sifra + "@";
            break;
            case 'v': sifra = sifra + "<";
            break;
            case 'w': sifra = sifra + ">";
            break;
            case 'x': sifra = sifra + "]";
            break;
            case 'y': sifra = sifra + "[";
            break;
            case 'z': sifra = sifra + "§";
            break;
        }
    }

    public void vypis(Sifra3 s){
        System.out.println(sifra.substring(4));
    }
}