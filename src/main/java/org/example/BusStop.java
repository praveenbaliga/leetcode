package org.example;

public class BusStop {

    public static int countPeople(int[][] busStops) {
        int peopleOnBus = 0;

        for(int [] stop : busStops){
            peopleOnBus+=stop[0] - stop[1];
        }
        // Ensure the result is non-negative
        return Math.max(peopleOnBus, 0);
    }

    public static void main(String[] args) {
        // Example usage:
        int [][] busStops = {{3,0}, {4,3}, {6,0}};
        int remainingPeople = countPeople(busStops);
        System.out.println("Remaining people on the bus: " + remainingPeople);
    }
}