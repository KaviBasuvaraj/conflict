package org.conflict;

public class Conflict {
	public static void main(String[] args) {
		
		String s = "Kavi";
		
		String s1 = "";
		
		for (int i =s.length()-1; i >=0; i--) {
			char c = s.charAt(i);
			s1 = s1+c;
			
		}
		
		System.out.println(s1);
	}

}
