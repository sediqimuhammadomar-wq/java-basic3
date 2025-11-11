
package palindrome;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
     
        Scanner myscanner = new Scanner(System.in);
  
    
            System.out.println("Enter a string :");
   String x = myscanner.nextLine();
    int low = 0;
    int high =x.length()-1;
    boolean isPalindrom = true;
    while(low<high){
        if(x.charAt(low) != x.charAt(high)){
            isPalindrom = false;
            break;
        }
        low++;
        high--;
    }
    if(isPalindrom){
        System.out.println(x+"is palindrome");
    }
    else{
        System.out.println(x+"is not palindrome");
    }}
    
}
