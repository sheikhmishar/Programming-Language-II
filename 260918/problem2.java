import java.util.Scanner;

public class problem2{
    public static void main(String[] args){
        Scanner lab = new Scanner(System.in);
        int printer[] = new int[10];
        for(int count = 0; count < 10; count++){
            printer[count] = lab.nextInt();
            System.out.println("You have entered "+ printer[count]);
        }
    }
}