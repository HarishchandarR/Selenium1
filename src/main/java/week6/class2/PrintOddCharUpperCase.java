package week6.class2;

import org.testng.annotations.Test;

public class PrintOddCharUpperCase {
	//Print Odd character in Upper Case.
		String  input = "TestLeaf";		
		String  output = "";
		//@Test
		public void oddCharUpperCase() {
			char[] len = input.toCharArray();
			for (int i = 0; i < len.length; i++) {		
				if(i%2!=0) {
					output += Character.toUpperCase(input.toCharArray()[i]);		
				} else {
					output += Character.toLowerCase(input.toCharArray()[i]);	
				}		
			}	
			System.out.println(output);
		}
		
		@Test
		public void printNextChar() {
			
			char eachChar = input.charAt(0);
			int num = (int)eachChar+1;
			System.out.println((char)num);
			
			
			//System.out.println((int)input.charAt(0)+1);
			
		}
		
		
}
