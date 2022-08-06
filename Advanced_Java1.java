package com.company;

import java.util.*;

public class Advanced_Java1 {
    public static void main(String[] args) {
//        System.out.println("Welcome to Advanced Java 1 (Collection Frameworks)");
//        ArrayList -->

        ArrayList<Integer> l1 = new ArrayList<>();                   // ArrayList is a modified Array
        ArrayList<Integer> l2 = new ArrayList<>(5);      // Assigning initial capacity to the ArrayList

        l2.add(5);
        l2.add(7);
        l2.add(9);

        l1.add(84);
        l1.add(75);
        l1.add(1,60);
        l1.add(62);
        l1.add(84);
        l1.add(1, 25);

//        l1.addAll(l2);   // This addAll() method adds elements of l2 at the end of l1
        l1.addAll(0, l2);   // This addAll() method adds elements of l2 from the beginning of l1

//        l1.clear();             // Clears everything from the ArrayList

//        for (int i = 0;i<l1.size();i++){
//            System.out.println(l1.get(i));  // get() method to get element individually
//        }

//        System.out.println(l1.contains(50));  // contains() method is used to check whether the specified element is present in ArrayList or not
//        System.out.println(l1.indexOf(84));   // returns the index of the first occurrence of that particular element
//        System.out.println(l1.lastIndexOf(84));   // returns the index of the last occurrence of that particular element

//        l1.remove(4);         // remove the element at the given index

//        l1.set(4, 1000);   // replaces the element present at 4th index with the one we want

//        System.out.println(l1);

//        l1.forEach(i -> System.out.print(i+1 + ", "));
//        l1.clear();
//        System.out.println(l1.isEmpty());

//        System.out.println(l1.subList(3, 7));


//        LinkedList -->
        LinkedList<Integer> ll = new LinkedList<>();
        LinkedList<Integer> ll2 = new LinkedList<>();

        ll2.add(21);
        ll2.add(15);
        ll2.add(30);

        ll.add(7);
        ll.add(1);
        ll.add(9);
        ll.add(5);
        ll.add(0,2);
        ll.add(7);
//        ll.addAll(0, ll2);

        ll.addAll(ll2);
//        for (int i = 0;i<ll.size();i++){
//            System.out.println(ll.get(i));
//        }

//        ll.clear();
//        System.out.println(ll);
//        System.out.println(ll.contains(7));
//        System.out.println(ll.indexOf(7));
//        System.out.println(ll.lastIndexOf(7));

//        ll.remove(4);
//        System.out.println(ll);

//        ll.set(4, 2000);

//        ll.addLast(66);
//        ll.addFirst(0);

//        ll.set(4, 1527);
//        System.out.println(ll);


//        Array Deque -->
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();

        ad2.add(1000);
        ad2.add(2000);
        ad2.add(3000);

        ad.add(6);
        ad.add(56);
        ad.offerFirst(23);   // This method will add the specified element at first of deque
        ad.addFirst(13);

        ad.offerLast(12);    // This method will add the specified element at last of deque
        ad.addLast(78);

//        System.out.println(ad.getFirst());
//        System.out.println(ad.getLast());
//        System.out.println(ad.peekFirst());
//        System.out.println(ad.peekLast());

//        System.out.println(ad);

        ad.addAll(ad2);
//        System.out.println(ad);

        ad.removeFirst();
        ad.pollFirst();
        ad.removeLast();
        ad.pollLast();
//        System.out.println(ad);


//        Hashing --> Hashing is a technique to convert a range of key, values into range of indices
//        Set --> Set is a collection of unique elements
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>(6, 0.5f);

        h2.add(87);
        h2.add(55);
        h2.add(37);

        h1.add(1);
        h1.add(3);
        h1.add(5);
        h1.add(7);
        h1.add(9);
        h1.addAll(h2);
        System.out.println(h1);

//        h1.clear();
//        System.out.println(h1);
        System.out.println(h1.contains(5));

        h1.remove(87);
        System.out.println(h1);



    }
}
