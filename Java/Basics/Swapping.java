import java.util.*;

public class Swapping{
    public static void main(String args[]) {

        System.out.print("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a: " + a + "\n" + "b: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Updated value a: " + a + " and " + b);
    }
}