class Base1{
    public Base1(){
        System.out.println("I am Base Class Constructor.");
    }

    public Base1(int a){
        System.out.println("I am Base Class Constructor with Value of a: " + a );
    }
}

class Derived1 extends Base1{
    public Derived1(){
        System.out.println("I am Derived Class Constructor.");
    }

    public Derived1(int a, int b){
        super(a);
        System.out.println("I am Derived Class Constructor with value of b :" + b);
    }
}

public class Constructor_Ineritance {
    public static void main(String[] args) {
        Derived1 d1 = new Derived1(10, 20);
    } 
}
