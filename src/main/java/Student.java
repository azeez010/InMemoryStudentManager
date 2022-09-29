import java.text.MessageFormat;

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

    public static String getName() {
        return Name;
    }

    public Teacher() {

    }

    public static void shout(){
        System.out.println(MessageFormat.format("My name is {0}, I am {1}", Name, 30));
    }
}