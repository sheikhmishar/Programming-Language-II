import java.util.Scanner;

public class task2{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String s = pagla.next();
        char ch[] = s.toCharArray();
        int n = pagla.nextInt();
        if(n < ch.length && n >= 0)
            System.out.println(ch[n]);
        else
            System.out.println("Invalid index");
    }
}