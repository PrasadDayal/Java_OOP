public class Demo_method_overload {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Demo_method_overload demo = new Demo_method_overload();

        System.out.println("Sum of 2 integers: " + demo.add(10, 20));           
        System.out.println("Sum of 3 integers: " + demo.add(10, 20, 30));     
        System.out.println("Sum of 2 doubles: " + demo.add(5.5, 3.2));          
    }
}
