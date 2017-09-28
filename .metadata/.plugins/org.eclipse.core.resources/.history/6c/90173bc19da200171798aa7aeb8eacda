package exercise4;
import java.util.*;
import java.lang.*;
import java.io.*;

public class pe5 {

    public static void main(String args[] ) {

        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("val1", "java1");
        hm.put("val2", "java2");

        for(Map.Entry<String , String> entry1 : hm.entrySet()){
            System.out.println(entry1.getKey() + " : " + entry1.getValue());
        }

        String tmp;
        if(hm.get("val1") != null){
            tmp = hm.get("val1");
            hm.put("val1" , "");
            hm.put("val2", tmp);
        }

        for(Map.Entry<String , String> ent : hm.entrySet()){
            System.out.println(ent.getKey() + " : " + ent.getValue());
        }

    }
}


