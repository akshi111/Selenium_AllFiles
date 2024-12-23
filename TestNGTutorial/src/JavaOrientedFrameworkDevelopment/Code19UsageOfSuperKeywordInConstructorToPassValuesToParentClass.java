package JavaOrientedFrameworkDevelopment;

public class Code19UsageOfSuperKeywordInConstructorToPassValuesToParentClass {
	int a;
	
	public Code19UsageOfSuperKeywordInConstructorToPassValuesToParentClass(int a) {
		this.a = a;
	}

	public int multiplyTwo() {
		a = a*2;
		return a;
	}
	
	public int multiplyThree() {
		a = a*3;
		return a;
	}

}
