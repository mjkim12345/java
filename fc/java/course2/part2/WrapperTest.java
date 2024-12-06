package fc.java.fc.java.course2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        // 정수형 변수에 10을 저장핫요.
        int a=10; // 기본자료형
        //Integer aa=new Integer(10); //사용자정의 자료형
        Integer aa=10; // Auto-boxing
        System.out.println(aa.intValue()); // Unboxing(Integer->int)

        Integer bb=20; // Auto-Boxing
        int b=bb; // Auto-UnBoxing

        float f=10.5f;
        Float ff=45.6f; // Auto-boxing
        System.out.println(ff.floatValue()); //언박싱

        Float af=49.1f;
        float aff=af;   // Auto-unBoxing

    }
}
