package week2.Solutions;

import java.util.ArrayList;

public class ArrayListDemoSolution {

    public static void main(String[] args) {
        //TODO: intialize both the item and quantity lists to initial size 3.
        ArrayList<String> item = new ArrayList<>(3);  
        ArrayList<Integer> quantity = new ArrayList<>(3);

        //TODO: add soda to the list, with quantity 2
        item.add("Soda");
        quantity.add(2);

        //TODO: add paper plates set to the list, with quantity 1
        item.add("Paper Plates");
        quantity.add(1);

        //TODO: add solo cups to the list, with quantity 3
        item.add("Solo Cups");
        quantity.add(3);

        printList(item, quantity);

        //TODO: You remembered you needed paper towels, add paper towel rolls, with quantity 2
        item.add("Paper Towel Rolls");
        quantity.add(2);
        printList(item, quantity);

        //TODO: You went to the store and got everything but cups, remove all items except for cups
        //Hint: You need to edit both the item and quantity
        item.remove(0);
        quantity.remove(0);
        
        item.remove(0);
        quantity.remove(0);

        item.remove(1);
        quantity.remove(1);

        printList(item, quantity);
    }

    public static void printList(ArrayList<String> items, ArrayList<Integer> quantity) {
        System.out.println("=-=-=-=Store List=-=-=-=");
        //TODO: Use a for loop to access items from list to print out in format: (item: quantity)
        for(int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + ": " + quantity.get(i));
        }
        
        System.out.println();
    }
}
