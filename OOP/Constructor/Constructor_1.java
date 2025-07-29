class Student_1{
    private int roll_no;
    private String name;

    //Default Constructor
    public Student_1(){
        roll_no = 10;
        name = "Ram";
    }
    public Student_1(int roll, String Studname){
        roll_no = roll;
        name = Studname;
    }
    
    public int getRoll(){
        return roll_no;
    }

    public String getName(){
        return name;
    }
}

public class Constructor_1 {
    public static void main(String[] args) {

        Student_1 s1 = new Student_1();  //Default Constructor

        Student_1 s2 = new Student_1(23, "Prasad");//Parameterized Constructor

        System.out.println("Default Constructor:");
        System.out.println(s1.getRoll());
        System.out.println(s1.getName());

        System.out.println("Parameterized Constructor:");
        System.out.println(s2.getRoll());
        System.out.println(s2.getName());
    }
}