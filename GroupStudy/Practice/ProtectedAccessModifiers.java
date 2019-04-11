package Practice;

public class ProtectedAccessModifiers {
	
public static void main(String[] args) {

ProtectedAccessModifiers obj= new ProtectedAccessModifiers();
	
		String reversed=obj.reverseString("Hello Mom");
		System.out.println(reversed);
System.out.println(obj.isPalindrome("TayabLaunda"));
	}
/*
 * 
 */
	protected String reverseString(String str) {
		String reversed="";
		for(int i=str.length()-1; i>=0; i--) {
			reversed=reversed+str.charAt(i);
		}
		return reversed;
}

// check if strig is  palindrome or not
	
	public boolean isPalindrome(String str) {
		String reversed="";
		boolean flag=false;
		for(int i=str.length()-1; i>=0; i--) {
			reversed=reversed+str.charAt(i);
		}
		if(reversed.equalsIgnoreCase(str)) {
			flag=true;
		}else {
			flag= false;
		}
		
	}
}



 

