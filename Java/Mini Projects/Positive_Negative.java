import java.util.Scanner;

public class Positive_Negative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        String num = (n >= 0)?"Positive number":"Negative number";
        System.out.println(num);
    }
}
