
package formatdemoo;

import java.util.Scanner;

public class FormatDemoo {

    public static void main(String[] args) {
        
        Scanner inptu = new Scanner(System.in);
       
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n","Degrees","Radians","sin","cos","tan");
        
        
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",degrees,radians , Math.sin(radians),Math.cos(radians),Math.tan(radians));
  
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",degrees,radians , Math.sin(radians),Math.cos(radians),Math.tan(radians));
  
                degrees = 90;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n",degrees,radians , Math.sin(radians),Math.cos(radians),Math.tan(radians));
  
    }
    
}
