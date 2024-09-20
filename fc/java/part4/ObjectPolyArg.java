package fc.java.fc.java.part4;

import fc.java.fc.java.Poly.*;

public class ObjectPolyArg {
    public static void main(String[] args) {
        A a =new A();
        display(a);
        B b = new B();
        display(b);
    }

    private static void display(Object obj) {
        if(obj instanceof A) {
            ((A)obj).display();
        }else {
            ((B)obj).printGo();
        }
    }
}
