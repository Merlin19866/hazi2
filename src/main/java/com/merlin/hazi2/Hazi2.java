package com.merlin.hazi2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hazi2 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
       ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Mit szeretnél megvenni? ");
            String name = scanner.nextLine();

            System.out.println("Mennyibe kerül? ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // consume newline character

            Item item = new Item(name, price);
            items.add(item);

            System.out.println("Szeretnél még egy terméket hozzáadni? (igen/nem)");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("nem")) {
                break;
            }
        }

        System.out.println("A termékek listája:");
        for (Item item : items)
            {
                System.out.println(item.getName() + " - " + item.getPrice() + " Ft");
            }
             System.out.println("Mennyi félretett pénzed van?");
    }
}
