package JavaOrientedFrameworkDevelopment;

import org.testng.annotations.Test;

public class Code17TestNGAnnotationsHelpWithInheritance1 extends Code17TestNGAnnotationsHelpWithInheritance{
	
	@Test
	public void testRun() {
		Code18PassValuesThroughParameterizedAndThisKeyword Code18PassValuesThroughParameterizedAndThisKeyword = new Code18PassValuesThroughParameterizedAndThisKeyword(3);
//		int a =3;
		doThis();
		System.out.println(Code18PassValuesThroughParameterizedAndThisKeyword.increment());
		System.out.println(Code18PassValuesThroughParameterizedAndThisKeyword.decrement());
		System.out.println(Code18PassValuesThroughParameterizedAndThisKeyword.multiplyThree());
	}

}
