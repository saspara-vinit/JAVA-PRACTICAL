import java.util.*;

public class pr_9 {

    public static int length(char[] ch) {
        int count = 0;
        for (char c : ch) {
            count++;
        }
        return count;
    }

    public static void print(char arr[]) {
        for (char x : arr) {
            System.out.print(x);
        }
    }

    public static void uppercase(char arr[]) {
        for (int i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < length(arr); j++) {
                if (arr[j] == (char) i) {
                    arr[j] = (char) (i - 32);
                }
            }
        }
        System.out.print("\nUppercase : ");
        print(arr);
    }

    public static void lowercase(char arr[]) {
        for (int i = 'A'; i <= 'Z'; i++) {
            for (int j = 0; j < length(arr); j++) {
                if (arr[j] == (char) i) {
                    arr[j] = (char) (i + 32);
                }
            }
        }
        System.out.print("\nLowercase : ");
        print(arr);
    }

    public static void Reverse(char arr[]) {
        int l = length(arr);
        for (int i = 0, j = l - 1; i < l / 2; i++, j--) {
            char temp2 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp2;
        }
        System.out.print("\nReverse : ");
        print(arr);
    }

    public static void sorting(char arr[]) {
        int l = length(arr);
        char temp;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nSort : ");
        print(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String inpuString = sc.nextLine();

        char str1[] = inpuString.toCharArray();

        int l = length(str1);
        System.out.print("Length : " + l);
        uppercase(str1);
        lowercase(str1);
        Reverse(str1);
        sorting(str1);

        System.out.println("\n23DIT066 - Vinit Saspara"); 
        sc.close();
    }
}
