//Made by: Adam Bárta
public class PrikazSwitch{
  public static void main(String[] args){
    int data = 2;

    for(int i=0; i<10; i++){
      switch(i){
        case 0:
          System.out.println("Promena se rovna 0");
          //vlozeny switch
          switch(data){
            case 1: System.out.println("Error");
            break;
            case 2: System.out.println("Epic Error");
            break;
          }
          break;
        case 1:
          System.out.println("Promena se rovna 1");
          break;
        case 2:
          System.out.println("Promena se rovna 2");
          break;
        case 3:
          System.out.println("Promena se rovna 3");
          break;
        case 4:
          System.out.println("Promena se rovna 4");
          break;
        default:
          System.out.println("Promena se rovna 5 nebo je vetsi");
      }
    }
  }
}
