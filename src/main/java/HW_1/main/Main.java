package HW_1.main;

import HW_1.domain.Person;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob", "Taylor", 25);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        String personOne = "{\"firstName\":\"Bob\",\"lastName\":\"Taylor\",\"age\":35}";
        Person personTwo = gson.fromJson(personOne, Person.class);
        System.out.println();
        System.out.println(json);
        System.out.println();
        System.out.println(personTwo);
    }
}
