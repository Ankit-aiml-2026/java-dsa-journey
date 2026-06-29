import java.util.*;

public class UNICODE_converter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Interger to Symbol converter
        System.out.print("Enter an Integer: ");
        int number = sc.nextInt();
        System.out.println((char)number);

        //Symbol to ASCII value converter
        System.out.print("Enter an character: ");
        char ch = sc.next().charAt(0);
        System.out.println((int)ch);
    }    
}
