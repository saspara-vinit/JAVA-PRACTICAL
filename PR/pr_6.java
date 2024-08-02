import java.util.Scanner;

public class pr_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : ");
        String value = sc.nextLine();
        char[] name = value.toCharArray();
        int name_length = name.length;

        System.out.print("Enter repetation : ");
        int repert = sc.nextInt();
        int i = 0, j = 0;
 
        while (j < repert) {
            i=0;
            while (i < repert) {
                System.out.print(name[j]);

                i++;
            }
            j++;
        }
        for(int k=j;k<name_length;k++){
            System.out.print(name[k]);
        }
        System.out.println("\n23DIT066 - Vinit Saspara");  
    }
}
