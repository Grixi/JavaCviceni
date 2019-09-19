//Made by: Adam Bárta
public class ForCyklus{
  public static void main(String[] args) throws java.io.IOException{
    System.out.println("Pokud chcete program zastavit zmacknete klavesu S");

    int y;
    for(y = 0;(char) System.in.read() != 's'; y++){
      System.out.println("Pruchod č. " + y);
    }

    //standartni cyklus
    int x;

    for(x = 100; x > -100; x -=5){
      System.out.println(x);
    }


    //Cyklus muze mit vice promenych
    int i,j;

    for(i=0, j=10; i < j; i++, j--){
      System.out.println("i = " + i + ", j = " + j);
    }


    //Cyklus bez  tela
    int z;
    int soucet = 0;
    for(z = 1; z <= 5; soucet += z++);
    System.out.println("Soucet = " + soucet);
  }
}
