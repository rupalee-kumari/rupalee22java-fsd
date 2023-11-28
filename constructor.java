class Student {
    String name;
    int age;

    public void displayInfo() {
        System.out.println(this.age);
        System.out.println(this.name);
    }
    Student() {
        System.out.println(" Default Constructor called");
        }
    Student(String name, int age) {//parameter constructor
        this.name = name;
        this.age = age;
    }
    Student(Student s2) {//copy constructor
        this.name = s2.name;
        this.age = s2.age;
    }
}
public class constructor {
    public static void main(String[] args){
        Student s1=new Student();//parameter constructor
        s1.age=22;
        s1.name="Rupalee";
        Student s2=new Student(s1);//cop constructor
        s2.displayInfo();

    }
}
