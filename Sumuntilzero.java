import java.util.Scanner;

public class Sumuntilzero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in)
   int n,num,psum,nsum;
   i=1;
   while(i<=n)
   {
    System.out.println("Enter the number");
    num=sc.nextInt();
    if(num=0)
    break;
    else if(num<0)
    psum=psum+num;
    else
    nsum=nsum+num;
    i++;


   }
   System.out.println("Sum of positive numbers="+psum);
   System.out.println("sum of negative numbersq="+nsum);
    }
    
}
