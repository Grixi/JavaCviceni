public class Zvirata {

  String zvirataDruh;


  public Zvirata(String name) {

    zvirataDruh = name;
  }

  public static void main(String[] args) {
    Zvirata Eliska = new Zvirata("kun");
    Zvirata Petr = new Zvirata("pes");
    Zvirata Adam = new Zvirata("kocka");
    Zvirata Lukas = new Zvirata("zebra");
    Zvirata Terka = new Zvirata("lev");
    č String[] zvirata = {Eliska.zvirataDruh,Petr.zvirataDruh,Adam.zvirataDruh,Lukas.zvirataDruh,Terka.zvirataDruh};
    vypsat(zvirata);

  }
  public static void vypsat(String[] zvirata){
  for (int i = 0; i < zvirata.length; i++) {
    System.out.println(zvirata[i]);
    }
}
}
