package delegation;
/* Super component */
public class A {
    /* Attribute Object of B */
    private final B b = new B();
    public void zzz() {
        b.zzz();
    }
    public void yyy(int val) {
        /* ส่วนที่ต้องการควบคุมเงื่อนไข */
        if (val < 5) {
            System.out.println("A val = " + val);
        }
        else {
            b.yyy(val);
        }
    }
}
