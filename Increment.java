
package increment;

public class Increment {

    public static void main(String[] args) {
        
        int x = 1;
        System.out.println("befor the call x is"+x);
        incerment(x);
        System.out.println("after the call x is"+x);
         }
        public static void incerment(int n){
            n++;
            System.out.println("n side the method is"+n);
       
    }
    
}
