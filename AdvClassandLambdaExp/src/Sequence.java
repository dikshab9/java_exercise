

import java.util.Scanner;


public class Sequence {
static int  size;
    
static class ReverseSequenceSelector implements Selector{

    @Override
    public void end(int a) {
//        System.out.println("---");
        System.exit(0);

        }
            
      @Override
    public void next(int b) {
        System.out.print(b);
        if(b-1==0) {
        	System.out.print(b-1);
            end(b);
            System.exit(0);
        }
        else if(b == 0) {
        	end(b);
        }
        else 
         current(b-1);
       }

    @Override
    public void current(int c) {
        System.out.print(c);
//        System.out.print("**");
        if(c==0) {
            end(c);
        }
        else{
        	next(c-1);
        }
        
        
        
    }
   }

 static void reverseSelector() {
    ReverseSequenceSelector rss=new ReverseSequenceSelector();
    rss.current(size-1);
    
}

    public static void main(String[] args) {
        
//        Sequence seq=new Sequence();
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the size: ");
        size=scan.nextInt();
       reverseSelector();
     
    }

}