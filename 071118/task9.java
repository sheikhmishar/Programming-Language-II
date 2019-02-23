package labsubmit;

import java.util.*;

class Student{
  public String msg = "I love BU";
  public String shout(){
    return msg;
  }
}
class CSEStudent extends Student{
    public CSEStudent() {
        super();
        msg = "I want to transfer to CSE";
    }
    public String msg = "I love BU";
    public String shout(){
        return msg;
    }
}
class CSE111Student extends Student{
    public CSE111Student(){
        super();
        msg = "I love Java Programming";
    }
    public String msg = "I love BU";
    public String shout(){
        return msg;
    }
}
public class LabSubmit {

    public static void printShout(Student s){
    System.out.println("------------------");
    System.out.println(s.msg);
    System.out.println(s.shout());
  }
  public static void main(String [] args){
    Student s = new Student();
    CSEStudent cs = new CSEStudent();
    CSE111Student cs111 = new CSE111Student();
    System.out.println(s.msg);
    System.out.println(cs.msg);
    System.out.println(cs111.msg);
    printShout(s);
    printShout(cs);
    printShout(cs111);
  }

}
