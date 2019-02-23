import java.util.*;

public class hardProblem1 {
    public static void main(String[] args) {
        Scanner pagla = new Scanner(System.in);
        String s = pagla.nextLine();
        int counter[] =  new int[s.length()];
        for(int count = 0; count < s.length(); count++){
            counter[count] = s.charAt(count) - '0';
        }
        System.out.println(Arrays.toString(counter));
        int sum = 0;
        for(int count = 0; count < s.length(); count++){
            sum += counter[count];
        }
        if(sum % 3 == 0)
            System.out.println(s + " is divisible by 3.");
        else
            System.out.println(s + " is not divisible by 3.");
    }
}
