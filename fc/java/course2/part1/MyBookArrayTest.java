package fc.java.fc.java.course2.part1;

import fc.java.fc.java.model2.Book;
import fc.java.fc.java.model2.BookArray;

public class MyBookArrayTest {
    public static void main(String[] args) {
        // 책 3권의 데이터를 배열에 저장하고 출력하세요
        BookArray list=new BookArray();
        list.add(new Book("자바",15000,"한빛","홍길동"));
        list.add(new Book("C++",16000,"대림","이길동"));
        list.add(new Book("파이썬",17000,"한빛","나길동"));

        Book vo = list.get(0);
        System.out.println(vo);    // vo.toString()

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
