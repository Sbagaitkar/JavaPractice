
public class JavaPractice1_String {

	public static void main(String[] args) {
	
		//String is immutable
		//String S1 = "Sayali";
		//String s1 = S1.concat("Peshave");
		//System.out.println(s1);
		
		//Difference between Equal to and Compare to
		/*String S1 = "abc";
		String S2 = new String ("abc");
		System.out.println(S1==S2); // Return false compare memory location, Compare objects
		System.out.println(S1.equals(S2)); // Returns True compare content of the string irrespective of its memory location
		System.out.println(S1.compareTo(S2)); */ //Comparing strings lexicographically. If they are equal it will return 0, will return positive integer if left hand side is greater than right hand side. 
		                                         //Return negative number if right hand side is greater
		
		//How to reverse the String
		//There are 4 ways to reverse the String
		
		//Method 1 - By using CharAt method of String Class
		/*String S1 = "hello";
		System.out.println(S1.charAt(0)); // method returns character at index 0
		System.out.println(S1.length());
		
		for (int i=S1.length()-1; i>=0; i--) {
			
			System.out.print(S1.charAt(i));
		} */
	 
		System.out.println(" ");
		
		//Method 2 - Ny using toCharArray method of String Class
		/*String S1 = "hello";
		char[]chArray= S1.toCharArray();
		System.out.println(chArray);
		System.out.println(chArray.length);
		
		for (int i=(chArray.length)-1 ; i>=0;i-- ) {
			System.out.println(chArray[i]);
		}*/
		
		System.out.println(" ");
		
		//Method 3 - By using reverse menthod of StringBuffer class
		/*String S1 = "hello";
		StringBuffer strbuff = new StringBuffer (S1);
		System.out.println(strbuff.reverse());*/
		
		System.out.println(" ");
		
		//Method 4 - By using reverse menthod of StringBuilder class
			/*	String S1 = "hello";
				StringBuilder strbuff = new StringBuilder (S1);
				System.out.println(strbuff.reverse()); */
				
				
		//how to remove junk characters or special characters from String . We need to use regular expression for that
				String s1 = "Test*($$Java";
				s1=s1.replaceAll("[^A-Za-z0-9]", "");
				//s1=s1.replaceAll("[A-Z]", "");
				System.out.println(s1);
				
				
						
				
	}

}
