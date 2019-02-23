import java.util.Scanner;

public class task16{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String s = pagla.next();
        char ch[] = s.toCharArray();
        s = pagla.next();
        char comp[] = s.toCharArray();
        int index = -1;
        for(int count = 0; count < ch.length; count++){
            if(ch[count] == comp[0]){
                index = count;
                break;
            }
        }
        System.out.println(index);
    }
}