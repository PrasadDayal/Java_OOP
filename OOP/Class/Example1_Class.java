class Empl{
    int salary;
    String name;

    public int get_salary(){
        return salary;
    }

    public String get_name(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

}
public class Example1_Class {
    public static void main(String[] args) {
        Empl emp1 = new Empl();

        emp1.setName("Prasad");
        emp1.salary = 50000;
        System.out.println(emp1.get_name());
        System.out.println(emp1.get_salary());
    }
}
