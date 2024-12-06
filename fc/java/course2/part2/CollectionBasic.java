package fc.java.fc.java.course2.part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        // ArrayList에 정수5개 저장 출력
        // ArrayList에는 객체만 저장 가능 so Integer로 박싱하고 저장 하지만 auto-boxing 되서 바로 가능하긴 함
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10); // auto-boxing이 되서 가능 정석은 new Integer(10)을 넣어야 함
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for (int data : list){    // auto-unboxing으로 int형으로 출력
            System.out.println(data);
        }
    }
}
