import java.util.Scanner;

public class task14{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String s = pagla.next();
        char ch[] = s.toCharArray();
        int n = -1;
        while(n > ch.length && n < 0)
            n = pagla.nextInt();
        for(int count = n-1; count < ch.length; count++){
            System.out.print(ch[count] + " ");
        }
    }
}