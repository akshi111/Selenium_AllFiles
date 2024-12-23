package Intro;

public class MethodsDemo {
	
	public static void main(String[] args) {
		
		MethodsDemo s = new MethodsDemo();
		String name = s.getData();
		System.out.println(name);
		
		MethodsDemo2 s1 = new MethodsDemo2();
		s1.getUserData();
		getData2();
		
	}
	
	public String getData() {
		System.out.println("Hello World");
		return "Rahul Shetty";
	}
	
	public static String getData2() {
		System.out.println("Welcome");
		return"Rahul Shetty";
	}
	

}
