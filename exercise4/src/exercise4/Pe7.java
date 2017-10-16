package exercise4;

import java.util.*;

public class Pe7 {

   public static void main(String[] args) {

       ArrayList<String> c1 = new ArrayList<String>();

       c1.add("Java");
       c1.add("C");
       c1.add("C++");
       c1.add("Python");
       c1.add("JavaScript");

       ArrayList<String> c2 = new ArrayList<String>();

       c2.add("Java");
       c2.add("Angular");
       c2.add("C++");
       c2.add("JavaScript");

       List<String> comparingList = new ArrayList<String>();
       
       for (int counter = 0; counter < c1.size(); counter++)
       {
           if (c2.contains(c1.get(counter)))
           {
               comparingList.set(counter, "Yes");
           }
       }

       for (int a = 0; a < c1.size(); a++)
       {
           comparingList.add("No");
       }

       

       System.out.println(comparingList);
   }

}
