import java.util.Scanner;

public class problem4a{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        int counter [] = new int[5];
        for(int count = 0; count < 8; count++){
            int keyboard = pagla.nextInt();
            counter [keyboard] = counter[keyboard] + 1;
        }
        for(int count = 2; count <= 4; count++){
            System.out.println(count + " was found " + counter [count] + " times");
        }
    }
}