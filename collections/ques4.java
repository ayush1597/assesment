import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{

 Double salary;
 Double age;
 String name="" ;

 Employee(String name,double age,double salary){
     this.name=name;
     this.age=age;
     this.salary=salary;
 }
    public String toString()
    {
        return this.name + " " + this.age +
                " " + this.salary;
    }
}
class sortbysalary implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
System.out.println(a.salary.compareTo(b.salary));
     return a.salary.compareTo(b.salary); }
}

class main{
    public static void main(String[] args) {
        List<Employee> list=new ArrayList();
        list.add(new Employee("ayush sharma",25,25000.00));
        list.add(new Employee("arjit madan",22,20000.00));
        list.add(new Employee("amrendra singh",25,27000.00));
        Collections.sort(list, new sortbysalary());

    System.out.println("\tsorted according to salary");
     for(int i=0;i<list.size();i++){
         System.out.println(list.get(i));
     }
    }
}
