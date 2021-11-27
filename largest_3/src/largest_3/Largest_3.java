
package largest_3;

public class Largest_3 {

    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;
        if (a > b && a > c) {
            System.out.println(a + " is greatest.");
        } else if (b > a && b > c) {
            System.out.println(b + " is greatest.");
        } else if (c > b && c > a) {
            System.out.println(c + " is greatest.");
        }
    }
    
}
