package Week3.day2;

import java.util.HashSet;

public class FindIntersection {
	
	public static void main(String[] args) {
		
			HashSet<Integer> set1 = new HashSet<Integer>();
			HashSet<Integer> set2 = new HashSet<Integer>();
			set1.add(3);
			set1.add(2);
			set1.add(11);
			set1.add(4);
			set1.add(6);
			set1.add(7);
			System.out.println("set1 value" + set1);
			set2.add(1);
			set2.add(2);
			set2.add(8);
			set2.add(4);
			set2.add(9);
			set2.add(7);
			System.out.println("set2 value" +  set2);
			set1.retainAll(set2);
			System.out.println("Intersection" +  set1);
			
	}

}
