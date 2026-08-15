import java.util.*;

public class BUbbleSorting_with_asceding_desceding {

   public static void BubbleSort(int[] arr, char a_d){
      for(int i=0; i<arr.length-1; i++){
         for(int j=0; j<arr.length-1-i; j++){
            
            if((a_d == '<' && arr[j] > arr[j+1]) || (a_d == '>' && arr[j] < arr[j +1])){
               int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
            }
         }
      }

      //print sorted array
      for(int i=0; i<arr.length; i++){
         System.out.print(arr[i] + " ");
      }
   }

   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      char a_d;
      System.out.print("Enter the size of array: ");
      int n = sc.nextInt();
      int arr[] = new int[n];

      System.out.print("Enter elements in array: ");
      for(int i=0; i<n ; i++){

         while(true){

            try {
               arr[i] = sc.nextInt();
               break;    
            }
            catch (InputMismatchException e) {
               System.out.print("Please, enter only integers: ");
               sc.next();
            }
         }

      }
      
      do{
         System.out.println("Please select sorting order of array:");
         System.out.println("1.Ascending: enter '<'");
         System.out.println("2.Desceding: enter '>'");
         a_d = sc.next().charAt(0);

         if(a_d == '<' || a_d  =='>'){
            break;
         }else{
            System.out.print("Invalid Input!");
         }
      }while(true);
      
      BubbleSort(arr, a_d);
   }
}
