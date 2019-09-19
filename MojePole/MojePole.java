import java.util.Random;
import java.util.Arrays;

public class MojePole {


    public static void main(String[] args) {
      MojePole mp = new MojePole();



      mp.printPole(mp);


      }
    public void printPole(MojePole mp){
      int[] pole = new int[10];
      for (int i = 0; i < 10; i++) {
        int randomNumber = (int) (Math.random() * 10 + 1);
        pole[i] = randomNumber;
      
    }
    Arrays.sort(pole);
    for (int i = 0; i < 10; i++) {
      System.out.print(pole[i] + " ");
    }


  }


}
