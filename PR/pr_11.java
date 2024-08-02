
import java.util.*;



public class pr_11 {

        public static int pound_to_money(int pound) {
            return (pound*100);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the amount of pounds: ");
           int p = sc.nextInt();
           int rupee = pound_to_money(p);
           System.out.println(p + " pound in Rupee : " + rupee);
           System.out.println("\n23DIT066 - Vinit Saspara");
           sc.close();
        }
}
