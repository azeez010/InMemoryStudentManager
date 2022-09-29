import java.util.ArrayList;

public class Main {
    ///////////////////////////////////////////////////////////////////////////
    // Hello the is a java class
    ///////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        Student bode = new Student();
        bode.setName("Bode");
        System.out.println(bode.toString());
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(bode);
        students.add(bode);

        for (Student student : students) {
            System.out.println(student);
        }

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

    }
}
