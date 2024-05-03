package com.chainsys.arraylist;

import java.util.*;

public class CollectionsImplement {
	public static void main(String[] args) {
		
		System.out.println();
		System.out.println();
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Monkey Man");
		arrayList.add("Vikram");
		arrayList.add("Avenger");

		System.out.println("ArrayList: " + arrayList);
		System.out.println("constains Avenger: " + arrayList.contains("Avenger"));
		arrayList.remove(1);
		System.out.println("Removed Vikram" + arrayList);
		System.out.println("Index of Monkey Man :" + arrayList.indexOf("Monkey Man"));
		arrayList.clear();
		System.out.println("clear ArrayList: " + arrayList);

		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("yamaha");
		linkedList.add("tvs");
		linkedList.add("honda");
		System.out.println("LinkedList: " + linkedList);
		System.out.println("LinkedList peek to get first element " + linkedList.peek());
		System.out.println("LinkedList poll to remove first element " + linkedList.poll());
		System.out.println("LinkedList: " + linkedList);
		System.out.println("To remove last element " + linkedList.pop());
		System.out.println("LinkedList: " + linkedList);

		System.out.println();
		System.out.println("HashSet");
		Set<String> hashSet = new HashSet<>();
		hashSet.add("king");
		hashSet.add("queen");
		hashSet.add("soldier");
		hashSet.add("people");
		System.out.println("HashSet: " + hashSet);

		System.out.println();
		System.out.println("HashMap");
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "mani");
		hashMap.put(2, "kishore");
		hashMap.put(3, "dharani");
		System.out.println("HashMap: " + hashMap);
		System.out.println("To compare its contain specfic key or not "+hashMap.containsKey(3));

		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("one");
		priorityQueue.add("two");
		priorityQueue.add("three");
		System.out.println("Priority Queue: " + priorityQueue);
		System.out.println("Top Priority Task: " + priorityQueue.poll()); // first in first out
		System.out.println(priorityQueue);
		System.out.println("Updated Priority Queue: " + priorityQueue);
		
		System.out.println();
		System.out.println("TreeSet");
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(8);
		treeSet.add(1);
		treeSet.add(6);
		System.out.println("TreeSet elements: " + treeSet); 
		treeSet.remove(2);
		System.out.println("TreeSet elements after removal: " + treeSet);  
		System.out.println("Is 5 present? " + treeSet.contains(5)); 
		System.out.println("Size of TreeSet: " + treeSet.size()); 
		treeSet.clear();
		System.out.println("Is TreeSet empty " + treeSet.isEmpty()); 
		System.out.println("The last element "+treeSet.pollLast());
		System.out.println();
		System.out.println("Stack");
		Stack<String> stack = new Stack<>();
        stack.add("c");
        stack.push("Java");
        stack.push("Python");
        stack.push("JavaScript");
        System.out.println("Stack elements: " + stack); 
        System.out.println("Popped element: " + stack.pop()); 
        System.out.println("Stack elements after popping: " + stack); 
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement); 
        System.out.println("Is Stack empty? " + stack.isEmpty()); 
        int index = stack.search("Java");
        if (index != -1) {
            System.out.println("Element found at position: " + index); 
        } else {
            System.out.println("Element not found in the Stack");
        }
	}

}
