
//using clone method
class student implements Cloneable  {
String name;
int age;
public student(String name,int age) {
    this.name = name;
    this.age = age;
}

    public static void main(String[] args) throws CloneNotSupportedException {
        student student1=new student("ayush",17);
        student student2= (student) student1.clone();
        System.out.println("original object is :"+student1.name);
        System.out.println("clone object is :"+student2.name);
    }
}
