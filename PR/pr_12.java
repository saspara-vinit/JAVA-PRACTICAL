
class Employee {
    String fname, lname;
    double salary;

    public Employee() {
        salary = 0.0;
        // System.out.println("fname : " + fname);..
    }

    public void set(String n1, String n2, double emp_sal) {
        fname = n1;
        lname = n2;
        if (emp_sal < 0)
            emp_sal = 0;
        salary = emp_sal;
    }

    public void get() {
        System.out.println("First Name : " + fname);
        System.out.println("Last Name : " + lname);
        System.out.println("Salary : " + salary);
    }

    public void print_sal(){
        System.out.println("Yearly salary is : " + salary);
    }

    public void reise_sal(){
        double new_sal = (salary*10)/100;
        System.out.println("Raise the salary is : " + new_sal);
    }

}

public class pr_12 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        System.out.println("\nFirst Employee : ");
        emp1.set("Vinit", "saspara",2000);
        emp1.get();

        System.out.println("\nSecond Employee : ");
        emp2.set("Rudra","saspara",39000);
        emp2.get();

        System.out.println("\nFrist Employee : ");
        emp1.print_sal();

        System.out.println("\nFirst Employee : ");
        emp1.reise_sal();

        System.out.println("\nSecound Employee : ");
        emp1.print_sal();

        System.out.println("\nSecound Employee : ");
        emp1.reise_sal();
        System.out.println("\n23DIT066 - Vinit Saspara");

    }
}
