package firstproject1;

public class operatorspractice {

	public static void main(String[] args) {

		int i =20;
		int j=10;
		
		//Arithmetic Operators 
		
		System.out.println(i+j);
	System.out.println(i-j);
	System.out.println(i*j);
	System.out.println(i/j);
	System.out.println(i%j);
	
	// Unary operators pre increment and post increment 
	
	System.out.println(i);     //20
	System.out.println(++i);   //21
	System.out.println(i++);   //21
	System.out.println(i);     //22
	
	System.out.println(i);     //20
	System.out.println(--i);   //19
	System.out.println(i--);   //19
	System.out.println(i);     //18
	
	//Relational operators 
	
	System.out.println(i==j);
	System.out.println(i!=j);
	System.out.println(i<j);
	System.out.println(i>j);
	System.out.println(i>=j);
	System.out.println(i<=j);
	
	//conditional operators 
	System.out.println(i<j && i!=j);
	System.out.println(i< j || i ==j);
	}
}
