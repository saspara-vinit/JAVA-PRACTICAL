
class shape{
    public void print(){
        System.out.println("This is a shape.");
    }
}

class rectangle extends shape{
    public void print(){
        System.out.println("This is a rectangle shape.");
        super.print();
    }
}

class square extends rectangle{
    public void print(){
        System.out.println("Square is a rectangle.");
        super.print();
    }
}

class circle extends shape{
    public void print(){
        System.out.println("This is a circle shape.");
    }
}

public class pr_19 {
    public static void main(String[] args) {
        square s = new square();
        s.print();
        
    }
}
