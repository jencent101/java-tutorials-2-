
package fact_rec;
import java.util.Scanner;

public class Fact_rec {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter a no: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.printf("Factorial is: %d\n", factorial(n));
    }
    public static int factorial(int n) {
        if (n == 0){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
}
