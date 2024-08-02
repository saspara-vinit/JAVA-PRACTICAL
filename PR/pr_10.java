import java.util.*;

public class pr_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "CHARUSAT UNIVERSITY";
        int length = str.length();
        String newString = str.replace('H', 'V');
        System.out.println("Your orignal String is : " + str);
        System.out.println("Length : " + length);
        System.out.println("Converted String is : " + newString.toLowerCase());

        // Supplimentry Experiment :
        
        // String str = "resource";
        // char[] str1 = str.toCharArray();
        // int count = 0;
        // for (int i = 'a'; i <= 'z'; i++) {
        //     count = 0;
        //     for (int j = 0; j < str1.length; j++) {
        //         if (i == str1[j]) {
        //             count++;
        //         }
        //     }
        //     if (count > 1) {
        //         System.out.println((char)i + " appears " + count + " times");
        //     }
        // }

        System.out.println("\n23DIT066 - Vinit Saspara");
        sc.close();
        
    }
}
