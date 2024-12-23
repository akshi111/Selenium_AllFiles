package Intro;

public class BrushUp1 {
	
	public static void main (String[] args) {
		
		//Data Type
		int myNum = 15; //primitive data type
		String website = "Academy"; //non-primitive data type
		char letter = 'r';
		double dec = 4.65;
		boolean card = true;
		
		System.out.println(myNum + " is an integer");
		System.out.println(website);
		
		System.out.println("========");
		
		//Arrays-store multiple values in one variable
		int[] arr = new int[5]; // declare an array and it is a static array
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4; 
		arr[3] = 5;
		arr[4] = 6;
		
		int[] arr2 = {1,2,4,5,6}; // declare an array
		System.out.println(arr2[0]);
		System.out.println("========");
		
		//for loop  arr.length = 5
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("========");

		String[] name = {"rahul","shetty","selenium"};
		for(int i =0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		System.out.println("========");
		
		//Enhanced for loop
		for(String a : name) {
			System.out.println(a);
		}
		
   }
}
