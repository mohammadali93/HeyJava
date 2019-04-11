package Practice;

public class StudentMethod {
public static void main(String[] args) {
	StudentMethod name= new StudentMethod();
 
 System.out.println(name.score(99));
}
char score(int grade) {
	char k;
	if(grade>90) {
		k= 'A';
	}else if(grade>80) {
		k='B';
	}else if(grade>70) {
		k='C';
	}else {
		k='F';
	}
	return k;
	}
}

