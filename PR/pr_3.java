import java.util.Scanner;
class pr_3
{
   public static void main(String []s)
   {      
	Scanner number= new Scanner(System.in);
      System.out.print("Enter the mobile number: ");
      String mob = number.nextLine();
      System.out.println("Mobile operator code is " + mob.substring(0,2) + " MSC is " +mob.substring(2,5) + " Unique code is "+ mob.substring(5) );
      System.out.println("23DIT066 - Vinit Saspara");      }
}
