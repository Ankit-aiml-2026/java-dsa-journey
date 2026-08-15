public class Reverse_array {

   public static int[] reverseArray(int numbers[]){
      int new_arr[] = new int[numbers.length];
      int j=0;
      for(int i=numbers.length-1; i>= 0; i--){
         new_arr[j] = numbers[i];
         j++;
      }
      return new_arr;
   }

   public static void main(String[] args) {
      int numbers[] = {10, 8, 6, 4, 2}; 

      System.out.print("Original Array: ");
      for(int i=0; i<numbers.length; i++){
         System.out.print(numbers[i] + " ");
      }

      int new_arr[] = reverseArray(numbers);

      System.out.println("\nReverse Array:");
      for(int i=0; i<new_arr.length; i++){
         System.out.print(new_arr[i]+ " ");
      }
   }
}
