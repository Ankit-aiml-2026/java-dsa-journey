public class Pairs_in_Array {

   public static void pairArray(int number[]){

      int count = 0; 
      for(int i=0; i<number.length; i++){

         for(int j=i+1; j<number.length; j++){
            System.out.print("(" + number[i] + ","+ number[j] +") ");
           
            count++;
         }
         System.out.println();
      }
      System.out.print("Total Pairs: " + count);
   }

   public static void main(String[] args) {
       int number[] = {2, 4, 6, 8, 10};

       pairArray(number);
   }
}


