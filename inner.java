class A {
    int age;

    public void show() {
        System.out.println("in show");
    }

    static class B {
        public void config() {
            System.out.println("in config");

        }
    }
}
public class inner{
    public static void main(String args[]){
        A a1= new A();
        a1.show();
        A.B obj=new A.B();
        obj.config();
    }
}