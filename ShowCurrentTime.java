
package show.currenttime;

import java.util.Scanner;

public class ShowCurrentTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total Milli sesonds :");
        
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
long currentSeconds = totalSeconds% 60;
long totalMinutes = totalSeconds / 60;
long currentMinutes = totalMinutes % 60;
long totalHours  = totalMinutes / 60;
long currentHours = totalHours % 60;
        System.out.println("Current time is"+currentHours+":"+currentMinutes+":"+currentSeconds+"GMT");
    }
    
}
