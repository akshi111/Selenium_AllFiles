package Intro;

public class BrushUp3 {
	
	public static void main(String[] args) {
		//string literal
		String s1 = "Rahul shetty academy";
		String s2 = "hello";
		
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		
		String s = "Rahul shetty academy";
		String[] splittedString = s.split(" ");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		
		System.out.println("***********");
		
		String[] old = s.split("shetty");
		System.out.println(old[0]);
		System.out.println(old[1]);
		System.out.println(old[1].trim());
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
		
		
		
	}

}
