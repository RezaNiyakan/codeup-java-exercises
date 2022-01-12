package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for(Integer grade : this.grades) {
            total = total + grade;
        }
        return total / this.grades.size();
    }

    public static void main (String[] args) {
        Student Reza = new Student("Reza");
        Reza.addGrade(80);
        Reza.addGrade(90);
        Reza.addGrade(100);
        System.out.println(Reza.getGradeAverage());

    }
}

