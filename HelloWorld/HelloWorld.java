public class HelloWorld{

    public static void main(String[] args){
        boolean pravda;
        byte maleCislo;
        char znak;
        int cislo;
        short kratkeCislo;

        maleCislo = 127;
        pravda = true;
        znak = 'b';
        cislo = 2147483647;
        kratkeCislo = 32767;



        System.out.println("HelloWorld");

        if (pravda == true){
          System.out.println("pravda = true");
        } else {
          System.out.println("pravda = true");
        }

          System.out.println("Pokud je byte vetsi nez 128, program pri kompilaci vypise - error: incompatible types: possible lossy conversion from int to byte");
          System.out.println("Pokud ma char vice jak 1 znak, program vypise - error: unclosed character literalznak = 'bt';^HelloWorld.java:9: error: unclosed character literalznak = 'bt';HelloWorld.java:9: error: not a statementznak = 'bt';");
          System.out.println("Pokud je int vetsi nez 2147483647, program vypise - error: integer number too large: 2147483648");
          System.out.println("Pokud je short vetsi nez 32768, program vypise - error: incompatible types: possible lossy conversion from int to short");
    }
}
