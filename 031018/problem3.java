import java.util.Scanner;

public class problem3{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String chagol = pagla.nextLine();
        for(int count = 0; count < chagol.length(); count++){
            System.out.println(chagol.charAt(count)+" : "+chagol.codePointAt(count));
        }
    }
}