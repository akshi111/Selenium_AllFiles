package Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrushUp2 {
	public static void main(String[] args) {
		//for loop
		int[] arr = {1,2,4,5,6,7,8,9,10,122};
		
		//values multiplied by 2
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]%2 == 0)
			{
				System.out.println(arr[i]);
				break;
			}
			else {
				System.out.println(arr[i] + " Is not multiple of 2");
			}
		}
		//ArraList
		List<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("welcome");
		a.add("selenium");
		a.add("test");
		//a.remove(0);
		System.out.println(a.get(2));
		
		for(int i=0 ; i<a.size();i++){
			System.out.println(a.get(i));
		}
		System.out.println("*******");
		//Enhanced for loop
		for(String val: a) {
			System.out.println(val);
		}
		
		//items present in arraylist
		System.out.println(a.contains("selenium"));
		
		//Convert array to arraylist
		String [] name = {"rahul","Shetty","Welcome"};
		List<String> nameArrayList = Arrays.asList(name); 
		nameArrayList.contains("Welcome");
	}
}
