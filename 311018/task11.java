import java.util.Scanner;

public class task11{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String s1 = pagla.nextLine();
        String s2 = pagla.nextLine();
        char ch1[] = s1.toCharArray();
        for(int count = ch1.length-1; count >= 0; count--){
            if(ch1[count] >= 'a' && ch1[count] <= 'z'){
                ch1[count] -= ('a'-'A');
            }
        }
        char ch2[] = s2.toCharArray();
        for(int count = ch2.length-1; count >= 0; count--){
            if(ch2[count] >= 'a' && ch2[count] <= 'z'){
                ch2[count] -= ('a'-'A');
            }
        }
        boolean checker = true;
        for(int count = ch2.length-1; count >= 0; count--){
            if(ch2[count] != ch1[count]){
                checker = false;
            }
        }
        System.out.println(checker);
    }
}