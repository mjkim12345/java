package fc.java.fc.java.part4;

import com.sun.tools.javac.Main;
import fc.java.fc.java.model.*;

public class ObjectCasting {
    public static void main(String[] args) {
        Animal ani=new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();

        //다운케스팅
        //Cat c = (Cat)ani;
        //c.night();
        ((Cat)ani).night();
    }
}