
import java.util.*;

interface shap {
    public void input();

    public void output();
}

class signs {
    Scanner sc = new Scanner(System.in);
    double area;
    String color;
    String text;

    public void set_area(double Area) {
        area = Area;
    }

    public void set_color() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color :: ");
        color = sc.nextLine();
    }

    public void set_text() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text :: ");
        text = sc.nextLine();
    }

    public double get_area() {
        return area;
    }

    public String get_color() {
        return color;
    }

    public String get_text() {
        return text;
    }

}

class circle extends signs implements shap {
    double r;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter redius :: ");
        r = sc.nextDouble();
        area = r * r * 3.14;
        set_area(area);
    }

    public void output() {
        System.out.println("Area of the circle is :: " + get_area());
        System.out.println("Redious of the cicle is :: " + r);
        System.out.println("Color of circle :: " + get_color());
        System.out.println("Text of circle :: " + get_text());
    }
}

class rectangle extends signs implements shap {
    double l, b;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth of the ractangle :: ");
        l = sc.nextDouble();
        b = sc.nextDouble();
        area = l * b;
        set_area(area);
    }

    public void output() {
        System.out.println("Length of the ractangle is :: " + l);
        System.out.println("Breadth  of the ractangle is :: " + b);
        System.out.println("Area of the ractangle is :: " + get_area());
        System.out.println("Color of ractangle :: " + get_color());
        System.out.println("Text of ractangle :: " + get_text());
    }
}

public class pr_22 {
    public static void main(String[] args) {

        int choice;
        System.out.println("Enter 1->find circle area");
        System.out.println("Enter 2->find ractangle area");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice :: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                circle c = new circle();
                c.input();
                c.set_color();
                c.set_text();
                System.out.println();
                c.output();
                break;

            case 2:
                rectangle r = new rectangle();
                r.input();
                r.set_color();
                r.set_text();
                System.out.println();
                r.output();
                break;

            default:
                System.out.println(":::::::::::::: Enter valide choice ::::::::::");
                break;
        }
    }
}
