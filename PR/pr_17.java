
import java.util.*;

class Member {
    Scanner scan = new Scanner(System.in);
    String name;
    int age;
    long phone_no;
    String add;
    long salary;

    public void setdata() {
        System.out.print("Enter name: ");
        name = scan.nextLine();
        System.out.print("Enter age: ");
        age = scan.nextInt();
        System.out.print("Enter phone no: ");
        phone_no = scan.nextLong();
        scan.nextLine();
        System.out.print("Enter address: ");
        add = scan.nextLine();
        System.out.print("Enter salary: ");
        salary = scan.nextLong();
    }

    public void printSalary() {
        System.out.println("Salary : " + salary);
    }
};

class Employee extends Member {
    String specialization;
    Scanner sc = new Scanner(System.in);

    public void getdata() {
        super.setdata();
        System.out.print("Enter specialization of an Employee : ");
        specialization = sc.nextLine();
    }

    public void putdata() {
        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone NO : " + phone_no);
        System.out.println("Salary : " + salary);
        System.out.println("Address : " + add);
        System.out.println("Specialization : " + specialization);
    }

};

class Manager extends Member {
    Scanner sc1 = new Scanner(System.in);
    String department;

    public void data() {
        super.setdata();
        System.out.print("Enter Department of an Employee : ");
        department = sc1.nextLine();
    }

    public void printInfo() {
        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone NO : " + phone_no);
        System.out.println("Salary : " + salary);
        System.out.println("Address : " + add);
        System.out.println("Department : " + department);
    }
};

public class pr_17 {
    public static void main(String[] args) {
        Manager m = new Manager();
        Employee e = new Employee();

        System.out.println("For manager class : ");
        m.data();
        m.printInfo();
        System.out.println();
        System.out.println("For employee class : ");
        e.getdata();
        e.putdata();

    }
}
