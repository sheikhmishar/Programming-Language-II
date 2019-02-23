import java.util.*;
public class Task05{
    public static void main(String[]args){
        String kisuShongkha = "74.5 89 45 4732 6546 5423.654";
        String parts[] = kisuShongkha.split(" ");
        double sum = 0;
        int i = 0;
        while(i < parts.length ){
            double N = Double.parseDouble(parts[i]);
            System.out.println(N);
            sum += N;
            i++;
        }
        System.out.println(sum);
    }
}
        
//        String golpo = "still you can find some teachers who dislike such co-curricular \n"+"activities like Programming Contests. They do not understand contests are\n"+"far more interesting and challenging than whatever slides he was showing in the classroom.\n"+"To be a good contestant, one needs to be resourceful."+"Apart from a working brain, the primary resource for a contestant would be books.\n"+"And a good source of books and training materials is the Internet.";
//        Scanner k2=new Scanner(golpo);
//        while(k2.hasNextLine()){
//            System.out.println(k2.nextLine());
//        }
//        
//        String s="23 3 8 20 32";
//        int sum=0;
        //Write code below that adds the above numbers and prints sum.




