package fc.java.fc.java.Poly;

public class Dog extends Animal {  // 추상메서드
    // 재정의를 하지 않음(x)
    // 재정의를 반드시 해야한다. -> 구현해야한다. 바디({ )}를 만들면된다.
    public void eat() {
        System.out.println("개처럼먹다");
    }
}
