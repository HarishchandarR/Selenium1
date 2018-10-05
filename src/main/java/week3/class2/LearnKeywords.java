package week3.class2;

public class LearnKeywords {

	int value=10;
	public LearnKeywords() {
	System.out.println("I am in Constructor");
	value = 11;
	}
	{
		System.out.println("i am in  block");
	}
	static {
	System.out.println("i am in static");
	}
	public static void main(String[] args) {
	LearnKeywords lw = new LearnKeywords();
	System.out.println("i am main");
	}

}
