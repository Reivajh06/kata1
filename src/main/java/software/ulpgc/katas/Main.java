package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {

    static void main() {
        Person person = new Person("Blue", LocalDate.of(2006, 3, 2));
        System.out.println(person.age());
    }
}
