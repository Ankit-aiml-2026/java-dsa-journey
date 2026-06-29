import java.util.*;

public class Leap_year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        
        int a = year % 4;
        int b = year % 100;
        int c = year % 400;

        for(int i = year; i<= 2030; i++){
            if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
                System.out.println(i +" is a leap year");
            }
            else{
                System.out.println(i +" is not a leap year");
            }
        }  
    }
}
