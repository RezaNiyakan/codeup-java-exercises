import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        /** Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.*/
//        int num = 0;
//        do{
//            System.out.println(num);
//            num += 2;
//        }while (num <= 100);


        /** Alter your loop to count backwards by 5's from 100 to -10.*/
//        int i=100;
//        do{
//            System.out.println(i);
//           i-=5;
//        }while(i >= -10);


        /** Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:*/

//        double i = 2;
//        do {
//            System.out.println((int)i);
//            i *= i;
//        } while(i < 1000000);


        /**Refactor the previous two exercises to use a for loop instead.*/
//        for (int i = 5; i <= 15; i++)   {
//            System.out.println(i);
//        }


//        for(int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }

//        for(int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for(long k = 2; k < 1000000; k *= k) {
//            System.out.println((int)k);
//        }


        /** Fizzbuzz
         One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.*/
        /**1.Write a program that prints the numbers from 1 to 100.*/
        /**2.For multiples of three: print “Fizz” instead of the number.*/
        /**3.For the multiples of five: print “Buzz”.*/
        /**4.For numbers which are multiples of both three and five: print “FizzBuzz”.*/


//        for(int i = 1; i <= 100; i++) {
//            if(i % 3 == 0 & i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            }   else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            }   else {
//                System.out.println(i);
//            }
//    }

        /**3. Display a table of powers.*/
        /** Prompt the user to enter an integer.*/
        /** Display a table of squares and cubes from 1 to the value entered.*/
        /** Ask if the user wants to continue.*/
        /** Assume that the user will enter valid data.*/
        /** Only continue if the user agrees to.*/

//        Scanner s = new Scanner(System.in);
//
//        String userResponse;
//
//        do {
//
//        System.out.print("What number would you like to go up to? ");
//        int userInput = s.nextInt();
//
//        System.out.println("\nHere is your table!\n");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int i = 1; i <= userInput; i++) {
//          int squared = (int) Math.pow(i, 2);
//            int cubed = (int) Math.pow(i, 3);
//                System.out.printf("%-6d | %-7d | %-5d%n", i, squared, cubed);
//        }
//            System.out.printf("%n%nWould you like to continue (y/n): ");
//            userResponse = s.next();
//
//        } while (userResponse.equals("y"));


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

        Scanner s = new Scanner(System.in);

        String userResponse;
        do {
            System.out.print("Pick a letter grade from 0 to 100: ");
            int userInput = s.nextInt();
            System.out.println();

            if (userInput <= 100 && userInput >= 88) {
                System.out.println("A");
            } else if (userInput <= 87 && userInput >= 80) {
                System.out.println("B");
            } else if (userInput <= 79 && userInput >= 67) {
                System.out.println("C");
            } else if (userInput <= 66 && userInput >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.printf("%n%nWould you like to continue (y/n): ");
            userResponse = s.next();

        } while (userResponse.equals("y"));



//                        ||
//        boolean continueGrading = true;
//
//        while (continueGrading) {
//            System.out.println("Give me a grade:");
//                    int grade = sc.nextInt();
//                    System.out.print("User got an: ");
//                    if (100 >= grade && grade >= 88) {
//                        System.out.println("A");
//                    }else if (grade <= 87 && grade >= 80) {
//                        System.out.println("B");
//                    }else if (grade <= 79 && grade >= 67) {
//                        System.out.println("C");
//                    }else if (grade <= 66 && grade >= 60) {
//                        System.out.println("D");
//                    }else   {
//                        System.out.println("F");
//                    }
//                    System.out.println("Would you like to continue grading?");
//                    continueGrading = sc.nextBoolean();
//
//        }
    }
}