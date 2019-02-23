import java.util.Scanner;

public class task9{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String s = pagla.nextLine();
        char ch[] = s.toCharArray();
        System.out.println((int)'A'+" "+(int)'a'+ " "+ (int)('a'-'A'));
        for(int count = ch.length-1; count >= 0; count--){
            if(ch[count] >= 'a' && ch[count] <= 'z'){
                ch[count] -= ('a'-'A');
            }
        }
        for(int count = 0; count < ch.length; count++){
            System.out.print(ch[count] +" ");
        }
    }
}