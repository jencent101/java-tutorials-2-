
package fibo_series;
import java.util.Scanner;

public class Fibo_series {

    public static void main(String[] args) {
        int first = 0, second = 1, third;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a limiting no:");
        n = sc.nextInt();
        third = first + second;
        while (third <= n) {
            third = first + second;
            System.out.printf("%d,\n", third);
            first = second;
            second = third;
        }
    }
}
