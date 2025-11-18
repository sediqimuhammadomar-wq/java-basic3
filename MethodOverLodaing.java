
package methodoverlodaing;

import java.util.Scanner;


public class MethodOverLodaing {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println(max(3, 4));
         System.out.println(max(3.0, 5,4));
          System.out.println(max(3.0, 5.4,10.14));
      
    }
    public static int max(int num1, int num2){
        if(num1 > num2)
            return num1;
        else
            return num2;
    }
    
        public static int max(double num1, double num2){
        if(num1 > num2)
            return (int) num1;
        else
            return   (int)num2;
    }
        
            public static int max(double num1, double num2 ,double num3){
     return max(max(num1 , num2),num3);
    }
}


