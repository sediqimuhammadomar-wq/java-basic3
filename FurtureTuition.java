
package furturetuition;

public class FurtureTuition {

    public static void main(String[] args) {
       
        int year = 0;
        double tuition = 10000;
        while(tuition < 20000){
            tuition *= 1.07;
            year++;
        }
        System.out.println("Tuition will be doubled in"+year+"years");
        System.out.printf("Tuition will be $%.2f in %1d years",tuition,year);
    }
    
}
