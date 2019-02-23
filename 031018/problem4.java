import java.util.Scanner;

public class problem4{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String chagol = pagla.nextLine();
        int counter [] = new int[256];
        for(int count = 0; count < chagol.length(); count++){
            char modon = chagol.charAt(count);
            counter [(int)modon]++;
        }
        for(char count = 'A'; count <='Z'; count++){
            //if(counter[(int)count] != 0)
                System.out.println(count + " which is " + ((int)count) + " was found " + counter[(int)count] + " times");
        }
    }
}