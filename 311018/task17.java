import java.util.Scanner;

public class task17{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String s = pagla.next();
        char ch[] = s.toCharArray();
        s = pagla.next();
        char comp[] = s.toCharArray();
        int index = -1;
        for(int count = ch.length-1; count >= 0; count--){
            if(ch[count] == comp[0]){
                index = count;
                break;
            }
        }
        System.out.println(index);
    }
}