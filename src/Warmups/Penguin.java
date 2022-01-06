//            1/6/22
package Warmups;

public class Penguin {
    private String name;
    private int weight;
    private String species;
    private char sex;

    public static boolean canFly() {
        return false;
    }

    public static boolean areEvil() {
        return true;
    }

    public Penguin() {
    }

    public Penguin(String name, int weight, String species, char sex) {
        this.name = name;
        this.weight = weight;
        this.species = species;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getSpecies() {
        return species;
    }

    public char getSex() {
        return sex;
    }
}
