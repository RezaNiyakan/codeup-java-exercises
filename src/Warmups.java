import java.util.Scanner;

public class Warmups {
    public static void main(String[] args) {
//        System.out.println("Java is statically typed, while javascript is dynamically typed.");


//        12/16/21
//        In the main method of your warmups class, prompt the user for what did you eat for breakfast today
        System.out.println("What did you eat for breakfast today?");

        Scanner scanner = new Scanner(System.in);
        String userBreakfast = scanner.nextLine();
        System.out.printf("%s, I wish I had that for breakfast!", userBreakfast);
    }
}
