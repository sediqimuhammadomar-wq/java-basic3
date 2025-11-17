 
package hexdigit2dec;

import java.util.Scanner;

public class HexDigit2Dec {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter hexa digit :");
        String hex = input.nextLine();
        
        if(hex.length() != 1){
            System.out.println("you most exactly one character");
System.exit(1);        }

char ch = Character.toUpperCase(hex.charAt(0));
if('A'<=ch && ch <='F'){
        int value = ch - 'A'+10;
        System.out.println("the decemal value for hex"+ch+"is"+value);
}
else if(Character.isDigit(ch)){
    System.out.println("the decemal value for hex digit "+ch+"is"+ch);
                
                }
else{
    System.out.println(ch+"is an invalid input ");
}
    
    }
    
}
