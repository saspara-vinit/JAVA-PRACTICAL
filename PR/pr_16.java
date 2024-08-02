
class parent {
    public void p() {
        System.out.println("This is a parant class.");
    }
};

class child extends parent {
    public void c() {
        System.out.println("This is a child class.");
    }
};

class pr_16 {
    public static void main(String[] args) {
        parent p = new parent();
        child c = new child();
        
        p.p();
        c.c();
        c.p();
    }
};