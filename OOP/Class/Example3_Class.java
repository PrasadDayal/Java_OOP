class Square{
    int side;

    public int area(){
        System.out.println("Area of Square is:");
        return side * side;
    }

    public int perimeter(){
        System.out.println("Perimeter of Square:");
        return 4 * side;
    }
}
public class Example3_Class {
    public static void main(String[] args) {
        Square sq = new Square();

        sq.side = 5;

        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
