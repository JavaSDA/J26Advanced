package com.company.collections;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        // SET
        // The Set interface is used for unique elements
        // (If you pass in duplicate values, they will be treated as one value or element)

        // HashSet is an implementation of the SET interface that
        // is not ordered, meaning that there's no indexing like we are used to with arrays.
        // The HashSet randomizes output
//        HashSet hashSet = new HashSet();
//        Set<String> names = new HashSet<>();
//        names.add("Bobby");
//        names.add("Dave");
//        names.add("Barry");
//        names.add("Larry");

//        Object[] theNames = names.toArray();
//        System.out.println(names.size());
//        System.out.println(names.contains("Dave"));

//        System.out.println(Arrays.toString(theNames));
//
//        for (String am : names) {
//            System.out.println(am);
//        }


        // TreeSet has a built-in comparator that allows it to sort items/elements/objects
        // in ascending order.
/*

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(4);
        numbers.add(2);
        numbers.add(1);

        System.out.println(numbers);
*/

        // LinkedHashSet is different from the other 2 in the sense that, it
        // maintains the order in which the items are passed in.
/*
        Set<Integer> nums = new LinkedHashSet<>();



        nums.add(4);
        nums.add(8);
        nums.add(3);

        System.out.println(nums);
*/

        // LIST
        // The List is an interface that represents ordered collections.
        // - Can contain duplicates
        // - indexing (like arrays starting from 0)

        // ArrayList is ordered and each item is added to the bottom of the list
        // the items are returned based on their index.
/*        List<String> names = new LinkedList<>();
                            // index
        names.add("Harry"); // 0
        names.add("Lisa"); // 1
        names.add("Lisa"); // 2
        names.add("Rebecca"); // 3


        names.add(1, "Bobby");


        System.out.println(names);

        */

        // QUEUE
        // FIFO - First In First Out
//        Queue<String> starbucksQueue = new LinkedList<>();
//        starbucksQueue.size();
//        throw exceptions
        // add(E e)
        // remove()
        // element()

        // don't throw exceptions
        // offer(E e) - alternative to add
        // poll() - alternative to remove
        // peek() - alternative to element

/*        starbucksQueue.add("David"); //
        starbucksQueue.offer("Barry");
        starbucksQueue.offer("Johnson");


        System.out.println(starbucksQueue.peek());*/

//        starbucksQueue.poll();

//        starbucksQueue.remove(); // removes from the front of the queue;
//        starbucksQueue.remove(); // removes from the front of the queue;

//        System.out.println(starbucksQueue);


        // Map
        /*
        {  // Key    Value
            "David": 14,
            "Barry": 15,
            "Johnson": 16
         }
         */

        // Three main implementations of the Map
        // HashMap
        // TreeMap
        // LinkedHashMap

        // 18:33 - 18:48

        Map<String, Integer> peopleAges = new LinkedHashMap<>();

        peopleAges.put("David", 14);
//        peopleAges.put("Barry", 15);
        peopleAges.put("Johnson", 16);

        peopleAges.putIfAbsent("Barry", 18);


        peopleAges.remove("Barry");

        System.out.println(peopleAges.size());
        System.out.println(peopleAges.containsKey("Fred"));
        System.out.println(peopleAges.containsValue(16));
        System.out.println(peopleAges.keySet());

        System.out.println(peopleAges);



    }
}
