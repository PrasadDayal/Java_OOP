class A{
    int a;
    A(int a){
        this.a = a;
    }

    public int getA(){
        return a;
    }
}

class B extends A{
    B(int c){
        super(c);
        System.out.println("I am Derived Class");
    }
}

public class this_super_Example {
    public static void main(String[] args) {
        B b = new B(10);
        System.out.println(b.getA());
    }
}
