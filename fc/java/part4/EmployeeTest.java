package fc.java.fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        RempVO vo = new RempVO("홍길동",35,"010-2322-2322","2022-10-12","기획부",true);
        //System.out.println(vo.name+"\t"+vo.age+"\t"+vo.phone+"\t"+vo.marriage+"\t"+vo.dept+"\t"+vo.empDate);
        System.out.println(vo.toString());
    }
}
