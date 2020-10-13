package HomeWork3.StudentAspirantPack;

public class Main {

    public static void main(String[] args) {

        Student[] array = new Student[]{new Aspirant(), new Student()};

        for (int i = 0; i < array.length; i++) {
            array[i].getScholarship();
        }

    }

}
