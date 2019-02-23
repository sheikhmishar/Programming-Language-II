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
public class mediumProblem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pagla = new Scanner(System.in);
        String s = pagla.nextLine();
        int counter[] =  new int[s.length()];
        for(int count = 0; count < counter.length; count++){
            counter[count] = s.charAt(count);
        }
        
        for(int count = 0; count < counter.length; count++){
            for(int innerCount = 0; innerCount <= count; innerCount++){
                System.out.print((char)(counter[innerCount]));
            }
            System.out.println();
        }
        
    }
    
}
