package employee;
import java.util.* ;

/**
 *
 * @author hp
 */
public class Employee {
    String[] name= new String[3];
        int[] year= new int[3];
        String[] address= new String[3];
        
    

  
    public static void main(String[] args) {
        Employee e1= new Employee();

        Scanner sc= new Scanner(System.in);
        System.out.println("enter employee name");
        for(int i=0;i<3;i++){
            e1.name[i]= sc.nextLine();
        }
        System.out.println("enter employee year of joining");
        for(int i=0;i<3;i++){
             e1.year[i]= sc.nextInt();
            }
        System.out.println("enter the address");
        for(int i=0;i<3;i++){
             e1.address[i]= sc.nextLine();
            
        }
        for(int i=0;i<3;i++){
        System.out.println(e1.name[i]+" "+e1.year[i]+" "+e1.address[i]);
        System.out.println();
        }
    }
    
}
