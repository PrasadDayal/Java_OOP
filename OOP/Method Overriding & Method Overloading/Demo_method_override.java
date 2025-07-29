class A1{
    int a;
    
    public int Display(){
        return a;
    }

    void method1(){
        System.out.println("I am Method 1 from class A1.");
    }
}

class B1 extends A1{
    @Override
    void method1(){
        System.out.println("I am Method 1 from class B1.");
    }
}

public class Demo_method_override {
    public static void main(String[] args) {
        B1 b = new B1();
        b.method1();
    }
}
