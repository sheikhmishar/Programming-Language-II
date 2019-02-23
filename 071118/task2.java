import java.util.*;

class Student {

    private String name = "Just a Student";
    private String department = "nothing";

    public void setDepartment(String dpt) {
        this.department = dpt;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name : " + name + " Department: " + department;
    }
}

class BBAStudent extends Student{

    BBAStudent() {
        super.setName("Default BBA Student");
        super.setDepartment("BBA");
    }
    BBAStudent(String s){
        super.setName(s);
        super.setDepartment("BBA");
    }
}

public class task2 {

    public static void printName(Student s) {
        System.out.println(s.toString());
    }

    public static void main(String[] args) {
        printName(new BBAStudent());
        printName(new BBAStudent("Humty Dumty"));
        printName(new BBAStudent("Little Bo Peep"));
    }

}
