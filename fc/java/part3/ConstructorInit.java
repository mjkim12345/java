package fc.java.fc.java.part3;

import fc.java.fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();
        System.out.println(vo.getName()+ "\t" + vo.getAge()+"\t"+vo.getPhone());

    }
}
