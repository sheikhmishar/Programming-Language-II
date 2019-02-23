import java.util.Scanner;

public class task20{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String s1 = pagla.next();
        char ch1[] = s1.toCharArray();
        String s2 = pagla.next();
        char ch2[] = s2.toCharArray();
        char chFinal[] = new char[ch1.length + ch2.length];
        for(int count = 0; count < ch1.length; count++){
            chFinal[count] = ch1[count];
        }
        for(int count = 0; count < ch2.length; count++){
            chFinal[count + ch1.length] = ch2[count];
        }
        for(int count = 0; count < chFinal.length; count++){
            System.out.print(chFinal[count]+" ");
        }
    }
}