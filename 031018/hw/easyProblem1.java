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
public class easyProblem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pagla = new Scanner(System.in);
        String s = pagla.nextLine();
        int counter[] =  new int[s.length()];
        for(int count = 0; count < s.length(); count++){
            counter[count] = s.charAt(count);
        }
        for(int count = 0; count < s.length(); count++){
            for(int innerCount =   1; innerCount < s.length() - count; innerCount++){
                if(counter[innerCount-1] > counter[innerCount]){
                    int tmp = counter[innerCount];
                    counter[innerCount] = counter[innerCount-1];
                    counter[innerCount-1] = tmp;
                }
            }
        }
        for(int count = 0; count < s.length(); count++){
            System.out.print((char)counter[count] + " ");
        }
        System.out.println();
    }
    
}
