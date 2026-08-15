public class Max_Subarray_sum_3_Kadan_pos_neg {

   public static void pos_neg_Kadan(int numbers[]){

      int cs = numbers[0];
      int ms = numbers[0];

      for(int i=0; i<numbers.length; i++){

         cs = Math.max(numbers[i], cs+ numbers[i]);
         ms = Math.max(ms, cs);
      }
      System.out.print(ms);
   }

   public static void main(String[] args){
      int numbers[] = {1, -2, 6, -1, 3};

      pos_neg_Kadan(numbers);
   }
}
