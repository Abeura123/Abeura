public class sumcalculator {
    public static void main(String[]args){
        Scanner scanner=new scanner(System.in);
        int sumNegative=0;
        int sumPositiveEven=0;
        int sumPositiveOdd=0;
        while(true){
            System.out.print("Enter anumber(0 to terminate):");
            int num=scanner.nextInt();
            if(num==0){
                break;
            }else if(num<0){
                sumNegative+=num;

            }else if (num%2==0){
                sumPositiveEven+=num;
            }else{
                sumPositiveOdd+=num;
            }
        }
        System.out.println("Sum of negative numbers:" +sumNegative);
        System.out.println("Sum of positive even numbers: "+sumPositiveEven);
         

    }
    
}
