package fc.java.fc.java.course2.part1;

public class HelloWorldString {
    public static void main(String[] args) {
        String str =new String("Hello World"); // Heap 메모리
        System.out.println(str.toString());

        String str1 = "Hello World";   // Literal Pool
        System.out.println(str1.toString());
    }
}
