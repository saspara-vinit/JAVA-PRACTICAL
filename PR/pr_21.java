
import java.util.*;

class MyCalculater {
    int sum = 0;

    public int divisor_sum(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class pr_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        MyCalculater mc = new MyCalculater();
        int sum = mc.divisor_sum(n);
        System.out.println("The sum of divisors of " + n + " is " + sum);
        sc.close();
    }
}
