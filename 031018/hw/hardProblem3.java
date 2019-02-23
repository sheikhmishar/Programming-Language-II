import java.util.*;

public class hardProblem3 {
    
    public static void main(String[] args) {
        Scanner pagla = new Scanner(System.in);
        //System.out.println((int)'a' +" " +(int)'A' +" " + (int)'z' +" " +(int)'Z' );
        String s = pagla.next();
        //initializing final array
        char result[] = new char[s.length()];
        //calculating how many capital letters are there
        int cap = 0;
        for(int count = 0; count < result.length; count++){
            if(s.charAt(count) >= 'A' && s.charAt(count) <= 'Z')
                cap++;
        }
        //creating another array to hold just the indexes of capital letters to start reversing
        int capitalIndex[] = new int[cap];
        int done = 0;
        for(int count = 0; count < result.length; count++){
            if(s.charAt(count) >= 'A' && s.charAt(count) <= 'Z'){
                capitalIndex[done] = count;
                done++;
            }
        }
        // System.out.println(Arrays.toString(capitalIndex));
        // at last, reversing the words
        int stopper, starter;
        for(int count = 0; count < cap; count++){
            starter = capitalIndex[count];
            if(count == 0)
                stopper = 0;
            else
                stopper = capitalIndex[count-1] + 1;
            for(int innerCount = starter; innerCount >= stopper; innerCount--){
                result[capitalIndex[count] - innerCount + stopper] = s.charAt(innerCount);
            }
        }
        //System.out.println(Arrays.toString(result));
        for(int count = 0; count < result.length; count++){
            System.out.print(result[count]);
        }
        System.out.println();
        // At last, :) XD 
        
        
        /*
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] a = s.toCharArray();
        int start = 0, end = 0, next = 0; //the variables "start" and "end" is for swaping a particular portion of the array. and the 
        //variable "next" is to know where to start looking for another capital letter

        for(int i = 0; i<a.length;)
        {
            for(int j = i; j<a.length; ++j)
            {
                int val = (int)a[j];
                if(val >=65 && val<=90)
                {
                    end = j; 
                    next = end+1; //next = end +1 because we know that we are going to swap from swaping "start" index
                    //to "end" index. so next time when we are going to look for capital letters again we are going to search from end+1 index
                    break;
                }
            }
            while(start<end) //this loop is for swaping
            {
                char temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                ++start;
                --end;
            }
            start = next; //next time we are going to swap from here
            i = next; // we are done swaping start to end so i is now next;
        }
        System.out.println(Arrays.toString(a));
        */
    }
}
