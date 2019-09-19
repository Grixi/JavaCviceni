public class Preskoc5 {
	public static void main (String[] args) {
        int suma = 0;
        int x = 0;
        while(suma != 10) {
            suma++;
            x = suma%2;
            if (x == 1) {
                continue;
            }
            System.out.println(suma);
        }

    }
}
