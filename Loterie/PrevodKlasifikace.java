
public class PrevodKlasifikace {

    public static void main(String[] args) {

        int insertedValue;

        System.out.println("Inserted value: " + args[0]);

        insertedValue = Integer.parseInt(args[0]);

        if (insertedValue < 50) {
            System.out.println("Mas 5");
        }
        else if  (insertedValue < 70 && insertedValue >= 60) {
            System.out.println("Mas 4");
        }
        else if (insertedValue < 80 && insertedValue >= 70) {
            System.out.println("Mas 3");
        }
        else if (insertedValue < 90 && insertedValue >= 80) {
            System.out.println("Mas 2");
        }
        else if (insertedValue >= 90) {
            System.out.println("Mas 1");
        }
    }
}