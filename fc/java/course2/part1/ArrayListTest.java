package fc.java.fc.java.course2.part1;
import fc.java.fc.java.model2.Book;

import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력하세요.
        // Book[], Object[]
        ArrayList list= new ArrayList();   //기본크기(10)
        list.add(new Book("자바",15000,"한빛","홍길동"));
        list.add(new Book("C++",16000,"대림","이길동"));
        list.add(new Book("파이썬",17000,"한빛","나길동"));

        Book vo=(Book)list.get(0);
        System.out.println(vo.toString());

        vo=(Book)list.get(1);
        System.out.println(vo.toString());

        vo=(Book)list.get(2);
        System.out.println(vo.toString());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // Object->Book(JVM에서 자동으로 Book의 toString())
        }
    }
}
