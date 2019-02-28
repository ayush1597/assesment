//Create an Employee Class with instance variables
// (String) name, (Integer)age, (String)city and get the instance of the Class using constructor reference
interface EmployeeInfo{
public abstract Employee getEmployee(String name, Integer age,String city);
        }
class Employee {
    String name="";
    Integer age;
    String city="";

public Employee(String name,Integer age,String city ){
    this.name=name;
    this.age=age;
    this.city=city;
}
    public static void main(String[] args) {
        EmployeeInfo employee = Employee::new;
Employee emp= (Employee) employee.getEmployee("ayush",23,"mbd");
System.out.println("name:"+emp.name+"\tage:"+emp.age+"\tcity :"+emp.city);
}
}
