import java.util.Scanner;
import java.util.Arrays;

public class problem4{
    public static void main(String[] args){
        Scanner lab = new Scanner(System.in);
        int printer[] = new int[10];
        for(int count = 0; count < 10; count++){
            printer[count] = lab.nextInt();
            for(int checkerCount = 0; checkerCount < count; checkerCount++){
                if(printer[count] == printer[checkerCount]){
                    System.out.println("Enter again");
                    count--;
                    break;
                }
            }
        }
        System.out.print(Arrays.toString(printer));
    }
}