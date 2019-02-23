import java.util.Scanner;

public class task4{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String s1 = pagla.nextLine();
        String s2 = pagla.nextLine();
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        boolean checker = true;
        int pos=0;
        for(int count = ch1.length-ch2.length; count >= 0; count--){
            if(ch2[count] != ch1[pos++]){
                checker = false;
            }
        }
        System.out.println(checker);
    }
}