
package exercisechapterfour;

import java.util.Scanner;

public class ExerciseChapterFour {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
   // (4:1) Geometry: area of pentagone .
    /*    System.out.println("Enter the valu of the lenght from the center ."); 
   double r = input.nextDouble();
   double s = 2*r*Math.sin(Math.PI/5);
   double areaOfPentagone = 5*s*s / (4*(Math.tan(Math.PI/5)));
        System.out.println("areaOfPentagone is "+areaOfPentagone);*/
    
    
    //  (4:2) Geometry gteat circle distance.
      /*  System.out.println("Enter latitude and longitude of point1");
    double x1 = input.nextDouble() ,y1 = input.nextDouble(); 
    
          System.out.println("Enter latitude and longitude of point2");
    double x2 = input.nextDouble() ,y2 = input.nextDouble();
    double radius = 6371.01;
    double d = radius*(Math.acos(Math.sin(x1)*Math.sin(x2))+(Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2)));
        System.out.println("d is"+d);*/
    
      //  (4:4) Geometry area of a hexagone .
  /*  System.out.println("Enter the valu of the lenght from the center ."); 
   double r = input.nextDouble();
   double s = 2*r*Math.sin(Math.PI/6);
   double areaOfPentagone = 6*s*s / (4*(Math.tan(Math.PI/6)));
        System.out.println("areaOfPentagone is "+areaOfPentagone); */
    
    //   (4:5) Geometry area of regular polygon  .
  /* System.out.println("Enter the valu of the lenght from the center ."); 
        System.out.println("Enter the number of side");
        int n = input.nextInt();
   double s = input.nextDouble();
  
   double areaOfPentagone = (n*s*s) / (4*(Math.tan(Math.PI/n)));
        System.out.println("areaOfPentagone is "+areaOfPentagone); */
    
   String phoneNumber = input.next();

  if(phoneNumber.startsWith("077") &&  phoneNumber.length() ==10) {
      System.out.println("This number is for MTN");
  }  }
    
}
