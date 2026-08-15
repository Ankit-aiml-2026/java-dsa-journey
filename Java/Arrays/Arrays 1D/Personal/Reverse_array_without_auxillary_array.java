import java.util.*;

public class Reverse_array_without_auxillary_array {
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);

       System.out.print("Enter the size of array: ");
       int n = sc.nextInt();
       System.out.println("Enter elements in array: ");
       int arr[] = new int[n];

       for(int i=0; i<arr.length; i++){
         arr[i] = sc.nextInt();
       }

       for(int i=0; i<n/2; i++){
         int temp = arr[i];
         arr[i] = arr[n-i-1];
         arr[n-i-1] = temp;
       }

       for(int i=0; i<arr.length; i++){
         System.out.print(arr[i] + " ");
       }
   }
}
