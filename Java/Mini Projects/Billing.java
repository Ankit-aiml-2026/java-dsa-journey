import java.util.*;

public class Billing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of:\n1.Pencil\n2.Pen\n3.Erasor");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float erasor = sc.nextFloat();

        float total =(pencil + pen + erasor) + (pencil + pen + erasor)*18/100;

        System.out.println("Your Bill:\nPencil:\t\t"+ pencil +"\n" + "Pen:\t\t" + pen + "\n" +"Erasor:\t\t" + erasor +"\n" + "GST:\t\t" + "+18%");
        System.out.println("____________________");
        System.out.print("Total Bill:\t" + total);
    }
}
