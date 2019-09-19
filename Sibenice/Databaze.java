public class Databaze{
  public String ulozSlova(){
    String[] databaze = {"auto", "pocitac", "skola","internet"};
    String slovo = databaze[(int)(Math.random()*databaze.length)];

    return slovo;
  }
}
