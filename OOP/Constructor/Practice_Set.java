//Class for Cylinder
class Cylinder{
    private int radius;
    private int height;
    
    public Cylinder(){
        radius = 10;
        height = 20;
    }

    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public  int getHeight() {
        return height;
    }

    
    public void setRad(int radius){
        this.radius = radius;
    }

    public void setHei(int height){
        this.height = height;
    }

    public double SurfaceArea(){
        return 2 *  3.14 * radius * radius + 2 * 3.14 * radius * height;
    }

    public double Volume(){
        return 3.14 * radius * radius * height;
    }
}

// Class for rectangle
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        length = 10;
        breadth = 5;
    }

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength(){
        return length;    
    }
    public int getBreadth(){
        return breadth;
    }
}

public class Practice_Set {
    public static void main(String[] args) {

        Cylinder c1  = new Cylinder();
        
        // Example 1
        c1.setRad(5);
        c1.setHei(10);
        System.out.println("Radius of Cylinder is: " + c1.getRadius());
        System.out.println("Height of Cylinder is: " + c1.getHeight());
        
        // Example 2 & 3
        Cylinder cy = new Cylinder(10, 25);
        System.out.println("Surface Area of Cylinder is: " + cy.SurfaceArea());
        System.out.println("Volume of Cylinder is: " + cy.Volume());
        

        // Example 4
        Rectangle rec = new Rectangle();
        System.out.println("Length of Rectangle is : " + rec.getLength());
        System.out.println("Breadth of Rectangle is : " + rec.getBreadth());

        Rectangle rec1 = new Rectangle(15, 10);
        System.out.println("Length of Rectangle is : " + rec1.getLength());
        System.out.println("Breadth of Rectangle is : " + rec1.getBreadth());
    }
}
