
class rectangle {
    float length, breath;

    rectangle(float l, float b) {
        length = l;
        breath = b;
    }

    public void perimeter() {
        float perimeter = 2 * (length + breath);
        System.out.println("The perimeter of Rectangle : " + perimeter);
    }

    public void area() {
        float area = length * breath;
        System.out.println("The area of Rectangle : " + area);
    }
}

class square extends rectangle {
    // float side;
    public square(float side) {
        super(side, side);
    }
}

public class pr_18 {
    public static void main(String[] args) {
        rectangle r = new rectangle(2.3f, 3.4f);
        square s = new square(3.4f);
        System.out.println("\nRectangle : ");
        r.perimeter();
        r.area();
        
        System.out.println("\nSquare : ");
        s.perimeter();
        s.area();
    }
}