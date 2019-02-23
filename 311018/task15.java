import java.util.Scanner;

public class task15{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String s = pagla.next();
        char ch[] = s.toCharArray();
        int n = -1;
        while(n > ch.length && n < 0)
            n = pagla.nextInt();
        int m = -1;
        while(m > ch.length && m < 0 && m > n)
            m = pagla.nextInt();
        for(int count = n-1; count < m; count++){
            System.out.print(ch[count] + " ");
        }
    }
}