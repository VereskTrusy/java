package chapter02.ex02_ArrayAndArrayList.ex06_ArrayEXE;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {


        Student lee = new Student(1,"Lee");
        Student kim = new Student(2, "Kim");



        lee.subjectSetting("국어", 100);
        lee.subjectSetting("수학", 50);


        kim.subjectSetting("국어", 70);
        kim.subjectSetting("수학", 85);
        kim.subjectSetting("영어", 100);

        lee.showStudentInfo();
        lee.showSubjectInfo();
        lee.subjectTotal();

        kim.showStudentInfo();
        kim.showSubjectInfo();
        lee.subjectTotal();
    }
}
