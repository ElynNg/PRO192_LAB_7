package LAB_7;

import java.util.ArrayList;
import java.util.Scanner;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			String s = input.nextLine();
			a.add(s);
		}
		
		removeDuplicates(a);
		
		System.out.println(a);
	}
	
	
	//cẩn thận khoảng trắng lúc test
	public static void removeDuplicates(ArrayList<String> a) {
		for (int i = 0; i < a.size()-1; i++) {
			if (a.get(i).equals(a.get(i+1))) {
				a.remove(i+1);
				i--;
			}
		}
	}

}
