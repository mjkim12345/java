package fc.java.fc.java.part4;

import fc.java.fc.java.Poly.*;

public class ObjectTest {
    public static void main(String[] args) {
        // A객체를 Upcasting으로 생성하세요.
        Object obj = new A();  //Upcasting
        ((A)obj).display();    //Downcasting
    }
}
