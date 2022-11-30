package LAB_7;

import java.util.Scanner;
import java.util.ArrayList;

public class swapPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < 6; i++) {
			String s = input.nextLine();
			a.add(s);
		}
		
		swapPairs(a);
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
	
	public static void swapPairs(ArrayList<String> a) {
		for (int i = 1; i < a.size(); i+=2) {
			String temp = a.get(i-1);
			a.set(i-1, a.get(i));
			a.set(i, temp);
		}
	}

}
