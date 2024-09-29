package fc.java.fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.fc.java.model2.Person;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json="{\"name\":\"John\",\"age\":30}";
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p);   //toString()을 만들었기 때문에 p만 입력해도 가능 toString이 생략되어있는거임//

    }
}
