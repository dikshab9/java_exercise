package assignments;
import java.io.*;
import java.util.*;

public class File_read_convertcapital {

	

	
	   public static void main(String[] args) {
	       try {
	           BufferedReader br = new BufferedReader (new InputStreamReader (new FileInputStream ("/home/diksha/Documents/workspace-sts-3.9.0.RELEASE/assignments/src/lala.txt")));
	           String line = null;
	           while ((line = br.readLine ()) != null) {
	               System.out.println (line);
	               String upper = line.toUpperCase ();
	               System.out.println (upper);
	               long len = line.length();
	               System.out.println (len);
	           }


	           br.close ();
	       } catch (IOException e) {
	           e.printStackTrace ();
	       }
	   }
	}

