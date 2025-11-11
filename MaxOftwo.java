

package maxoftwo;
import java.util.Scanner;
        
public class MaxOftwo {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in) ;
    
    int a=input.nextInt();
    int b=input.nextInt();
    
    if(a>b)
        System.out.println("A:="+a);
    else
        System.out.println("B:="+b);
    }
    
}
