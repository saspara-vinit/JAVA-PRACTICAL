import java.util.*;

class area{
    int length,width;
    area(int l,int w){
        length=l;
        width=w;
    }

    public void returnArea(){
        System.out.println("Area of rectangle is "+(length*width));
    }
}

public class pr_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length and width of rectangle : ");
        int rl = sc.nextInt();
        int rw = sc.nextInt();
        area a = new area(rl,rw);
        a.returnArea();
        System.out.println("\n23DIT066 - Vinit Saspara");

        sc.close();
    }
}
