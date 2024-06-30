package Step01_LearnTheBasics.Prep06_BasicHashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Map;

public class P01_Hashing {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + '}';
        }
    }

    public static void main(String[] args) {
        // HashMap Example
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        System.out.println("Alice's age: " + map.get("Alice"));
        System.out.println("Bob's age: " + map.get("Bob"));
        System.out.println("Charlie's age: " + map.get("Charlie"));
        System.out.println("Does Alice exist? " + map.containsKey("Alice"));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old.");
        }

        // HashSet Example
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");
        System.out.println("Set: " + set);
        System.out.println("Does Banana exist? " + set.contains("Banana"));
        set.remove("Banana");
        System.out.println("Set after removing Banana: " + set);
        for (String fruit : set) {
            System.out.println("Fruit: " + fruit);
        }

        // Using HashMap with custom objects
        HashMap<Person, String> personMap = new HashMap<>();
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);
        personMap.put(p1, "Developer");
        personMap.put(p2, "Designer");
        System.out.println("Alice's job: " + personMap.get(p1));
        System.out.println("Bob's job: " + personMap.get(p2));

        // Using HashSet with custom objects
        HashSet<Person> personSet = new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);
        System.out.println("Person set: " + personSet);
    }
}

