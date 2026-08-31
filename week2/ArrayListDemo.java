package week2;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        //TODO: intialize both the item and quantity lists to size 3.
        ArrayList<String> item;  
        ArrayList<Integer> quantity;

        //TODO: add soda to the list, with quantity 2

        //TODO: add paper plates set to the list, with quantity 1

        //TODO: add solo cups to the list, with quantity 3

        printList(item, quantity);

        //TODO: You remembered you needed paper towels, add paper towel rolls, with quantity 2
        printList(item, quantity);

        //TODO: You went to the store and got everything but cups, remove all items except for cups
        //Hint: You need to edit both the item and quantity
        

        printList(item, quantity);
    }

    public static void printList(ArrayList<String> items, ArrayList<Integer> quantity) {
        System.out.println("=-=-=-=Store List=-=-=-=");
        //TODO: Use a for loop to access items from list to print out in format: (item: quantity)
        
        
        System.out.println();
    }
}
