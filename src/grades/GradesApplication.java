package grades;

import util.Input;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student student1 = new Student("Ezekiel");
        student1.addGrade(21);
        student1.addGrade(95);
        student1.addGrade(100);
        students.put("Ezekiel Elliott", student1);
        Student student2 = new Student("Dak");
        student2.addGrade(4);
        student2.addGrade(95);
        student2.addGrade(100);
        students.put("Dak Prescott", student2);
        Student student3 = new Student("Amari");
        student3.addGrade(19);
        student3.addGrade(95);
        student3.addGrade(100);
        students.put("Amari Cooper", student3);
        Student student4 = new Student("Ceedee");
        student4.addGrade(88);
        student4.addGrade(95);
        student4.addGrade(100);
        students.put("Ceedee Lamb", student4);
        System.out.println(students);

        Input input = new Input();
        System.out.println("Welcome!\nUsername of students:");

        for(String gitHubUsernames: students.keySet()) {
            System.out.print(gitHubUsernames + " ");
            System.out.println(" ");
        }
        System.out.println("What student would you like to see more information on?");

        String keyTyped = input.getString();

        if(students.containsKey(keyTyped)) {
            System.out.printf("Name: %s - Github Username: %s\n" + "Current Average: %f\n", students.get(keyTyped).getName(), keyTyped, students.get(keyTyped).getGradeAverage());
        }else {
            System.err.println(" " +
                    "Sorry, no student found with that Github username of \"" + keyTyped + "\"." );
        }

    }
//    System.out.println("Would you like to see another student?");
//    if (input.yesNo()) {
//        System.out.println("Would you like to see another student?");
    }

