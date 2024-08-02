
    import java.util.*;

    class complex {
        int real;
        int image;

        public void set(int r, int i) {
            real = r;
            image = i;
        }

        public complex add(complex x) {
            complex temp = new complex();
            temp.real = real + x.real;
            temp.image = image + x.image;
            return temp;
        }

        public complex sub(complex x) {
            complex temp = new complex();
            temp.real = real - x.real;
            temp.image = image - x.image;
            return temp;
        }

        public complex mul(complex x) {
            complex temp = new complex();
            temp.real = ((real * x.real) - (image * x.image));
            temp.image = ((real * x.image) + (image * x.real));
            return temp;
        }

        public void printNumber() {
            System.out.println(real + " + (" + image + "i)");
        }
    }

    public class pr_15 {
        public static void main(String[] args) {
            complex c1 = new complex();
            complex c2 = new complex();
            complex c3 = new complex();

            Scanner sc = new Scanner(System.in);

            System.out.print("\nFirst a + bi, Enter a and b : ");
            c1.set(sc.nextInt(), sc.nextInt());

            System.out.print("Second a + bi, Enter a and b : ");
            c2.set(sc.nextInt(), sc.nextInt());

            System.out.print("\nSum is : ");
            c3 = c1.add(c2);
            c3.printNumber();

            System.out.print("\nSubtraction is : ");
            c3 = c1.sub(c2);
            c3.printNumber();

            System.out.print("\nMultiplication is : ");
            c3 = c1.mul(c2);
            c3.printNumber();
            System.out.println("\n23DIT066 - Vinit Saspara");

            sc.close();

        }
    }
