//Made by: Adam Barta
import java.util.Scanner;
import java.util.Random;

public class DigitLock{
    int cislo1;
    int cislo2;
    int cislo3;
    String string1;
    String string2;
    String string3;
    String kod;
    String zadanyKod;
    int zadanyKodDelka;
    int pokus;

    public static void main(String[] args) {
        DigitLock dl = new DigitLock();
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Random r = new Random();

        dl.generuj(dl, r);
        dl.skenuj(sc, dl);
    }

    public void generuj(DigitLock dl, Random r){
        cislo1 = r.nextInt(10);
        cislo2 = r.nextInt(10);
        cislo3 = r.nextInt(10);

        string1 = Integer.toString(cislo1);
        string2 = Integer.toString(cislo2);
        string3 = Integer.toString(cislo3);

        kod = string1.concat(string2).concat(string3);
    }

    public void skenuj(Scanner sc, DigitLock dl){
        System.out.println("Enter code");
        zadanyKod = sc.nextLine();
        porovnej(dl, sc);
    }

    public void porovnej(DigitLock dl, Scanner sc){
        zadanyKodDelka = zadanyKod.length();
        if(zadanyKodDelka == 3){
            if(zadanyKod.equals(kod)){
                System.out.println("The lock is UNLOCKED now.");
            }else {
                pokus++;

                if(pokus < 10){
                    System.out.println("Wrong code, try again.");
                    skenuj(sc, dl);
                }else {
                    System.out.println("Attack at the lock was recognized and the lock is locked forever.");
                }
            }
        }else {
            System.out.println("Bad format, enter code again");
            skenuj(sc, dl);
        }
    }
}