class Strom{
  String nazev;
  int vyska;
  String typ;
  String plody;

  Strom(String nazev, int vyska, String typ, String plody){
    this.nazev = nazev;
    this.vyska = vyska;
    this.typ = typ;
    this.plody = plody;
  }

  String vratNazev(){
    return nazev;
  }

  int vratVyska(){
    return vyska;
  }

  String vratTyp(){
    return typ;
  }

  String vratPlody(){
    return plody;
  }
}

class KatalogStromu{
  public static void main(String args[]){
    Strom smrk = new Strom("Smrk", 70, "Jehlicnaty", "Siska");
    Strom jablon = new Strom("Jablon", 20, "Listnaty", "Jablko");
    Strom hruska = new Strom("Hruska", 25, "Listnaty", "Hruska");

    vypisStrom(smrk);
    vypisStrom(jablon);
    vypisStrom(hruska);
  }

    static void vypisStrom(Strom st){
      System.out.println(st.vratNazev());
      System.out.println(st.vratVyska());
      System.out.println(st.vratTyp());
      System.out.println(st.vratPlody());
      System.out.println();
  }
}
