class Vozidlo{
  int cestujici;
  double objemNadrze;
  double litryNa100Km;

  Vozidlo(int cestujici, double objemNadrze, double litryNa100Km){
    this.cestujici = cestujici;
    this.objemNadrze = objemNadrze;
    this.litryNa100Km = litryNa100Km;
  }

  double dojezd(){
    return 100*(objemNadrze / litryNa100Km);
  }

  double potrebnePalivo(int pocetKm){
    pocetKm = 100;
    return litryNa100Km * (pocetKm / 100);
  }
}

class UkazVozidlo{
  public static void main(String args[]){
    Vozidlo minivan = new Vozidlo(7, 60, 10);
    Vozidlo sportak = new Vozidlo(2, 50, 20);
    System.out.println("Minivan muze prepravit " + minivan.cestujici + " osob na vzdalenost " + minivan.dojezd() + " km.");
    System.out.println("Minivan muze prepravit " + sportak.cestujici + " osob na vzdalenost " + sportak.dojezd() + " km.");
    System.out.println(minivan.potrebnePalivo(100) + " litru");
  }
}
