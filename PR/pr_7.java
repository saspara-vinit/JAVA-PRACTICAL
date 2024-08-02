import java.util.Scanner;

public class pr_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter How Many Element You Want in Array : ");
         n = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
        System.out.print("Enter Element " + (i + 1) + " : ");
        arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
        if (arr[i] == 9) {
        count++;
        }
        }
        System.out.println("9 is in this Array : " + count + " times");


        // Supplementery Expiriment :
        // System.out.print("Enter your String : ");
        // String inputString = sc.nextLine();
        // System.out.print("Which word is replace write : ");
        // String word = sc.nextLine();
        // System.out.print("Which word is replace with : ");
        // String word2 = sc.nextLine();
        // String replcingString = inputString.replaceAll(word, word2);
        // System.out.println(replcingString);
        System.out.println("\n23DIT066 - Vinit Saspara");  
    }
}
