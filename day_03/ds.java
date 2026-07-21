package day_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

import java.util.LinkedList;
import java.util.Map;

import java.util.Queue;
import java.util.Set;
import java.util.Stack;


public class ds {
    public static void main(String[] args) {
        
          // ===================================
        // 1. ARRAY
        // ===================================
        System.out.println("===== ARRAY =====");

        int[] arr = {10, 20, 30, 40};

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n");

        // ===================================
        // 2. ARRAYLIST
        // ===================================
        System.out.println("===== ARRAYLIST =====");

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list);

        list.remove("Python");

        System.out.println(list);

        System.out.println();

        // ===================================
        // 3. LINKEDLIST
        // ===================================
        System.out.println("===== LINKEDLIST =====");

        LinkedList<Integer> linked = new LinkedList<>();

        linked.add(100);
        linked.add(200);
        linked.addFirst(50);
        linked.addLast(300);

        System.out.println(linked);

        linked.removeFirst();

        System.out.println(linked);

        System.out.println();

        // ===================================
        // 4. STACK
        // ===================================
        System.out.println("===== STACK =====");

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        System.out.println("Pop : " + stack.pop());

        System.out.println("Peek : " + stack.peek());

        System.out.println(stack);

        System.out.println();

        // ===================================
        // 5. QUEUE
        // ===================================
        System.out.println("===== QUEUE =====");

        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println(queue);

        System.out.println("Poll : " + queue.poll());

        System.out.println(queue);

        System.out.println();

        // ===================================
        // 6. HASHMAP
        // ===================================
        System.out.println("===== HASHMAP =====");

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(101, "Ritesh");
        hm.put(102, "Rahul");
        hm.put(103, "Amit");

        System.out.println(hm);

        System.out.println(hm.get(102));

        System.out.println();

        // ===================================
        // ITERATING HASHMAP
        // ===================================
        System.out.println("===== ITERATE MAP =====");

        for (Map.Entry<Integer, String> entry : hm.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue());

        }

        System.out.println();

        // ===================================
        // ITERATING LIST
        // ===================================
        System.out.println("===== ITERATE ARRAYLIST =====");

        for (String lang : list) {
            System.out.println(lang);
        }

        System.out.println();

        // ===================================
        // SORTING
        // ===================================
        System.out.println("===== SORT =====");

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(40);
        nums.add(10);
        nums.add(30);
        nums.add(20);

        Collections.sort(nums);

        System.out.println(nums);

        Collections.reverse(nums);

        System.out.println(nums);

        System.out.println();

        // ===================================
        // MAP
        // ===================================

        System.out.println("===== MAP =====");

        Map<Integer,String> map = new HashMap<>();

        map.put(101,"Ritesh");
        map.put(102,"Rahul");
        map.put(103,"Amit");

        System.out.println(map);

        System.out.println("Employee 101 : " + map.get(101));

        map.remove(102);

        System.out.println(map);

        System.out.println("Contains Key : " + map.containsKey(101));

        System.out.println("Contains Value : " + map.containsValue("Amit"));

        System.out.println("Size : " + map.size());

        // ===================================
        // SET
        // ===================================

        System.out.println("===== SET =====");

        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("Java");   // Duplicate ignored
        set.add("C++");

        System.out.println(set);

        System.out.println("Contains Java: " + set.contains("Java"));

        set.remove("Python");

        System.out.println(set);

        System.out.println("Size: " + set.size());

        System.out.println("Is Empty: " + set.isEmpty());

        System.out.println("Iterating:");

        for(String language : set){
            System.out.println(language);
        }
    }
}
