
package factorial;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int n, f = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        n = sc.nextInt();
        for (int i =1; i <= n; i++) {
            f *= i;
        }
        System.out.println("Factorial is: " + f);
    }
    
}
