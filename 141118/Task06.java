import java.util.*;
class Task06{
    public static void main(String[]args){
        Scanner pagla = new Scanner(System.in);
        int T = pagla.nextInt();
        for(int count = 1; count <=T ; count++){
            String condition = "an Unhappy";
            int tmp = pagla.nextInt();
            int N = tmp;
            int result;
            N *= 10;
            while(N > 9){
                result = 0;
                while(N > 0){
                    result += (N % 10) * (N % 10);
                    N /= 10;
                }
                N = result;
            } 
            if(N == 1){
                condition = "a Happy";
            }
            System.out.println("Case #" + count + ": "+ tmp + " is " + condition + " number");
        }
    }
}




