
package perimeterrectangle;
import java.util.Scanner;
public class PerimeterRectangle {

    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("width:");
    double width=input.nextDouble();
    double lenght=input.nextDouble();
        System.out.println("enght");
    double perimeter=2*(width+lenght);
        System.out.println("Perimeter:="+perimeter);
    }
    
}
