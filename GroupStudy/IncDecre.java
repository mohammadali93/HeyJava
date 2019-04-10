
public class IncDecre {
public static void main(String[] args) {
	int a,b,c;
	a=10;
	b=20;
	c=5;
	int sum,mult,div;
	sum=++a;
	mult=--c;
	div= sum*b;
	System.out.println(sum);
	System.out.println(mult);
	System.out.println(div);
	System.out.println(div+(mult*sum)+" the sum of three values");
	
}
}
