public class Plocha_bytu {
	public static void main (String[] args) {
        int M = 0;
        int X;          
        int Byt;

        int a = 1;
        int b = 3;
        int c = 5;
        int koupelna = 5;
        int kuchyne = 15;
        int zachod = 1;

        X = b;
        
        for (int i = 0; i <= X; i++) {
            M+= i;
        }

        Byt = koupelna+ kuchyne+ zachod+ (M*10);

        System.out.println("Plocha BJ kategorie "+X+" je "+ Byt);
    }
}