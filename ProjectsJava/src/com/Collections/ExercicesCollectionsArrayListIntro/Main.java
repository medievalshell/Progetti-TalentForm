package com.Collections.ExercicesCollectionsArrayListIntro;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }
}

public class Main {

    public static void main(String[] args) {

        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
        groceryList.set(0,
                new GroceryItem("apples", "PRODUCE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);
    }

    public class MoreLists {

        public static void main(String[] args) {

            String[] items = {"apples", "bananas", "milk", "eggs"};

            List<String> list = List.of(items);
            System.out.println(list);

            ArrayList<String> groceries = new ArrayList<>(list);
            groceries.add("yogurt");
            System.out.println(groceries);

            ArrayList<String> nextList = new ArrayList<>(
                    List.of("pickles", "mustard", "cheese"));
            System.out.println(nextList);

            groceries.addAll(nextList);
            System.out.println(groceries);
        }
    }

}
