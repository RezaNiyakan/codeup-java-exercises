import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f", pi);


            //Scanner Class
/**        1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.*/
        System.out.println("Enter a integer.");
        Scanner sc = new Scanner(System.in);

        int userNumber = sc.nextInt();
        System.out.println(userNumber);


/**        2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.   */
                System.out.println("Please enter three words");
                String userWord = sc.next();
                String userWord2 = sc.next();
                String userWord3 = sc.next();
                System.out.printf("The three words you entered are: %n%s, %n%s, %n%s", userWord, userWord2, userWord3);



/**        3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user. */
//        System.out.println("Enter a sentence.");
//        String storeSentenceInput = sc.next();
//        System.out.format("Here is your sentence: \n%s", storeSentenceInput);





/**        4. Rewrite the above example using the nextLine method. */

        System.out.println("Enter a sentence.");
        sc.nextLine();
        String storeSentenceInput = sc.nextLine();
        System.out.format("Here is your sentence: \n%s", storeSentenceInput);


                //calculate the perimeter and area
        /** 1. Prompt the user to enter values of length and width of a classroom at Codeup or your room if virtual.*/
        System.out.println("Enter width");
        double width = Double.parseDouble(sc.nextLine());
        System.out.println("Enter length");
        double length = Double.parseDouble(sc.nextLine());
        double area = width * length;
        double perimeter = (width * 2) + (length * 2);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }
}
