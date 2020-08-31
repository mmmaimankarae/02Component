package delegation;
public class A {
    private final B b = new B();
    public void zzz() {
        b.zzz();
    }
    public void yyy(int val) {
        if (val < 5) {
            System.out.println("A val = " + val);
        }
        else {
            b.yyy(val);
        }
    }
}
