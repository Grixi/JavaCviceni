//Made by: Adam Bárta
public class Navesti{
  public static void main(String[] args){
    mojeNavesti: for(int i = 1; i <= 10; i++){

      if(i%5 != 0) continue mojeNavesti;
      System.out.println("Skok na navesti");
    }
  }
}
