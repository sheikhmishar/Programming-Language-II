import java.util.Scanner;

public class mediumProblem4 {
    public static void main(String[] args) {
        Scanner pagla = new Scanner(System.in);
        String s = pagla.nextLine();
        int counter[] =  new int[(s.length()+1)];
        for(int count = 0; count < s.length(); count++){
            counter[count] = s.charAt(count);
        }
        for(int count = 0; count < s.length(); count++){
            if(counter[count] != counter[count+1])
                System.out.print((char)counter[count]);
        }
        System.out.println();
    }
}
