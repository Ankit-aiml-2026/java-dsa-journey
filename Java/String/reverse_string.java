import java.util.*;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st String: ");
        String s1 = sc.next();
        System.out.print("Enter 2nd String: ");
        String s2 = sc.next();
        String re = s1 + " " + s2;
        String n="";
        for(int i = re.length() -1; i>=0; i--){
            n += re.charAt(i);
        }
        System.out.print(n);
    }
}
