package deepagregation;
/* B เป็น Super component ของ C */
public class B {
    public C c = new C();
    public void methodForB() {
        System.out.println("B Method");
    }
}
