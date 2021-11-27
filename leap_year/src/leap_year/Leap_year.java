
package leap_year;
import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        y = sc.nextInt();
        if (y % 400 == 0) {
            System.out.printf("Leap Year.\n");
        } else if (y % 100 == 0) {
            System.out.printf("Not a Leap year.\n");
        } else if (y % 4 == 0) {
            System.out.printf("Leap Year.\n");
        } else {
            System.out.println("Not a leap year.\n");
        }
    }
    
}
