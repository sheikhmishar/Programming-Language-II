public class BBAStudent extends Student{
  BBAStudent(String n){
    setDepartment("BBA");
    setName(n);
  }BBAStudent(){
    setDepartment("BBA");
    setName("Default BBA Student");
  }
   public String toString(){
    return "Name : " + getName() + " Department: BBA" ;
  }
}