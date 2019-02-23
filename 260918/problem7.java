import java.util.Scanner;
import java.util.Arrays;

public class problem7{
    public static void main(String[] args){
        Scanner lab = new Scanner(System.in);
        int printer[] = new int[11];
        int amount[] = new int[11];
        for(int count = 0; count < printer.length; count++){
            printer[count] = lab.nextInt();
            for(int checker = 0; checker <= count; checker++){
                if(printer[checker]==printer[count]){
                    amount[checker]++;
                    if(amount[checker] > 4){
                        System.out.println("Enter again");
                        count--;
                    }
                }
            }
        }
        System.out.print(Arrays.toString(printer));
    }
}