package LAB_7;

import java.util.ArrayList;

public class minToFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(8);
		a.add(92);
		a.add(4);
		a.add(2);
		a.add(17);
		a.add(9);
		minToFront(a);
		
		System.out.println(a);
	}
	
	public static void minToFront(ArrayList<Integer> a) {
		int minIndex = 0;
		
		for (int i = 0; i < a.size()-1; i++) {
			if (a.get(i) < a.get(minIndex)) {
				minIndex = i;
			}
		}
		
		int minValue = a.remove(minIndex);
		a.add(0, minValue);
		
	}

}
