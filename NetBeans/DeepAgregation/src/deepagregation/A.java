package deepagregation;
/* A เป็น Super component ของ B */
public class A {
    public B b = new B();
    public void methodForA() {
        System.out.println("A method");
    }
}
