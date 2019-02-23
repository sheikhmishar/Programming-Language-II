import java.util.Scanner;

public class problem6{
    public static void main(String[] args){
        Scanner lab = new Scanner(System.in);
        int n = lab.nextInt();
        for(int count = 1, sum = 0; count <= n; count++){
            if (count % 2 != 0)
                sum += count*count;
            else
                sum -= count*count;
        }
    }
}