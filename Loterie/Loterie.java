
public class Loterie {

    public static void main(String[] args) {

        int insertedValue;
        int randomValue;

        if (args.length == 0){
            System.out.println("Insert a value!");
        } else {
            System.out.println("Inserted value: " + args[0]);
            
            insertedValue = Integer.parseInt(args[0]);
            System.out.println("Integer: " + insertedValue);
            
            randomValue = (int)Math.round(Math.random()*10);
            System.out.println("Random: " + randomValue);

            if (insertedValue == randomValue){

                System.out.println(" WIN WIN WIN !!! ");

            } else {

                System.out.println(" LOST LOST LOST !!! ");

            }

        }
        
    }
}