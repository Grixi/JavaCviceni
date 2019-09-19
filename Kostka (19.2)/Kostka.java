//Made by:Adam Bárta
import java.util.Random;
public class Kostka {
    public static void main(String[] args) {
        int sirka = 5;
        int delka = 5;
        int strany = 6;
        int randomValue;

        //Generuje nahodne cislo 1-6 (zdroj:Internet)
        Random rand = new Random();
        randomValue = rand.nextInt(6) + 1;

        System.out.println("Kostka ma sirku " +sirka+ "cm a delku " +delka+"cm, ma " +strany+ " stran a padlo na ni cislo " +randomValue);
    }
}