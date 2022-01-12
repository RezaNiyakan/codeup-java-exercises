package grocery;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;


public class GroceryListApp {

    public static void main(String[] args) {
        Input input = new Input();
        ArrayList<Groceries> items = new ArrayList<>();
        ArrayList<String> Produce = new ArrayList<>();
        ArrayList<String> Beer = new ArrayList<>();
        ArrayList<String> Seafood = new ArrayList<>();
        ArrayList<String> Meats = new ArrayList<>();
        ArrayList<String> Bakery = new ArrayList<>();
        ArrayList<String> Deli = new ArrayList<>();
        ArrayList<String> Pharmacy = new ArrayList<>();


        boolean yesNo = input.yesNo("Would you like to create a grocery List?");

        while(yesNo){
            yesNo = input.yesNo("Would you like to enter a new item?");
            if(!yesNo){ break; }
            for(String category:Groceries.categories){
                System.out.printf("- %s - ", category);
            }
            System.out.printf("%n^^^ Enter a category from the options above ^^^%n");
            String userCat = input.getString();
            System.out.println("Enter the name of the item you want to add");
            String userName = input.getString();
            userName.trim();
            System.out.printf("Enter the number of %s you would like to add%n", userName);
            int userNumber = input.getInt();
            Groceries item = new Groceries(userCat, userName, userNumber);
            item.displayInfo();
            System.out.println();
            boolean addMore = input.yesNo("Would you like to add this to the list?");
            if(addMore){
                items.add(item);
                if(userCat.equals("Produce")){
                    Produce.add(userName);
                } else if(userCat.equals("Beer")){
                    Beer.add(userName);
                } else if(userCat.equals("Seafood")){
                    Seafood.add(userName);
                } else if(userCat.equals("Meats")){
                    Meats.add(userName);
                } else if(userCat.equals("Bakery")){
                    Bakery.add(userName);
                } else if(userCat.equals("Deli")){
                    Deli.add(userName);
                } else if(userCat.equals("Pharmacy")){
                    Pharmacy.add(userName);
                }
            }
        }
        if(items.size() > 0) {
            System.out.println("Here is your groceries list");
            System.out.println("----------------------------------------------------");
            System.out.format("|      Item      |     Amount     |    Category    |%n");
            System.out.println("----------------------------------------------------");
            if (Beer.size() > 0) {
                Beer.sort(String::compareTo);
                for (String b : Beer) {
                    for (Groceries i : items) {
                        if (i.getName().equals(b)) {
                            System.out.printf("|%-16s|%-16d|%-16s|%n", i.getName(), i.getNumberOf(), i.getCategory());
                        }
                    }
                }
            }
            if (Produce.size() > 0) {
                Produce.sort(String::compareTo);
                for (String d : Produce) {
                    for (Groceries i : items) {
                        if (i.getName().equals(d)) {
                            System.out.printf("|%-16s|%-16d|%-16s|%n", i.getName(), i.getNumberOf(), i.getCategory());
                        }
                    }
                }
            }
            if (Seafood.size() > 0) {
                Seafood.sort(String::compareTo);
                for (String d : Seafood) {
                    for (Groceries i : items) {
                        if (i.getName().equals(d)) {
                            System.out.printf("|%-16s|%-16d|%-16s|%n", i.getName(), i.getNumberOf(), i.getCategory());
                        }
                    }
                }
            }
            if (Meats.size() > 0) {
                Meats.sort(String::compareTo);
                for (String f : Meats) {
                    for (Groceries i : items) {
                        if (i.getName().equals(f)) {
                            System.out.printf("|%-16s|%-16d|%-16s|%n", i.getName(), i.getNumberOf(), i.getCategory());
                        }
                    }
                }
            }
            if (Bakery.size() > 0) {
                Bakery.sort(String::compareTo);
                for (String f : Bakery) {
                    for (Groceries i : items) {
                        if (i.getName().equals(f)) {
                            System.out.printf("|%-16s|%-16d|%-16s|%n", i.getName(), i.getNumberOf(), i.getCategory());
                        }
                    }
                }
            }
            if (Pharmacy.size() > 0) {
                Pharmacy.sort(String::compareTo);
                for (String m : Pharmacy) {
                    for (Groceries i : items) {
                        if (i.getName().equals(m)) {
                            System.out.printf("|%-16s|%-16d|%-16s|%n", i.getName(), i.getNumberOf(), i.getCategory());
                        }
                    }
                }
            }
            if (Deli.size() > 0) {
                Deli.sort(String::compareTo);
                for (String v : Deli) {
                    for (Groceries i : items) {
                        if (i.getName().equals(v)) {
                            System.out.printf("|%-16s|%-16d|%-16s|%n", i.getName(), i.getNumberOf(), i.getCategory());
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Thank you! Come back and see us!");


    }
}