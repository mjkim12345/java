package fc.java.fc.java.part4;

import fc.java.fc.java.model.*;

public class OverrideTest {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
    }
}
