//Initializing class
class Employee{

    int id;
    String name;
    
    //Function for print_data of Employee
    public void print_data(){
        System.out.println("Employee ID :" + id);
        System.out.println("Employee Name :" + name);
    }

}
public class Class_Method {
    public static void main(String[] args) {
        Employee emp1 = new Employee();//Instantiating class object

        //Setting Attributes
        emp1.id = 23;
        emp1.name = "Ram";

        //Printing the value of Attributes
        System.out.println("Employee Details are:");
        emp1.print_data();
    }
}
