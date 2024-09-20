package fc.java.fc.java.part3;

import fc.java.fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        Student[] std = new Student[4];
        std[0] = new Student("홍길동", "컴공", 33, "dsds@ds",20231232,"010-1232-3322");
        std[1] = new Student("나길동","전기",12,"ds@!s",20212322,"010-23123-3212");
        std[2] = new Student("김길동","건축",31,"bit@mnadw",20192321,"010-1234-7644");
        std[3] = new Student("이길동","통신",51,"naer@dsss",20220923,"010-5423-1243");
        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i].toString());
        }
        for( Student st : std) {
            System.out.println( st.toString());
        }
    }
}
