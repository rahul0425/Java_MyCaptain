package minutes;
import java.util.*;
public class Minutes {

    public static void main(String[] args) {
        System.out.println("Enter the no. of minutes=");
        Scanner sc= new Scanner(System.in);
        int min= sc.nextInt();
        int y,d;
        y= min/525600;
        d=(min%525600)/1440;
        System.out.println(min+" min= "+y+ " years"+d+" days");
    }
    
}
