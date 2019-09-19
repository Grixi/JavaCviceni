//Made with <3 by Adam Bárta
import java.util.Scanner;

class BasicOperation {

    String vratInput(Scanner sc){
        System.out.println("Zadej co chceš vypočítat");
        return sc.nextLine();
    }

    char vratZnamenko(String input){

        if (input.indexOf('+') >= 0) {
            return '+';
        } else if (input.indexOf('-') >= 0) {
            return '-';
        } else if (input.indexOf('/') >= 0) {
            return '/';
        } else if (input.indexOf('*') >= 0) {
            return '*';
        } else {
            System.out.println("Nebylo zadáno znaménko. Prosím zadejte příklad znovu.");
            return 'e';
        }
    }

    int vratZnamenkoIndex(String input, char znamenko){
        return input.indexOf(znamenko);
    }

    Double vratPrvniCast(String input, int poziceZnaku){
        return Double.parseDouble(input.substring(0, poziceZnaku));
    }

    Double vratDruhouCast(String input, int poziceZnaku){
         return Double.parseDouble(input.substring(poziceZnaku+1));
    }

    Double vypocitej(Double prvniCast, Double druhaCast, char znamenko){
        switch (znamenko){
            case '+': return prvniCast + druhaCast;
            case '-': return prvniCast - druhaCast;
            case '*': return prvniCast * druhaCast;
            case '/': return prvniCast / druhaCast;
            default: return 0.0;
        }
    }
}

class EasyCalc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");
        EasyCalc main = new EasyCalc();
        BasicOperation operation = new BasicOperation();

        String input;
        char znamenko;
        int poziceZnaku;
        Double vysledek;
        Double prvniCast;
        Double druhaCast;

        input = operation.vratInput(sc);
        znamenko = operation.vratZnamenko(input);
        poziceZnaku = operation.vratZnamenkoIndex(input, znamenko);
        prvniCast = operation.vratPrvniCast(input, poziceZnaku);
        druhaCast = operation.vratDruhouCast(input, poziceZnaku);

        vysledek = operation.vypocitej(prvniCast, druhaCast, znamenko);
        System.out.println("Vysledek je: " + vysledek);
    }
}