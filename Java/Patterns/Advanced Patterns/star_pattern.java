import java.util.*;

public class star_pattern {

   public static void star(int n){
      int count = 1;

      //1. upper part

      for(int i = n+1; i>=1; i--){
         for(int j = n; j<1; j--){
            System.out.print(" ");
         }
         for(int j = i+n; j>n+1; j--){
            System.out.print(" ");
         }
         for(int j = 0; j<=(n*2)-2; j++){
            if(i == 1){
               System.out.print("*");
            }
            else{
               System.out.print(" ");
            }
         }
         for(int j = 1; j<=(count * 2)-1; j++){
            System.out.print("*");
         }
         for(int j = 0; j<=(n*2); j++){
            if(i == 1){
               System.out.print("*");
            }
         }
         count++;
         System.out.println();
      }

      //2. Middle Part

      int a = 1;
      for(int i = n; i>=1; i--){
         for(int j = n-1; j>=i; j--){
            System.out.print(" ");
         }
         for(int j = 1; j<=(i*2)-1; j++){
            System.out.print("*");
         }
         for(int j = 1; j<=n*2; j++){
            System.err.print(" ");
         }
         for(int j = 0; j<(a*2); j++){
            System.out.print(" ");
         }
         a++;
         for(int j = (i*2)-1; j>=1; j--){
            System.out.print("*");
         }
         System.out.println();
      }

      // 3. Lower Part
      int cou = 0;
      for(int i =0; i<=n; i++){
         for(int j=n-1; j<=(n+n+i)-3; j++){
            System.out.print(" ");
         }
         int b = n -cou;
         for(int j = (b*2)+1; j>=1; j--){
            System.out.print("*");
         }
         
         for(int j = 0; j<=(i*2)-1; j++){
            System.out.print(" ");
         }

         b = n -cou;
         for(int j = (b*2)+1; j>=1; j--){
            System.out.print("*");
         }
         cou++;
         System.out.println();
      }
   }

   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);

      System.out.println("Enter 0 to exit: ");
      while(true){
         System.out.print("Enter a number to print star: ");
         int n = sc.nextInt();
         if(n == 0){
            System.out.print("Exiting...");
         }
         star(n);
      }
   }
}
