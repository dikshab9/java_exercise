package assignments;
import java.util.Scanner;

import org.apache.logging.log4j.*; 
;

public class Condition {
	
	private static Logger logger=LogManager.getLogger();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		logger.info("Enter a number: ");
		int number=sc.nextInt();
		if(number>=20 && number<=30) {
			if(number%2==0) {
				logger.info("Jerry");
			}
			else {
				logger.info("Tom");
			}
		}
		
	}

}
