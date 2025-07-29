class Employee{
    private int id;
    private String Emp_name;

    public Employee(){
        id = 53;
        Emp_name = "Prasad";
    }

    public int getid(){
        return id;
    }

    public String getEmp_name(){
        return Emp_name;
    }

    public void setid(int id){
        this.id = id;
    }

    public void setEmp_name(String Emp_name){
        this.Emp_name = Emp_name;
    }

}
public class Demo {
    public static void main(String[] args) {
        Employee Emp = new Employee();
        System.out.println(Emp.getid());
        System.out.println(Emp.getEmp_name());
    }
}
