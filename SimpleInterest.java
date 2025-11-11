
package simpleinterest;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     double p=input.nextDouble();
     double r=input.nextDouble();
     double t=input.nextDouble(); 
  
    double si=(p*r*t)/100;
        System.out.println("SimpleInterest="+ si);
        
    }
    
}
