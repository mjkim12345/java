package fc.java.fc.java.course2.part2;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str1="123";
        String str2="123";
        System.out.println(str1+str2); // 문자열 문자열 결합

        int num = Integer.parseInt(str1)+Integer.parseInt(str2);
        System.out.println(num);

        int su1=123;
        int su2=123;
        String str=String.valueOf(su1)+String.valueOf(su2);
        System.out.println(str);
        System.out.println(""+su1+""+su2);  // (""+su1) 이렇게도 가능
    }
}
