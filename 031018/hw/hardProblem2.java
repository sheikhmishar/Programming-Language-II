import java.util.*;

public class hardProblem2 {
    public static void main(String[] args) {
        Scanner pagla = new Scanner(System.in);
        //System.out.print((char)64);
        String s1 = pagla.nextLine();
        int counter1[] =  new int[s1.length()];
        String s2 = pagla.nextLine();
        int counter2[] =  new int[s2.length()];
        for(int count = 0; count < s1.length(); count++){
            counter1[count] = s1.charAt(count) - 64;
        }
        for(int count = 0; count < s2.length(); count++){
            counter2[count] = s2.charAt(count) - 64;
        }
        //System.out.println(Arrays.toString(counter1));
        int prod1 = 1;
        for(int count = 0; count < s1.length(); count++){
            prod1 *= counter1[count];
        }
        int prod2 = 1;
        for(int count = 0; count < s2.length(); count++){
            prod2 *= counter2[count];
        }
        if(prod1%14 <  prod2%14)
            System.out.println("I Am Happy With My Coach");
        else
            System.out.println("I Am Sad With My Coach");
    }
}
