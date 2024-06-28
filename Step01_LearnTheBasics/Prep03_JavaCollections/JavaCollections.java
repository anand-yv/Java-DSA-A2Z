package Step01_LearnTheBasics.Prep03_JavaCollections;

import java.util.*;

public class JavaCollections {
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple"); // Lists allow duplicate elements
        System.out.println("\nList: " + list);

        // Set Example
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Sets do not allow duplicate elements
        System.out.println("\nSet: " + set);

        // Map Example
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Apple", 4); // Keys in maps are unique, this will replace the previous value
        System.out.println("\nMap: " + map);
        for(Map.Entry<String, Integer> itr: map.entrySet()){
            System.out.println(itr.getKey() + " : " + itr.getValue());
        }
        System.out.println("Get or Default : " + map.getOrDefault("Apple", 404));
        System.out.println("Get or Default : " + map.getOrDefault("Apples", 404));

        // Queue Example
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        System.out.println("\nQueue: " + queue);
        System.out.println("Poll from Queue: " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // Stack Example
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("\nStack: " + stack);
        System.out.println("Pop from Stack: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
