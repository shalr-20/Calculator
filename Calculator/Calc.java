import java.util.*;
public class Calc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Press 1 to proceed: ");
        int n= sc.nextInt();
        do{
            if(n==1){
                System.out.print("Enter 2 integers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                System.out.print("Enter an operator(+,-,*,/): ");
                char op=sc.next().charAt(0);
                
                switch(op){
                case '+':System.out.format("%d+%d=%d\n",a,b,a+b);
                break;
                case '-':System.out.format("%d-%d=%d\n",a,b,a-b);
                break;
                case '*':System.out.format("%d*%d=%d\n",a,b,a*b);
                break;
                case '/':System.out.format("%d/%d=%d\n",a,b,a/b);
                break;
            
                default: System.out.print("ERROR!");
                }
            }            
            System.out.print("Want to continue? YES(1) or NO(0): ");
            n=sc.nextInt();
        }
        while(n==1);
    }
}