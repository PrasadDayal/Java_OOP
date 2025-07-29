class Rectangle{
    int length;
    int breadth;

    public int area(){
        System.out.println("Area of Rectangle is: ");
        return length * breadth;
    }

    public int perimeter(){
        System.out.println("Perimeter of Rectangle is");
        return 2* (length + breadth);
    }
}
public class Example4_Class {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();

        rec.length = 10;
        rec.breadth = 5;

        System.out.println(rec.area());
        System.out.println(rec.perimeter());
    }
}
