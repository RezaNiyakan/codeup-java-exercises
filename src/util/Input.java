package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Please enter something");
        String newString = scanner.nextLine();
        System.out.printf("You have entered: %s", newString);
        return newString;
    }

    public String getString(String prompt) {
        System.out.printf("%s\n", prompt);
        String output = this.scanner.next();
        System.out.println();
        return output;
    }

//    public String getString()   {
//        return this.scanner.nextLine();
//    }

    public boolean yesNo(String param) {
        String testStr = getString(param);
        return testStr.equalsIgnoreCase("yes") || testStr.equalsIgnoreCase("y");
    }

    public boolean yesNo() {
        String userInput = this.scanner.nextLine();
        return userInput.trim().equalsIgnoreCase("Y") || userInput.trim().equalsIgnoreCase("yes");
    }

//    public int getInt(int min, int max) {
//        System.out.printf("Pick a number between %d and %d", min, max);
//        int userNumber = this.scanner.nextInt();
//
//        if(userNumber >= min && userNumber <= max) {
//            return userNumber;
//        } else {
//            System.out.println("The number is invalid.");
//            return getInt(min, max);
//        }
//    }
//
//    public double getDouble(double min, double max) {
//        System.out.printf("Give me a decimal number between %f and %f", min, max);
//        double userNumber = this.scanner.nextDouble();
//
//        if (userNumber >= min && userNumber <= max) {
//            return userNumber;
//        } else {
//            System.out.println("That number is not valid.");
//            return getDouble(min, max);
//        }
//    }

    public int getInt(int min, int max) {
        int finalOutput = 0;
        String rangeString = String.format("Input an integer between %d and %d.", min, max);
        while (true) {
            int output = getInt(rangeString);
            if (output >= min && output <= max) {
                finalOutput = output;
                break;
            }
        }
        return finalOutput;
    }

    public int getInt(String prompt) {
        boolean loopAgain = true;
        int output = 0;
        do {
            try {
                System.out.printf("%s\n", prompt);
                output = Integer.valueOf(this.scanner.next());
                loopAgain = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (loopAgain);
        return output;
    }

    public double getDouble(double min, double max) {
        double finalOutput = 0;
        String rangeString = String.format("Input a double between %f and %f.", min, max);
        while (true) {
            double output = getDouble(rangeString);
            if (output >= min && output <= max) {
                finalOutput = output;
                break;
            }
        }
        return finalOutput;
    }

    public double getDouble(String prompt) {
        boolean loopAgain = true;
        double output = 0;
        do {
            try {
                System.out.printf("%s\n", prompt);
                output = Double.valueOf(this.scanner.next());
                loopAgain = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (loopAgain);
        return output;
    }


    public int getInt() {
        System.out.println("What is the radius of a circle?");
        return scanner.nextInt();
    }

    public int getBinary(String prompt) {
        boolean loopAgain = true;
        int output = 0;
        do {
            try {
                System.out.printf("%s\n", prompt);
                output = Integer.valueOf(this.scanner.next(), 2);
                loopAgain = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (loopAgain);
        return output;
    }

    public long getHex(String prompt) {
        boolean loopAgain = true;
        long output =  0;
        do {
            try {
                System.out.printf("%s\n", prompt);
                output = Integer.valueOf(this.scanner.next(), 16);
                loopAgain = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (loopAgain);
        return  output;
    }
}


