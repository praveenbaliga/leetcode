package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleElementsSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a list of elements
        List<String> elements = new ArrayList<>();
        elements.add("Apple");
        elements.add("Banana");
        elements.add("Orange");
        elements.add("Mango");
        elements.add("Grapes");

        // Display the list of elements
        System.out.println("Available Elements:");
        for (int i = 0; i < elements.size(); i++) {
            System.out.println((i + 1) + ". " + elements.get(i));
        }

        // Ask user to select multiple elements
        System.out.println("\nEnter the numbers of elements to select (comma-separated):");
        String input = scanner.nextLine();

        // Extract selected elements
        List<String> selectedElements = new ArrayList<>();
        String[] indices = input.split(",");
        for (String indexStr : indices) {
            int index = Integer.parseInt(indexStr.trim()) - 1;
            if (index >= 0 && index < elements.size()) {
                selectedElements.add(elements.get(index));
            }
        }

        // Display selected elements
        System.out.println("\nSelected Elements:");
        for (String selectedElement : selectedElements) {
            System.out.println(selectedElement);
        }
    }
}
