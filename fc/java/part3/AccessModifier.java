package fc.java.fc.java.part3;

import fc.java.fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO dto=new MemberDTO();
        dto.name="홍길동";
        dto.phone="010-2123-4566";
        // age는 접근불가
        System.out.println(dto.name+"\t"+dto.phone);
        dto.play();
    }
}
