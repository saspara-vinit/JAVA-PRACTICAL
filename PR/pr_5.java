
// import java.io.*;
// import java.util.Random;
// import java.util.random.*;
import java.util.*;

public class pr_5 {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(100);
        int i=0;
        Scanner sc = new Scanner(System.in);
        while(i!=5){
            System.out.println("Guess the any Number between 1 to 100");
            // System.out.print("Enter your Number : ");
            int n = sc.nextInt();
            if(n>=(x+10)){
                System.out.println("too High");
            }
            else if(n==x){
                System.out.println("You Win");
            }
            else
            {
                System.out.println("too Low");
            }
            i++;
        }
        System.out.println( "Answer is : " + x);
        System.out.println("23DIT066 - Vinit Saspara");  
    }
}
