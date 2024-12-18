package fc.java.fc.java.part4;

import fc.java.fc.java.Poly.*;

public class InterfaceTest {
    public static void main(String[] args) {
        // 리모콘으로 Radio와 TV를 동작시켜보자.
        // 다형성이 100%보장된다.
        // 부모가 인터페이스면 자식의 내부 동작방식을 전혀 몰라도 동작을 시킬수가 있다.
        // RemonCon r= new RemoCon(); 객체생성 불가
        // 부모의 역할을 할수 있다.
        RemoCon remo = new Radio();
        remo.chup();
        remo.chDown();
        remo.volDown();
        remo.volUp();
        remo.internet(); // ? 오동작

        remo = new TV();
        remo.chup();
        remo.chDown();
        remo.volDown();
        remo.volUp();
        remo.internet(); // ? 오동작
    }
}
