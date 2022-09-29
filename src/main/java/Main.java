import java.util.ArrayList;
import java.util.List;

import com.student.helpers.Helper;

public class Main {
    ///////////////////////////////////////////////////////////////////////////
    // Hello the is a java class
    ///////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        Student bode = new Student();
        bode.setName("Bode");
        System.out.println(bode.toString());
        List<Student> students = new ArrayList<Student>();
        students.add(bode);
        students.add(bode);


        for (Student student : students) {
            System.out.println(student);
        }
        Student hasBode = Helper.searchArray(students, null);

        System.out.println(hasBode);
        Student[] studentList = new Student[3];
        studentList[0] = bode;
        studentList[1] = bode;

        for (Student student : studentList) {
            try{
                System.out.println(student.getName());
            }
            catch (NullPointerException e) {
                System.out.println(e);
            }
        }

        Student jay = new Student();
        jay.setName("Jay");
        System.out.println(jay);

        Teacher.shout();

    }
}
