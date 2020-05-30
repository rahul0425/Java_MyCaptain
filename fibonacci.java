public class Fibonacci {

    public static int fibonacci(int c){
        if(c==0){
            return 1;
        }
        if(c==1)
            return 1;
        else{
            return fibonacci(c-1)+fibonacci(c-2);
        }
    }
    public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.println("enter the no. of terms=");
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        System.out.print("fibonacci series for "+ t+" terms="+a+" "+b);
        for(int i=1;i<=t;i++){
            c= a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
            
        }
        System.out.println("using recursion"+ " "+fibonacci(t));
    }
    
}
