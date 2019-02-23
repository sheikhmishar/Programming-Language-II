import java.util.*;

public class task17 {
  public static void main(String[] args) {
    Set<String> set=new HashSet<String>();
    String dir="NESW";
    
    Scanner sc=new Scanner(System.in);
    int mx=sc.nextInt();
    int my=sc.nextInt();
    
    while(sc.hasNext()){
      
      boolean off=false;
      char cdir=sc.next().charAt(0);
      String cmdi=sc.next();
      
      int x=sc.nextInt();
      int y=sc.nextInt();
      
      for(int i=0;i<cmdi.length();i++){
        char cmd=cmdi.charAt(i);
        
        if(cmd=='R'){
          int index=dir.indexOf(cdir);
          if(index==3){
            index=-1;
          }
          cdir=dir.charAt(index+1);
        }
        else if(cmd=='L'){
          int index=dir.indexOf(cdir);
          if(index==0){
            index=4;
          }
          cdir=dir.charAt(index-1);
        }
        else{
          if(cdir=='N'){
            if(y==my){
              if(!set.contains(x+" "+y)){
                off=true;
                set.add(x+" "+y);
                break;
              }
            }
            else{
              ++y;
            }
          }
          
          else if(cdir=='S'){
            if(y==0){
              if(!set.contains(x+" "+y)){
                off=true;
                set.add(x+" "+y);
                break;
              }
            }
            else{
              --y;
            }
          }
          
          else if(cdir=='E'){
            if(x==mx){
              if(!set.contains(x+" "+y)){
                off=true;
                set.add(x+" "+y);
                break;
              }
            }
            else{
              ++x;
            }
          }
          
          else{
            if(x==0){
              if(!set.contains(x+" "+y)){
                off=true;
                set.add(x+" "+y);
                break;
              }
            }
            else{
              --x;
            }
          }           
        }
      }
      System.out.print(x+" "+y+" "+cdir);
      if(off){
        System.out.print(" LOST");
      }
      System.out.println();
    }
  }
}