public class Student {
    private String Name;

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                '}';
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

class Teacher{
    public static final String Name = "Name";
    private int no;
    private boolean truthy;

    public Teacher(int no, boolean truthy) {
        this.no = no;
        this.truthy = truthy;
    }

    public static String getName() {
        return Name;
    }

}