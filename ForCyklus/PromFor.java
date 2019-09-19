public class PromFor{
    public static void main(String[] args){
      int soucet = 0;
      int fakt = 1;

      for (int i = 1; i <= 5; i++){
        soucet += i;
        fakt *= i;
      }
      System.out.println("Soucet se rovna " + soucet);
      System.out.println("Faktorial se rovna " + fakt);
    }
}
