package Practice;

public class Methods {
	

public static void main(String[] args) {
	
	Methods obj= new Methods();
	obj.howAreYou("Ali");
	obj.month(2);
}
void howAreYou(String name) {
	System.out.println("how are you"+ name);
}
void month(int month) {
	System.out.println("you are "+month+"years old ");
}
}
