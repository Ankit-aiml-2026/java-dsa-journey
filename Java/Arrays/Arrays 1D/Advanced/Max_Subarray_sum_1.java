public class Max_Subarray_sum_1 {
   public static void maxSubarraySum(int numbers[]){
      int maxSum = Integer.MIN_VALUE;

      System.out.println("Sum of all sub arrays: ");
      for(int i=0; i<numbers.length; i++){
         for(int j=i; j<numbers.length; j++){    
            int Currsum = 0;

            for(int k=i; k<=j; k++){
               Currsum += numbers[k];
            }
            System.out.println(Currsum);
            if(Currsum >= maxSum){
               maxSum = Currsum;
            }
         }
         System.out.println();
      }
      System.out.println("Max Sum: "+maxSum);
   }

   public static void main(String[] args) {
       int numbers[] = {1, -2, 6, -1, 3};
       maxSubarraySum(numbers);
   }
}



