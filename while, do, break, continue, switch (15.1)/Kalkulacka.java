public class Kalkulacka {
	public static void main (String[] args) {
        int cisloA, cisloB, x;
        char oper;

        cisloA = 21;
        cisloB = 4;
        x = 0;
        oper = '+';
        if (cisloB == 0 & oper == '/') {
          System.out.println("Error");
        } else { 
            switch (oper) {
                case '+': x = cisloA + cisloB; break;
                case '-': x = cisloA - cisloB; break;
                case '*': x = cisloA * cisloB; break;
                case '/': x = cisloA / cisloB; break;
                default: System.out.println("Error"); 
            }
        System.out.println("Vyledek = "+ x);
        }
    }
}