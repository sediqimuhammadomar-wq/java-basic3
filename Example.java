
package example;

public class Example {

    public static void main(String[] args) {
  
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        
        if(num % 2 ==0 && num %3 ==0)
            System.out.println("it is divisib le by 2 and 3 ;");
   
           if(num % 2 ==0 ||num %3 ==0)
            System.out.println("it is divisib le by 2 or 3 ;");
    
           if(num % 2 ==0 ^ num %3 ==0)
            System.out.println("it is divisib le by 2 0r 3 not both;");
    }
    
}
