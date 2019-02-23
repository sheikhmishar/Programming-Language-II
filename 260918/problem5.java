import java.util.Scanner;
import java.util.Arrays;

public class problem5{
    public static void main(String[] args){
        Scanner lab = new Scanner(System.in);
        double I;
        double E = lab.nextDouble();
        double R = lab.nextDouble();
        double L = lab.nextDouble();
        double C = lab.nextDouble();
        double f = lab.nextDouble();
        I = E/(Math.sqrt(R*R + Math.pow((2* Math.PI * f * L - 1 /(2* Math.PI*f*C)),2)));
        System.out.print(I);
    }
}