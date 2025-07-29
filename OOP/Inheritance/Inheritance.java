class Base{
    int x;

    public int getX(){
        return x;
    }

    public void setX(int x){
        System.out.println("I am Setting X from Base Class.");
        this.x = x;
    }
}

class Derived extends Base{
    int y;

    public int getY(){
        return y;
    }

    public void setY(int y){
        System.out.println("I am calling from Derived Class.");
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.setX(8);
        System.out.println(d.getX());

        d.setY(80);
        System.out.println(d.getY());
    }
}
