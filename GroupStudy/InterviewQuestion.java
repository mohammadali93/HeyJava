
public class InterviewQuestion {
public static void main(String[]args) {
	//Write a java program to reverse String? Reverse a string word by word?
	String sentence="Today we are given some imp interview questions";
String reverse="";
	
	for(int i=sentence.length()-1; i>=0 ; i--) {
		reverse= reverse+sentence.charAt(i);
		
		
}
	System.out.println(reverse);
	String reverse1="";
	String[] array1=sentence.split(" ");
	
	
	for(int i=array1.length-1; i>0; i--) {
		reverse1=reverse1+array1[i];
		
	}
	System.out.println(reverse);
	
	/////How to find out the part of the string from a string? What is substring? Find number of words in string?
	
	String a="Hello Jeisson";
	String b="Java";
	boolean found;
	found= (a.contains(b));
	System.out.println(found);
	
	String[] array=a.split(" ");
	System.out.println(array.length);
	
	
}
}