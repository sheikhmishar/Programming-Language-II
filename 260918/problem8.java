import java.util.Scanner;
import java.util.Arrays;

public class problem8{
    public static void main(String[] args){
        Scanner lab = new Scanner(System.in);
        int printer[] = new int[10];
        int amount[] = new int[10];
        for(int count = 0; count < printer.length; count++){
            printer[count] = lab.nextInt();
            while(printer[count] > 9){
                System.out.println("Enter again");
                printer[count] = lab.nextInt();
            }
            for(int checker = 0; checker < amount.length; checker++){
                if(printer[count]==checker){
                    amount[checker]++;
                }
            }
        }
       
                                             
        for(int counter = 0; counter < printer.length; counter++){
            if(amount[counter] >= 2 && amount[counter] <5)
                System.out.println(counter + ",");
        }
    }
}