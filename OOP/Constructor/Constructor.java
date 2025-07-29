import java.util.Scanner;

class Student {
    private int Stud_roll;
    private String Stud_name;

    // Default Constructor
    public Student() {
        Stud_roll = 10;
        Stud_name = "Ram";
    }

    // Parameterized Constructor
    public Student(int roll, String name) {
        Stud_roll = roll;
        Stud_name = name;
    }

    public int getRoll() {
        return Stud_roll;
    }

    public String getName() {
        return Stud_name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using Default Constructor
        Student s1 = new Student();
        System.out.println("Default Constructor:");
        System.out.println("Student Roll No is: " + s1.getRoll());
        System.out.println("Student Name is: " + s1.getName());

        // Taking input for Parameterized Constructor
        System.out.println("\nEnter Student Roll No:");
        int roll = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        // Using Parameterized Constructor
        Student s2 = new Student(roll, name);
        System.out.println("\nParameterized Constructor:");
        System.out.println("Student Roll No is: " + s2.getRoll());
        System.out.println("Student Name is: " + s2.getName());

        sc.close();
    }
}
