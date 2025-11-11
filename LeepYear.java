
package leepyear;
import java.util.Scanner;

public class LeepYear {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   
    int year=input.nextInt();
   if((year%4==0&&year%100!=0)||(year%400==0))
   System.out.println("leep year yes"); 
   else
        System.out.println("leep year no");
    } 
}
