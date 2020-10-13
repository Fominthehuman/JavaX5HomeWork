package HomeWork3.StudentAspirantPack;

import java.util.Scanner;

public class Student {

    Scanner in = new Scanner(System.in);

    protected String firstName;
    protected String lastName;
    protected String group;
    protected int scholarship5;
    protected int scholarship;
    protected double averageMark;

    Student() {
        firstName = "Рудольф";
        lastName = "Булочкин";
        group = "GroupName";
        scholarship5 = 100;
        scholarship = 80;
    }

    public void getScholarship() {
        System.out.println(group);
        System.out.println("Введите вашу среднюю оценку:");
        averageMark = in.nextInt();

        if (averageMark == 5) {
            System.out.println("Scholarship  = " + scholarship5);
        } else if (averageMark > 3) {
            System.out.println("Scholarship = " + scholarship);
        } else System.out.println("Student, you don't deserve a scholarship");

    }

    public void getScholarship(int sclrshp5, int sclrshp) {
        System.out.println(group);
        System.out.println("Введите вашу среднюю оценку:");
        averageMark = in.nextInt();

        if (averageMark == 5) {
            System.out.println("Scholarship  = " + sclrshp5);
        } else if (averageMark > 3) {
            System.out.println("Scholarship = " + sclrshp);
        } else System.out.println("Student, you don't deserve a scholarship");

    }

}
