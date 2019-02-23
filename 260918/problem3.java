import java.util.Scanner;
import java.util.Arrays;

public class problem3{
    public static void main(String[] args){
        Scanner lab = new Scanner(System.in);
        int printer[] = new int[10];
        for (int count = 0; count < printer.length; count++) {
            printer[count] = lab.nextInt();
        }
        for(int count = 0; count < printer.length; count++){
            for(int innerCount = 0; innerCount <= count; innerCount++){
                if(printer[count] > printer[innerCount]){
                    int tmp = printer[count];
                    printer[count] = printer[innerCount];
                    printer[innerCount] = tmp;
                }
                
            }
        }
        System.out.print(Arrays.toString(printer));
    }
}