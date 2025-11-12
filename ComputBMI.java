
package computbmi;

import java.util.Scanner;

public class ComputBMI {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the wight whit kg :");
        double wight = in.nextDouble();
        System.out.println("Enter the height :");
         double height = in.nextDouble();
         
        double bmi = wight/(height*height) ;
        
        System.out.println("BMI is"+bmi);
        if(bmi <18.5)
            System.out.println("UnderWight");
        
              else  if(bmi <25)
            System.out.println("Normal");
            
               else  if(bmi <30)
            System.out.println("OwerWight");
               else
            System.out.println("Obese");
    }
    
}
