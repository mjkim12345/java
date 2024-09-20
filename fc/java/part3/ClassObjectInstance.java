package fc.java.fc.java.part3;

import fc.java.fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1;
        Student st2;
        Student st3;
        
        st1 = new Student("홍길동", "컴퓨터공학과",37,"bit@empas.com",2023110,"010-1232-2312");
        st2 = new Student("김길동", "컴퓨터공학과",37,"bit@empas.com",2023110,"010-1232-2312");
        st3 = new Student("나길동", "컴퓨터공학과",37,"bit@empas.com",2023110,"010-1232-2312");

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());
    }
}
