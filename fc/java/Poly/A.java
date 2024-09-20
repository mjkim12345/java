package fc.java.fc.java.Poly;
import java.lang.*;

public class A extends Object{
    public A() {
        super(); // 상위클래스의 생성자를 호출해서 먼저 부모부터 객체를 만든다. new Object()
    }
    public void display() {
        System.out.println("나는 A입니다.");
    }
    public void printGo() {
        System.out.println("나는 A 가 갑니다.");
    }
}
