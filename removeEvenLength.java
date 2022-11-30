package LAB_7;

import java.util.Scanner;
import java.util.ArrayList;

public class removeEvenLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		for (int i = 0; i < 6; i++) {
			String s = input.nextLine();
			a.add(s);
		}
		
		removeEvenLength(a);
		
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
	
	public static void removeEvenLength(ArrayList<String> a) {
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).length() % 2 != 0) {
				a.remove(i);
				i--;
			}
		}
	}

}
