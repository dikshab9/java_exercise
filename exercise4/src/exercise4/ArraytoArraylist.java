package exercise4;
import java.util.*;
public class ArraytoArraylist {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		String arr[]= {"one ","two ","three "};
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		for(String str:list) {
			System.out.print(str);
		}
	}
}
