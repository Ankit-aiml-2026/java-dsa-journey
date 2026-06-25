import java.util.*;

public class Calculator_switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a= sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+': System.out.println("Addition: " + (a + b));
                        break;
            case '-': System.out.println("Subtration: " + (a - b));
                        break;
            case '*': System.out.println("Multiplication: " + (a * b));
                        break;
            case '/': System.out.printf("Division: %.2f", ((float)a / (float)b));
                        break;
            case '%': System.out.println("Remainder: " + (a % b));
                        break;
            default: System.out.println("Invalid Option");
        }
    }
}
