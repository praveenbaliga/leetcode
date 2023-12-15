package org.example;

import java.util.PriorityQueue;

public class FirstThreeLargest {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the priority queue using offer()
        pq.offer(5);
        pq.offer(10);
        pq.offer(3);
        pq.offer(8);

        // Printing the elements of the priority queue
        System.out.println("PriorityQueue elements: " + pq);

        int[] array = {10, 25, 5, 40, 15, 30, 60, 20};
        int k = 3; // Number of largest elements to find

        // Create a PriorityQueue (min heap)
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//
//        // Add elements to the PriorityQueue
//        for (int num : array) {
//            pq.offer(num);
//
//            // If size exceeds k, remove the smallest element
//            if (pq.size() > k) {
//                pq.poll();
//            }
//        }
//
//        // The PriorityQueue now contains the k largest elements
//        System.out.println("The first three largest elements are: ");
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll());
//        }
    }
}
