import java.util.Scanner;
import java.util.Arrays;

public class alphabetProblem{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String chagol = pagla.nextLine();
        int counter [] = new int[((int)'Z')-((int)'A')+1];
        char alphabet [] = new char[((int)'Z')-((int)'A')+1];
        
        for(int count = 0; count < alphabet.length; count++){
            alphabet[count] = (char)(count+65);
        }
        
        for(int count = 0; count < chagol.length(); count++){
            char modon = chagol.charAt(count);
            counter [((int)modon)-((int)'A')]++;
        }
        
        System.out.println(Arrays.toString(alphabet));
        System.out.println(Arrays.toString(counter));
        
        for(int count = 0; count < counter.length; count++){
            if(counter[(int)count] != 0)
                System.out.println((char)(count+65) + " which is " + (count+65) + " was found " + counter[count] + " times");
        }
    }
}