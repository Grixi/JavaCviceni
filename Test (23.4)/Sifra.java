//Made by: Adam Bárta (PeanutButte7)
import java.util.Scanner;

public class Sifra{
    String input;
    int delka;
    char pismeno;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Sifra s = new Sifra();

        s.zadej(sc, s);
        s.zjistiDelku(s);
        s.zjistiPismeno(s);
        s.vypis(s);
        
    }

    public void zadej(Scanner sc, Sifra s){
        System.out.println("Zadej slovo");  
        input = sc.nextLine(); 
    }

    public void zjistiDelku(Sifra s){
        delka = input.length();
    }

    //prvni pismeno je 0
    public void zjistiPismeno(Sifra s){
        for(int i = 0; i < delka; i++){
            pismeno = input.charAt(i);
            vyber(s);
        } 
    }

    public void vyber(Sifra s){
        switch (pismeno) {
            case 'a': System.out.print("0");
            break;
            case 'b': System.out.print("9");
            break;
            case 'c': System.out.print("8");
            break;
            case 'd': System.out.print("7");
            break;
            case 'e': System.out.print("6");
            break;
            case 'f': System.out.print("5");
            break;
            case 'g': System.out.print("4");
            break;
            case 'h': System.out.print("3");
            break;
            case 'i': System.out.print("2");
            break;
            case 'j': System.out.print("1");
            break;
            case 'k': System.out.print("=");
            break;
            case 'l': System.out.print("%");
            break;
            case 'm': System.out.print("}");
            break;
            case 'n': System.out.print("{");
            break;
            case 'o': System.out.print("*");
            break;
            case 'p': System.out.print("&");
            break;
            case 'q': System.out.print("^");
            break;
            case 'r': System.out.print("~");
            break;
            case 's': System.out.print("$");
            break;
            case 't': System.out.print("#");
            break;
            case 'u': System.out.print("@");
            break;
            case 'v': System.out.print("<");
            break;
            case 'w': System.out.print(">");
            break;
            case 'x': System.out.print("]");
            break;
            case 'y': System.out.print("[");
            break;
            case 'z': System.out.print("§");
            break;
        }
    }

    public void vypis(Sifra s){
        System.out.println("");
    }
}