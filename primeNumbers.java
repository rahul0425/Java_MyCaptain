package primenumber;
import java.util.*;


public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int a=sc.nextInt();
        int k=0;
        if((a==2)||(a==3)){
            System.out.println(a+" is a prime no.");
        }
        else{
        for(int i=2;i<a/2;i++){
            if((a%i)!=0){
                k=1;
            }
            else
                k=0;
        }
        if(k==1){
            System.out.println(a+" is  a prime number");
        }
        else
             System.out.println(a+" is not a prime number");
        }
    }
    
}
