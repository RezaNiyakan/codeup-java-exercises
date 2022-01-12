package grocery;

import java.util.ArrayList;
import java.util.Arrays;

public class Groceries {

    private String category;
    private String name;
    private int numberOf;
    protected final static ArrayList<String> categories = new ArrayList<>(Arrays.asList("Produce", "Beer", "Seafood", "Meats", "Bakery", "Deli", "Pharmacy"));

    public void displayInfo(){
        System.out.printf("Item name: %s%nItem amount: %d%nCategory: %s", this.name, this.numberOf, this.category);
    }

    public Groceries(String category, String name, int numberOf){
        this.category = category;
        this.name = name;
        this.numberOf = numberOf;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOf() {
        return numberOf;
    }

    public void setNumberOf(int numberOf) {
        this.numberOf = numberOf;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }
}