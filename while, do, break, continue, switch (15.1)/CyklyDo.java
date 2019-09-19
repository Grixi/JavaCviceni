public class CyklyDo {
	public static void main (String[] args) {
        int suma = 0;
        int x = 10;
        do {
            suma+= x;
            System.out.println("Suma + 10");
        } while (suma != 100);
        
        System.out.println("Suma= "+suma);
    }
}
