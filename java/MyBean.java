package mybean;
public class MyBean implements java.io.Serializable {
		 
       protected int theValue;
       public MyBean() { }
       public void setMyValue(int newValue) {
              theValue = newValue;
       }
       public int getMyValue() {
              return theValue;
       }
}

