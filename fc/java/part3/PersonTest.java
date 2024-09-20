package fc.java.fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        // 한 사람의 데이터를 저장할 변수를 선언하세요
        Person p = new Person();
        p.name="홍길동";
        p.age=30;
        p.phone="010-1111-1111";

        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
        p.play();
        p.eat();
        p.walk();

        Person p1 = new Person();
        p1.name="나길동";
        p1.age=32;
        p1.phone="010-3111-1111";

        System.out.println(p1.name+"\t"+p1.age+"\t"+p1.phone);
        p1.play();
        p1.eat();
        p1.walk();
    }
}
