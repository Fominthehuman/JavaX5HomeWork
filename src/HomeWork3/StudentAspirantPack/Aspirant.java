package HomeWork3.StudentAspirantPack;

public class Aspirant extends Student {

    String study;
    int scholarship5;
    int scholarship;

    Aspirant(){
        study = "\nКроты - кто они? Друзья или захватчики?";
        scholarship5 = 200;
        scholarship = 180;
    }

    @Override
    public void getScholarship() {
        System.out.println("Название вашей научной работы: " + study);
        super.getScholarship(scholarship5, scholarship);
    }

}
