
package area.of.circle;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
      

    int radius = input.nextInt();
    double area = radius*radius*3.14;
    double perimeter = 2 * radius*3.14;
        System.out.println("area =" +area); 
        System.out.println("perimeter =" +perimeter); 
    
  
    }
    
}
