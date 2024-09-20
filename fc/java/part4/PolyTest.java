package fc.java.fc.java.part4;

import fc.java.fc.java.model.*;


public class PolyTest {
    public static void main(String[] args) {
        // Upcasting으로 객체를 생성
        // 상속관계 , 재정의(Override), 동적바인딩이 되어있어야 함
        Animal a = new Dog();
        a.eat();

        a = new Cat();
        a.eat();
        ((Cat)a).night();
        // Overloading(오버로딩) : 정적바인딩 = 컴파일 시점에서 사용될 메서드가 결정되는 바인딩
        // -> 프로그램의 실행 속도와는 무관하다.
        // Override(재정의)     : 동적바인딩 = 실행시점에서 사용될(호출될)메서드가 결정되는 바인딩
        // -> 프로그램의 실행 속도와 연관이 있다.
    }
}
