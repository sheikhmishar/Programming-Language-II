import java.util.Scanner;

public class task6{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String s = pagla.nextLine();
        String tmp = pagla.nextLine();
        char oldRep[] = tmp.toCharArray();
        tmp = pagla.nextLine();
        char newRep[] = tmp.toCharArray();
        char ch1[] = s.toCharArray();
        char ch2[] = s.toCharArray();
        for(int count = 0; count < ch2.length; count++){
            if(ch2[count] == oldRep[0]){
                ch2[count] = newRep[0];
            }
            System.out.print(ch2[count]+ " " );
        }
        
    }
}