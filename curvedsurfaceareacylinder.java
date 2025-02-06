import java.util.Scanner;

public class curvedsurfaceareacylinder {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("ENter the radius of the cylinder:");
        double radius=scanner.nextDouble();
        System.out.print("Enter the height of the cylinder:");
        double height= scanner.nextDouble();
        double curvedSurfaceArea=2*Math.PI*radius*height;
        System.out.println("Curved Surface Area of the Cylinder: "+ curvedSurfaceArea);
        scanner.close();
        
    }
    
}
