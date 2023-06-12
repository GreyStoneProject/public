package firstproject1;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class Gmail {

	private static final String EmailId = null;
	public static void SignUp () {
		Scanner sc=new Scanner(System.in);

		System.out.println( "Enter your First Name ");
		String FirstName=sc.nextLine();

		System.out.println( "Enter  your Last Name");
		String LastName=sc.nextLine();

		System.out.println("Enter your Password ");
		String Password=sc.nextLine();

		System.out.println("your account is created Successfully");
	}
	public static void Loginpage () {

		Scanner sc=new Scanner (System.in);

		System.out.println("Enter EmailId");
		String EmailID =sc.nextLine();

		System.out.println("Enter Password");
		String Password =sc.nextLine();
		if( EmailId .equals (EmailId)&& Password.equals(Password))
		{

			System.out.println("Logged in successfully ");
		}
		else
			
		{ 
			System.out.println("Invalid Credentials ");
		}







	}

}
