package choices;
import java.util.*;
public class Choices {
    
    public static void main(String[] args){
        System.out.println("Pick any one choice:   1./HI  2./Hello  3./Hey");
        Scanner sc= new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("You said Hi");
                break;
            case 2:
                System.out.println("You said Hello");
                break;
            case 3:
                System.out.println("You said Hey");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
