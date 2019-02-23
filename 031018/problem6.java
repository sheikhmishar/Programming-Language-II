import java.util.Scanner;

public class problem6{
    public static void main(String[] args){
        Scanner pagla = new Scanner(System.in);
        String chagol = pagla.nextLine();
        System.out.printf("%s\n%s\n%s", chagol, chagol.concat("==THE END=="), chagol);
    }
}