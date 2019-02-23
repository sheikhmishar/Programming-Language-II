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
public class mediumProblem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pagla = new Scanner(System.in);
        String s1 = pagla.nextLine();
        int counter1[] =  new int[s1.length()];
        String s2 = pagla.nextLine();
        int counter2[] =  new int[s2.length()];
        System.out.printf("%s %s\n", s1, s2);
        int sum = 0;
        for(int count = 0; count < counter1.length; count++){
            counter1[count] = s1.charAt(count);
            sum += counter1[count];
        }
        for(int count = 0; count < counter1.length; count++){
            counter2[count] = s2.charAt(count);
            sum += counter2[count];
        }
        System.out.println(sum);
        
        
        
        
    }
    
}
