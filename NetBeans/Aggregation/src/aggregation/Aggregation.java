package aggregation;
public class Aggregation {
    public static void main(String[] args) {
        int val = 5;
        A a = new A();
        if (val < 5) {
            a.yyy(val);
        }
        else {
            a.b.yyy(val);
        }
    }
    
}
