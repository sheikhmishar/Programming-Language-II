import java.util.Scanner;

public class problem7{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String s1 = "PLEASE KEEP SILENCE";
        String s2 = "PLEASE KEEP SILENCE";
        String s3 = "PLEASE NEEP NILENCE";
        String s4 = "OLEASE NEEP NILENCE";
        String s5 = "Please Keep Silence";
        //compareTo
        System.out.println("compareTo ");
        System.out.println("s1 & s2 "+s1.compareTo(s2));
        System.out.println("s1 & s3 "+s1.compareTo(s3));
        System.out.println("s1 & s4 "+s1.compareTo(s4));
        System.out.println("s1 & s5 "+s1.compareTo(s5));
        System.out.println("s1 & s1 "+s1.compareTo(s1));
        //compareToIgnoreCase
        System.out.println("compareToIgnoreCase ");
        System.out.println("s1 & s2 "+s1.compareToIgnoreCase(s2));
        System.out.println("s1 & s3 "+s1.compareToIgnoreCase(s3));
        System.out.println("s1 & s4 "+s1.compareToIgnoreCase(s4));
        System.out.println("s1 & s5 "+s1.compareToIgnoreCase(s5));
        System.out.println("s1 & s1 "+s1.compareToIgnoreCase(s1));
        //startsWith
        System.out.println("startsWith ");
        System.out.println("s1 & s2 "+s1.startsWith(s2));
        System.out.println("s1 & s3 "+s1.startsWith(s3));
        System.out.println("s1 & s4 "+s1.startsWith(s4));
        System.out.println("s1 & s5 "+s1.startsWith(s5));
        System.out.println("s1 & s1 "+s1.startsWith(s1));
        //endsWith
        System.out.println("endsWith ");
        System.out.println("s1 & s2 "+s1.endsWith(s2));
        System.out.println("s1 & s3 "+s1.endsWith(s3));
        System.out.println("s1 & s4 "+s1.endsWith(s4));
        System.out.println("s1 & s5 "+s1.endsWith(s5));
        System.out.println("s1 & s1 "+s1.endsWith(s1));
        //equals
        System.out.println("equals ");
        System.out.println("s1 & s2 "+s1.equals(s2));
        System.out.println("s1 & s3 "+s1.equals(s3));
        System.out.println("s1 & s4 "+s1.equals(s4));
        System.out.println("s1 & s5 "+s1.equals(s5));
        System.out.println("s1 & s1 "+s1.equals(s1));
        //equalsIgnoreCase
        System.out.println("equalsIgnoreCase ");
        System.out.println("s1 & s2 "+s1.equalsIgnoreCase(s2));
        System.out.println("s1 & s3 "+s1.equalsIgnoreCase(s3));
        System.out.println("s1 & s4 "+s1.equalsIgnoreCase(s4));
        System.out.println("s1 & s5 "+s1.equalsIgnoreCase(s5));
        System.out.println("s1 & s1 "+s1.equalsIgnoreCase(s1));
        //indexOf
        System.out.println("indexOf ");
        System.out.println("s1 & s2 "+s1.indexOf(s2));
        System.out.println("s1 & s3 "+s1.indexOf(s3));
        System.out.println("s1 & s4 "+s1.indexOf(s4));
        System.out.println("s1 & s5 "+s1.indexOf(s5));
        System.out.println("s1 & s1 "+s1.indexOf(s1));
        //lastIndexOf
        System.out.println("lastIndexOf ");
        System.out.println("s1 & s2 "+s1.lastIndexOf(s2));
        System.out.println("s1 & s3 "+s1.lastIndexOf(s3));
        System.out.println("s1 & s4 "+s1.lastIndexOf(s4));
        System.out.println("s1 & s5 "+s1.lastIndexOf(s5));
        System.out.println("s1 & s1 "+s1.lastIndexOf(s1));
        //7i) length
        System.out.println("length ");
        System.out.println("s1 "+s1.length());
        System.out.println("s2 "+s2.length());
        System.out.println("s3 "+s3.length());
        System.out.println("s4 "+s4.length());
        System.out.println("s5 "+s5.length());
        //7j) replace(char oldChar, char newChar)
        System.out.println("compareToIgnoreCase ");
        System.out.println("s1 & s2 "+s1.compareTo(s2));
        System.out.println("s1 & s3 "+s1.compareTo(s3));
        System.out.println("s1 & s4 "+s1.compareTo(s4));
        System.out.println("s1 & s5 "+s1.compareTo(s5));
        System.out.println("s1 & s1 "+s1.compareTo(s1));
        //7k) substring
        System.out.println("startsWith ");
        System.out.println("s1 & s2 "+s1.compareTo(s2));
        System.out.println("s1 & s3 "+s1.compareTo(s3));
        System.out.println("s1 & s4 "+s1.compareTo(s4));
        System.out.println("s1 & s5 "+s1.compareTo(s5));
        System.out.println("s1 & s1 "+s1.compareTo(s1));
        //7l) toCharArray
        System.out.println("endsWith ");
        System.out.println("s1 & s2 "+s1.compareTo(s2));
        System.out.println("s1 & s3 "+s1.compareTo(s3));
        System.out.println("s1 & s4 "+s1.compareTo(s4));
        System.out.println("s1 & s5 "+s1.compareTo(s5));
        System.out.println("s1 & s1 "+s1.compareTo(s1));
        //7m) toLowerCase
        System.out.println("equals ");
        System.out.println("s1 & s2 "+s1.compareTo(s2));
        System.out.println("s1 & s3 "+s1.compareTo(s3));
        System.out.println("s1 & s4 "+s1.compareTo(s4));
        System.out.println("s1 & s5 "+s1.compareTo(s5));
        System.out.println("s1 & s1 "+s1.compareTo(s1));
        //7n) toUpperCase
        System.out.println("equalsIgnoreCase ");
        System.out.println("s1 & s2 "+s1.compareTo(s2));
        System.out.println("s1 & s3 "+s1.compareTo(s3));
        System.out.println("s1 & s4 "+s1.compareTo(s4));
        System.out.println("s1 & s5 "+s1.compareTo(s5));
        System.out.println("s1 & s1 "+s1.compareTo(s1));
        //7o) trim
        String bus = "foul :";
        System.out.println("equalsIgnoreCase " + bus.trim());
        
        //7p) valueOf
        System.out.println("equalsIgnoreCase ");
        System.out.println("s1 & s2 "+s1.equalsIgnoreCase(s2));
        System.out.println("s1 & s3 "+s1.equalsIgnoreCase(s3));
        System.out.println("s1 & s4 "+s1.equalsIgnoreCase(s4));
        System.out.println("s1 & s5 "+s1.equalsIgnoreCase(s5));
        System.out.println("s1 & s1 "+s1.equalsIgnoreCase(s1));
    }
}