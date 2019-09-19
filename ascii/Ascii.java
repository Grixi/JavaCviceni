//Made by: Adam Bárta
public class Ascii{
  int znak;
  int radek;

  public static void main(String[] args){
    Ascii a = new Ascii();
    a.vypis1(a);
    a.vypis2(a);
    a.vypis3(a);
  }

  public void vypis1 (Ascii a){
    for (znak=51;znak<100;znak++){
      radek++;
      if (radek%10 == 0){
        System.out.przintln("");
      }

      char znakOutput = (char)znak;
      System.out.print(znakOutput);
    }
    System.out.println("");
  }

  public void vypis2(Ascii a){
    for (znak=251;znak<300;znak++){
      radek++;
      if (radek%10 == 0){
        System.out.println("");


      char znakOutput = (char)znak;
      System.out.print(znakOutput);
    }
    System.out.println("");
  }

  public void vypis3(Ascii a){
    for (znak=10241;znak<10290;znak++){
      radek++;
      if (radek%10 == 0){
        System.out.println("");
      }

      char znakOutput = (char)znak;
      System.out.print(znakOutput);
    }
  }
}
