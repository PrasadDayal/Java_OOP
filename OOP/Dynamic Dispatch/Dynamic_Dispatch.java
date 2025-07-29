class Phone{
    void greet(){
        System.out.println("Hello, Good Morning!");
    }

    void display(){
        System.out.println("Hii, I am Phone...");
    }
}

class Smartphone extends Phone {
    void msg() {
        System.out.println("Hello, Good Morning");
    }

    void display(){
        System.out.println("Hii, I am Smartphone...");
    }
}

public class Dynamic_Dispatch {
    public static void main(String[] args) {
        Phone smart = new Smartphone();
        smart.greet(); 
        smart.display();// Dynamic Dispatch in action
        // The method display() of Smartphone class is called, not Phone class
    }
}
