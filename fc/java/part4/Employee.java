package fc.java.fc.java.part4;

public class Employee extends Object{
    private String name;
    private int age;
    private String phone;
    private String empDate;
    private String dept;
    private boolean marriage;
    public Employee() {
        super();  // 상위클래스의 생성자를 호출
    }
    public Employee (String name, int age,String phone, String empDate, String dept,boolean marriage) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.empDate=empDate;
        this.dept = dept;
        this.marriage=marriage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", empDate='" + empDate + '\'' +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
