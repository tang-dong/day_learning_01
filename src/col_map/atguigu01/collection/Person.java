package col_map.atguigu01.collection;

import java.util.Objects;

/**
 * @author Jack Tang
 * @description
 * @create 2023-08-20 15:29
 */
public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Person equals()...");
        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return this.age == person.age && Objects.equals(name,person.name);
    }
}