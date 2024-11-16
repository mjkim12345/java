package fc.java.fc.java.course2.part1;

public class StringManipulation {
    public static void main(String[] args) {

        String str = "HelloWorld";
        System.out.println(str.charAt(1)); // e
        System.out.println(str.replaceAll("o","X"));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(5,8));
        System.out.println(str.indexOf("W"));
        System.out.println(str.indexOf("kk"));
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
