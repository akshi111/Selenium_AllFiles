package JavaOrientedFrameworkDevelopment;

public class Code18PassValuesThroughParameterizedAndThisKeyword extends Code19UsageOfSuperKeywordInConstructorToPassValuesToParentClass{
	
	int a;
	
	public Code18PassValuesThroughParameterizedAndThisKeyword(int a) {
		super(a);
		this.a = a;
	}

	public int increment() {
		a = a+1;
		return a;
	}
	
	public int decrement() {
		a = a-1;
		return a;
	}

}
