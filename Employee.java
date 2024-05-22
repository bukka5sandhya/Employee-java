package Java;
public class Employee{
    int empId;
    String empName;
    String city;

    Employee(int empId,String empName,String city){
        this.empId = empId;
        this.empName=empName;
        this.city = city;

    }
    public String toString(){
        return empId+" "+empName+" "+city;
    }
    public static void main(String[] args){
        Employee emp = new Employee(100, "John", "Hyderabad");
        Employee emp1 = new Employee(101,"Ram" ,"Guntur");
        System.out.println(emp);
        System.out.println(emp1);

    }
}