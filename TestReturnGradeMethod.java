
package testreturngrademethod;

public class TestReturnGradeMethod {

    public static void main(String[] args) {
     
      System.out.print("the grade is");
        getGrade(78.5);
        
        System.out.println("\nthe grade is"+getGrade(59.5));
        System.out.println("the grade is");
       getGrade(99.9);
    }

            public static char getGrade(double score){
              if(score>=90)
                    System.out.println('A');
              else if(score>=90)
                    System.out.println('B');
              else if(score>=70)
                    System.out.println('C');
              else if(score>=60)
                    return 'D';
              else 
              return 'F';
              return 0;
              
        
            }

    
}
