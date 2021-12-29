import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(" " + i);
//            i++;
//        }

        /** Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.*/
//        int i=0;
//        do{
//            System.out.println(i);
//            i+=2;
//        }while(i<=100);


        /** Alter your loop to count backwards by 5's from 100 to -10.*/
//        int i=100;
//        do{
//            System.out.println(i);
//           i-=5;
//        }while(i>=-10);


        /** Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:*/

//        int i = 2;
//        do {
//            i = i * 2;
//            System.out.println(i);
//        } while(i < 1000000);

        /**Refactor the previous two exercises to use a for loop instead.*/
//        for(int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }

//        for(int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }

//        for(int i = 2; i <= 1000000; i=i *2) {
//            System.out.println(i);
//        }


        /** Fizzbuzz
         One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.*/
        /**1.Write a program that prints the numbers from 1 to 100.*/
        /**2.For multiples of three: print “Fizz” instead of the number.*/
        /**3.For the multiples of five: print “Buzz”.*/
        /**4.For numbers which are multiples of both three and five: print “FizzBuzz”.*/


//        for(int i = 1; i <= 100; i++) {
//            if(i % (3*5) == 0)
//                System.out.println("FizzBuzz");
//            else if(i % 5 == 0)
//                System.out.println("Buzz");
//            else if(i % 3 == 0)
//                System.out.println("Fizz");
//            else System.out.println(i);
//
//    }

        /**3. Display a table of powers.*/
        /** Prompt the user to enter an integer.*/
        /** Display a table of squares and cubes from 1 to the value entered.*/
        /** Ask if the user wants to continue.*/
        /** Assume that the user will enter valid data.*/
        /** Only continue if the user agrees to.*/

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What number would you like to go up to? ");
//        int userInput = scanner.nextInt();
//        System.out.println("Here is your table!");
//        System.out.println();
//        System.out.println("number\t| squared\t| cubed");
//        System.out.println("------\t| -------\t| -----");
//
//        for (int i = 1; i <= userInput; i++) {
//            long squaredNumber = i * i;
//            long cubedNumber = i * i * i;
//                System.out.printf("%d\t\t| %d\t\t\t| %d%n", i, squaredNumber, cubedNumber);
//        }


        /** 4. Convert given number grades into letter grades.
        -Prompt the user for a numerical grade from 0 to 100.
        -Display the corresponding letter grade.
        -Prompt the user to continue.
        -Assume that the user will enter valid integers for the grades.
        -The application should only continue if the user agrees to.
        -Grade Ranges:

        A : 100 - 88
        B : 87 - 80
        C : 79 - 67
        D : 66 - 60
        F : 59 - 0 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a letter grade from 0 to 100 ");
        int userInput = scanner.nextInt();

//        String a = "A";
//        String b = "B";
//        String c = "C";
//        String d = "D";
//        String f = "F";
        if (userInput <= 100 && userInput >= 88) {
            System.out.println("A");
        } else if (userInput < 87 && userInput >= 80) {
            System.out.println("B");
        } else if (userInput < 79 && userInput >= 67) {
            System.out.println("C");
        } else if (userInput < 66 && userInput >= 60) {
            System.out.println("D");
        } else if (userInput < 59) {
            System.out.println("F");
        }
    }
}