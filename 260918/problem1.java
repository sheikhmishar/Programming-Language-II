import java.util.Scanner;

public class problem1{
    public static void main(String[] args){
        Scanner lab = new Scanner(System.in);
        int printer[] = new int[10];
        for(int count = 0; count < 10; count++){
            printer[count] = lab.nextInt();
        }
        for(int count = 9; count >= 0; count--){
            printer[count] = lab.nextInt();
        }
    }
}