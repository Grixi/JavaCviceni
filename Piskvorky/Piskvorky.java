//Made with <3 by Adam Bárta
import java.util.Scanner;

public class Piskvorky {
  int sloupecInput;
  int radekInput;
  int size;
  int tah = 0;
  char znakInput;
  char aktualniZnak;

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in, "Windows-1250");
      Piskvorky p = new Piskvorky();

      System.out.println("Zadej velikost hracího pole");
      int velikostPole = 0;
      do{
        velikostPole = sc.nextInt();
        if (velikostPole < 3 | velikostPole >5) {
          System.out.println("Zadej velikost 3-5");
        } else {
          break;
        }
      }while (velikostPole < 3 | velikostPole >5);

      char[][] plocha = new char[velikostPole][velikostPole];


      p.naplnPole(p, plocha, velikostPole);
      p.tahni(p, sc , plocha, velikostPole);
  }

  public void tahni(Piskvorky p, Scanner sc, char[][] plocha, int velikostPole){
    p.zadejSloupec(p, sc, plocha, velikostPole);
    p.zadejRadek(p, sc, plocha, velikostPole);
    p.zadejZnak(p, sc, plocha, velikostPole);
    p.vypisPole(p, plocha, velikostPole);
    p.zkontrolujHorizontalne(p, plocha, velikostPole);
    p.zkontrolujVertikalne(p, plocha, velikostPole);
    p.zkontrolujDiagonalneDolu(p, plocha, velikostPole);
    p.zkontrolujDiagonalneNahoru(p, plocha, velikostPole);
    p.tahni(p, sc, plocha, velikostPole);
  }

  public void naplnPole(Piskvorky p, char[][] plocha, int velikostPole){
    for (int i = 0; i < velikostPole; i++) {
      for (int j = 0; j < velikostPole; j++) {
        plocha[i][j] = '-';
      }
    }
  }

  public void vypisPole(Piskvorky p, char[][] plocha, int velikostPole){
    tah++; // Nemuze byt ve zadani znaku, protoze ten se opakuje, pokud je spatne zadan
    for(int i = 0; i != velikostPole; i++){
      System.out.println(plocha[i]);
    }
  }

  public void zadejSloupec(Piskvorky p, Scanner sc, char[][] plocha, int velikostPole){
    System.out.println("Zadej sloupec");
    sloupecInput = sc.nextInt();
    sloupecInput--;

    if(sloupecInput>=velikostPole || sloupecInput<0){
      System.out.println("Chyba - Zadej cislo 1-" + velikostPole);
      p.zadejSloupec(p, sc, plocha, velikostPole);
    }
  }

  public void zadejRadek(Piskvorky p, Scanner sc, char[][] plocha, int velikostPole){
    System.out.println("Zadej radek");
    radekInput = sc.nextInt();
    radekInput--;

    if(radekInput>=velikostPole || radekInput<0){
      System.out.println("Chyba - Zadej cislo 1-" + velikostPole);
      p.zadejRadek(p, sc, plocha, velikostPole);
    }
  }

  public void zadejZnak(Piskvorky p, Scanner sc, char[][] plocha, int velikostPole){

    if(tah%2 == 0){
      aktualniZnak = 'x';
      System.out.println("Na rade je x. Pro ukonceni programu zadej e.");
    } else {
      aktualniZnak = 'o';
      System.out.println("Na rade je o. Pro ukonceni programu zadej e.");
    }

    znakInput = sc.next().charAt(0);
    if (znakInput == 'e') {
      System.exit(0);
    } else if (znakInput != aktualniZnak) {
      p.zadejZnak(p, sc, plocha, velikostPole);
    }

    if (plocha[radekInput][sloupecInput] == 'x' || plocha[radekInput][sloupecInput] == 'o') {
      System.out.println("Toto pole je obsazené, zadej jiné souradnice");
      p.zadejZnak(p, sc, plocha, velikostPole);
    } else {
      plocha[radekInput][sloupecInput] = znakInput;
    }
  }

  public void zkontrolujHorizontalne(Piskvorky p, char[][] plocha, int velikostPole){
    int podminkaVyhry = velikostPole - 1;
    for (int y = 0; y < velikostPole; y++) {
      for (int i = 0; i < velikostPole; i++) {
        if (plocha[y][i] != znakInput) {
          break;
        } else if (i == podminkaVyhry){
          System.out.println("YOU WON ZULU");
          System.exit(0);
        }
      }
    }
  }

  public void zkontrolujVertikalne(Piskvorky p, char[][] plocha, int velikostPole){
    int podminkaVyhry = velikostPole - 1;
    for (int y = 0; y < velikostPole; y++) {
      for (int i = 0; i < velikostPole; i++) {
        if (plocha[i][y] != znakInput) {
          break;
        } else if (i == podminkaVyhry){
          System.out.println("YOU WON ZULU");
          System.exit(0);
        }
      }
    }
  }

  public void zkontrolujDiagonalneDolu(Piskvorky p, char[][] plocha, int velikostPole){
    int podminkaVyhry = velikostPole - 1;
    for (int x = 0, y = 0; x < velikostPole; x++) {
      if (plocha[x][y] != znakInput) {
        break;
      } else if (x == podminkaVyhry){
        System.out.println("YOU WON ZULU");
        System.exit(0);
      }
      y++;
    }
  }

  public void zkontrolujDiagonalneNahoru(Piskvorky p, char[][] plocha, int velikostPole){
    int podminkaVyhry = velikostPole - 1;
    for (int x = 0, y = podminkaVyhry; x < velikostPole; x++) {
      if (plocha[x][y] != znakInput) {
        break;
      } else if (x == podminkaVyhry){
        System.out.println("YOU WON ZULU");
        System.exit(0);
      }
      y--;
    }
  }
}
