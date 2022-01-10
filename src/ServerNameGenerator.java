import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {
        String[] adjectives = {"adorable", "ashamed", "awful", "aggressive", "average", "bad", "beautiful", "bewildered", "better", "bloody"};
        String[] nouns = {"man", "woman", "teacher", "place", "home", "office", "car", "money", "music", "love"};

        Random random = new Random();
        int index1 = random.nextInt(adjectives.length);
        int index2 = random.nextInt(nouns.length);

        System.out.println("Here is your server name: ");
        System.out.println(adjectives[index1] + "-" + nouns[index2]);
    }
}
