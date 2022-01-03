import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Hi my name is Bob! Do you need something?");
//
//        String reply = "";
//        while (!reply.equalsIgnoreCase("BYE")) {
//            System.out.println("What do you want?");
//            reply = sc.nextLine();
//            if (reply.isEmpty()) {
//                System.out.println("Fine, be that way!");
//            } else if (reply.endsWith("?")) {
//                System.out.println("Sure.");
//            } else if (reply.endsWith("!")) {
//                System.out.println("Whoa, chill bro!");
//            } else {
//                System.out.println("Whatever...");
//            }
//        }
//        System.out.println("Laters");



        Boolean confirmation = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi");

        do {
            String response = sc.nextLine();
            if (response.endsWith("?")) {
                System.out.println("Sure.");
            } else if (response.endsWith("!")) {
                System.out.println("Whoah, chill out!");
            } else if (response.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (response.contains("bye")) {
                System.out.println("Bye");
                confirmation = false;
            } else {
                System.out.println("Whatever");
            }
        }while(confirmation);
    }
}