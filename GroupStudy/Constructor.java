
public class Constructor {

	Constructor(String str, int x){
		System.out.println(str+x);
		
	}
	 Constructor(int y , String str1){
		System.out.println(y+str1);
	}
	 Constructor(boolean g, int y ,String i){
		 System.out.println(g+i+y);
	 }
	 
	public static void main(String[] args) {
		Constructor obj= new Constructor("Ali", 6);
		Constructor obj1= new Constructor("Nepal", 5);
		Constructor obj2= new Constructor(true , 8,"hkfg");
		
	}
}
