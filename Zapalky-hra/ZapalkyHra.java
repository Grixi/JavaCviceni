//Made by Adam Barta
import java.util.Scanner;

public class ZapalkyHra{
  int pocetzapalek = 10;
  int hrac = 0;
  int cislo1;

  public static void main(String[] args){
    ZapalkyHra zh = new ZapalkyHra();
    Scanner sc = new Scanner(System.in, "Windows-1250");
    System.out.println("Pravidla hry - Odebírání zápalek. Na začátku je 10 zápalek. Hrají dva hráči. Hráči se střídají v odebírání zápalek. Každý může odebrat pouze 1-3 zápalky. Kdo odebere poslední zápalku -prohrává.");
    zh.hrac(zh, sc);
  }

  public void hrac(ZapalkyHra zh, Scanner sc){
    hrac = hrac + 1;
    if (hrac%2 == 1) {
      System.out.println("Na tahu je Hrac1");
    }
    else{
      System.out.println("Na tahu je Hrac2");
    }
    System.out.println("Zadej pocet zapalek, ktere chces odebrat");
    zh.hlavni(sc, zh);
  }

  public void hlavni(Scanner sc, ZapalkyHra zh){

    String cislojedna = sc.nextLine();
    cislo1 = Integer.parseInt(cislojedna);

    if(cislo1 < 1 || cislo1 > 3){
      System.out.println("Cislo je vetsi nez 3 nebo mensi nez 1, prosim zadejte spravne cislo");
      zh.hlavni(sc, zh);
    }else{
      pocetzapalek = pocetzapalek - cislo1;
      if (pocetzapalek < 0) {
        System.out.println("Zbyva 0 zapalek");
      }else {
        System.out.println("Zbyva " + pocetzapalek + " zapalek");
      }
      if(pocetzapalek <= 0){
        if (hrac%2 == 0) {
          System.out.println("Hrac1 VYHRAVA!");
        } else {
          System.out.println("Hrac2 VYHRAVA!");
        }
      }else{
        zh.hrac(zh, sc);
      }
    }
  }
}
