
class degree {
    public void getDegree() {
        System.out.println("I got a Degree.");
    }
}

class Undergraduate {
    public void print() {
        System.out.println("I am an Undergraduate.");
    }
}

class Postgraduate {
    public void print() {
        System.out.println("I am an Postgraduate.");
    }
}

public class pr_20 {
    public static void main(String[] args) {
        degree d = new degree();
        d.getDegree();
        Undergraduate u = new Undergraduate();
        u.print();
        Postgraduate p = new Postgraduate();
        p.print();
    }
}
