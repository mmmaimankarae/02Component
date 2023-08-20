package deepagregation;
/* Client */
public class DeepAgregation {
    public static void main(String[] args) {
       A a = new A();
       a.methodForA();
       a.b.methodForB();
       a.b.c.methodForC();
    }
}
