package fc.java.fc.java.course2.part1;

public class IntArrayBasic {
    public static void main(String[] args) {
        int [] num = new int[5]; // 배열생성동작
        num[0]=1;                // 저장동작(입력, 추가)
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;

        //num.length : 길이를 구하는 동작
        for (int i = 0; i < num.length; i++) {
            int data=num[i];        // 데이터를 얻는 동작(가져오는동작)
            System.out.println("num ["+i+"] = "+data);
        }

        // 향상된 for문(foreach)
        for (int data : num) {
            System.out.println(data);
        }
    }
}
