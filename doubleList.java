package LAB_7;

import java.util.Scanner;
import java.util.ArrayList;

public class doubleList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < 3; i++) {
			String s = input.nextLine();
			a.add(s);
		}
		
		doubleList(a);
		
		System.out.println(a);
 	}

	public static void doubleList(ArrayList<String> a) {
		int oldString = a.size();
		
		for (int i = 0; i < oldString; i++) {
			a.add(2*i+1, a.get(2*i));
		}
	}
	
}
