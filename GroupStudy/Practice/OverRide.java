package Practice;

public class OverRide {
	public void address() {
		System.out.println("This is Fairfax");}
	public void city() {
		System.out.println("Buzz down");
	}

public static void main(String[] args) {
	
   
    OverRide c=new eBay();
  
   c.address();
c.city();
	
}
}


class eBay extends OverRide{
	public void address() {
		System.out.println("This is Chantilly");
	}
}
