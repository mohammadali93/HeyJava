package Practice;

public class TaskMethod {

	public static void main(String [] args) {
	
		TaskMethod obj= new TaskMethod();
	String kk= obj.createEmail("Bob", "Launda", "@gmail.com");
		
			
	System.out.println(kk);
	}
    String createEmail(String name, String lastName , String email) {
    	
	String email1= name+lastName+email;
    	return email1;
    
    }	
    
	
}

