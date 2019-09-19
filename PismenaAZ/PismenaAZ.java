public class PismenaAZ{
  public static void main(String[] args)throws java.io.IOException{

    int znak = 97;
    while (znak < 123) {
      char znakOutput = (char)znak;
      System.out.print(znakOutput);
      znak++;
    }

    do {
     System.out.println(" Pro ukonceni programu zmackni klavesu q");
   } while (System.in.read() != 'q');
  }
}
