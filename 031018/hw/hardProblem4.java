
import java.util.Scanner;

public class hardProblem4 {

    public static void main(String[] args) {
        Scanner pagla = new Scanner(System.in);
        //System.out.println((int)'a' +" " +(int)'A' +" " + (int)'z' +" " +(int)'Z' );
        int n = pagla.nextInt();
        String s = pagla.next();
        s = s.toUpperCase();
        int counter[] =  new int[s.length()];
        for(int count = 0; count < s.length(); count++){
            counter[count] = s.charAt(count) + n;
            if(counter[count] > 'Z'){
                while(counter[count] > 90)
                    counter[count] = counter[count] - 26;
            }
        }
        for(int count = 0; count < s.length(); count++){
            System.out.print((char)counter[count]);
        }
        System.out.println();
    }
    
}
