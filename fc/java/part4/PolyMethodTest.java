package fc.java.fc.java.part4;

import fc.java.fc.java.model.*;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }

    private static void display(Animal ani) { // 다형성인수
        ani.eat();

        // 밑에는 Cat타입으로 받은 경우에만 실행 -> if
        //((Cat)ani).night(); // Cat
        // if문으로 해결
        if(ani instanceof Cat) {
            ((Cat)ani).night();
        }
    }


}
