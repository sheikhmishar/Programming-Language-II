/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author sheikhMishar00
 */
public class mediumProblem2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pagla = new Scanner(System.in);
        int max=1;
        do{
            String s = pagla.nextLine();
            int counter[] =  new int[s.length()];
            int checker[] =  new int[256];
            max=0;
            for(int count = 0; count < counter.length; count++){
                counter[count] = s.charAt(count);
                checker[s.charAt(count)]++;
                if(checker[s.charAt(count)] > max)
                    max = checker[s.charAt(count)];
            }
            if(max == 1)
                System.out.println("You entered "+s);
            else{
                for(int count = 0; count < 256; count++){
                    if(checker[count] > 1)
                        System.out.println("'" + (char)count + "' has been counted "+ checker[count] + " times in the word \""+ s +"\"");
                    
                }
                System.out.println("Please enter another word");
            }
        } while (max != 1);
    }
}
