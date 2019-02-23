package labsubmit;

import java.util.*;
class Fruit{
    private boolean formalin = false;
    public String name = "";
    public Fruit(boolean formalin, String name){
        this.formalin = formalin;
        this.name = name;    
    }    
    public String getName(){
        return name;
    }
    public boolean hasFormalin(){
        return formalin;
    }
}
class Mango extends Fruit{

    public Mango() {
        super(true, "Mango");
    }
    public String toString(){
        return "Mangos are bad for you";
    }
}
class Jackfruit extends Fruit{
    public Jackfruit(){
        super(false, "Jackfruit");
    }
    public String toString(){
        return "Jackfruits are good for you";
    }
}
public class LabSubmit {

    public static void testFruit(Fruit f){
        System.out.println("----Printing Detail-----");
        if(f.hasFormalin()){      
            System.out.println("Do not eat the "+f.getName()+".");
            System.out.println(f);
        }else{
            System.out.println("Eat the "+f.getName()+".");
            System.out.println(f);
        }
    }  
    public static void main(String [] args){
        Mango m = new Mango();
        testFruit(m);
        Jackfruit j = new Jackfruit();
        testFruit(j);
    }

}
