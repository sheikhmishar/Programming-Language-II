package labsubmit;

import java.util.*;

class RealNumber {

    private double realValue;

    public double getRealValue() {
        return realValue;
    }

    public void setRealValue(double r) {
        realValue = r;
    }

    public RealNumber() {
        this(0);
    }

    public RealNumber(double r) {
        setRealValue(r);
    }

    public String toString() {
        return "RealPart: " + getRealValue();
    }

    public void ping() {
        System.out.println("I'm in RealNumber class");
    }
}
class ComplexNumber extends RealNumber{
    private double imaginaryValue;
    public ComplexNumber() {
        super();
        setRealValue(1);
        setImaginaryValue(1);
    }
    public ComplexNumber(int a, int b){
        super();
        setRealValue(a);
        setImaginaryValue(b);
    }
    public void setImaginaryValue(double a){
        imaginaryValue = a;
    }
    public double getImaginaryValue(){
        return imaginaryValue;
    }
    public void check(){
        System.out.println("I'm in ComplexNumber class");
        super.ping();
        System.out.println("Checking ended");
    }
    public String toString() {
        return ("RealPart: " + getRealValue() + "\nImaginaryPart: " + getImaginaryValue());
    }
}
public class LabSubmit {

    public static void main(String[] args) {
        RealNumber rn = new ComplexNumber();
        System.out.println(rn);

        System.out.println("--------------------");

        rn = new ComplexNumber(5, 7);
        System.out.println(rn);

        System.out.println("--------------------");
        ComplexNumber cn = new ComplexNumber();
        cn.check();
    }

}
