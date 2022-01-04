import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(add(5, 5));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplication(5, 5));
        System.out.println(division(10, 2));
        System.out.println(modulus(10, 2));

        int myInt = getInteger(1, 50);
        System.out.println(myInt);

        System.out.println("getInteger(1,10) = " + getInteger(1, 10));


        while (true) {
            System.out.println("factorial() = " + factorial());
            System.out.println("Do you want to continue? y/n");
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                System.out.println("Bye bye");
                break;
            }
        }

        rollDice();


    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    /**
     * 2. Create a method that validates that user input is in a certain range.
     * The method signature should look like this:
     * public static int getInteger(int min, int max);
     */

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d \n", min, max);
        int userInput = sc.nextInt();
        if (userInput > min && userInput <= max) {
            System.out.println("Your number is valid!");
            return userInput;
        } else {
            System.out.println("Invalid! Enter your number again!");
            return getInteger(min, max);
        }
    }

    /**
     * 3. Calculate the factorial of a number.
     */

    public static long factorial() {
        int userInput = getInteger(1, 10);
        long output = 1;
        for (int counter = 1; counter <= userInput; counter++) {
            output *= counter;
        }
        return output;
    }


    /**
     * 4. Create an application that simulates dice rolling.
     */

    public static void rollDice(int sides, int numberOfDice) {
        for (int i = 1; i <= numberOfDice; i++) {
            int result = (int) Math.floor(Math.random() * ((sides - 1) + 1) + 1);
            System.out.println(result);
        }
    }


    public static void rollDice() {
        boolean keepRolling = true;
        while (keepRolling) {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many sides are on both dice?");
            int sides = sc.nextInt();
            System.out.println("How many dice are you wanting to roll?");
            int numDice = sc.nextInt();
            rollDice(sides, numDice);
            sc.nextLine();
            String answer = " ";
            while (!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N")) {
                System.out.println("Keep playing? [Y/N]");
                answer = sc.nextLine();
            }
            if (answer.equalsIgnoreCase("N")) {
                System.out.println("Thanks for playing!");
                keepRolling = false;


//         /** 5. Game Development 101 */
//         public class HighLow   {
//             Scanner sc = new Scanner(System.in);
//             int randomNum = (int) (Math.random() * (100 - 1) + 1);
//             boolean guess = false;
//             do{
//
//             int userNum = MethodsExercises.getInteger(1,100);
//             if(userNum == randomNum)   {
//                 System.out.println("Good Guess!");
//                 guess = true;
//                 ) else if (userNum > randomNum) {
//                     System.out.println("Lower");
//                 } else if (userNum <) randomNum) {
//                     System.out.println("Higher");
//                 } else {
//                     System.out.println("Ooops");
//                 }
//             } while(!guess);
//         }


            }
        }
    }
}

