public class Pole1R{

  public static void main(String[] args) {
    int pocetSekund[] = new int[10];
    int i;
    int y = 0;
    int index;
    int min, max;

    for (i = 0; i < 10 ; i ++) {
      y += 2;
      pocetSekund[i] = y;
    }
    for (index = 0; index < 10; index++) {
      System.out.println(pocetSekund[index]);
    }

    pocetSekund[0] = 86;
    pocetSekund[1] = 1024;
    pocetSekund[2] = 2;
    pocetSekund[3] = 766;
    pocetSekund[4] = 12;
    pocetSekund[5] = 0;
    pocetSekund[6] = 315;
    pocetSekund[7] = 22222;
    pocetSekund[8] = 551;
    pocetSekund[9] = 12;

    min = max = pocetSekund[0];

    for (i = 1; i < 10; i++) {
      if (pocetSekund[i] < min) min = pocetSekund[i];
      if (pocetSekund[i] > max) max = pocetSekund[i];
    }

    System.out.println(min + " < " + max);
  }
}
