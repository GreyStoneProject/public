package firstproject1;

import java.util.Scanner;

public class BookMyShow {

	static String Passed = "Transaction Done Succesfully";
	static String failed = "Invalid data,Transaction not done Succesfully";
	static String Result;

	/**
	 * This Method is used to Create an Account in Book My show Application
	 */
	public static void CreateAccount()
	{	
		System.out.println("Clicked on Save Button");	
	}

	/**
	 * This Method is is used to Select the Movie in Book My show Application
	 */
	public static void MovieSelection(String Movie)
	{
		if (Movie.equalsIgnoreCase("DASARA")  || Movie.equals("RRR") || Movie.equals("KGF"))
		{
			System.out.println(Movie + " movie Selected");
		}
		else
		{
			System.out.println(Movie + " Movie Not available in the List");
		}
	}

	/**
	 * This Method is is used to Select the Theaters in Book My show Application
	 */
	public void MovieTheaters(String Theaters)
	{
		if (Theaters.equals("INOX")  || Theaters.equals("ROCKY") || Theaters.equals("ASIAN"))
		{
			System.out.println(Theaters + " Theater Selected");
		}
		else
		{
			System.out.println(Theaters + " Theater Not available in the List");
		}
	}

	/**
	 * This Method is used to select the Seats in Book My show Application
	 */
	public static void SeatSelection(int seatNo)
	{
		if (seatNo>0 || seatNo <= 83)
		{
			System.out.println(seatNo + " is Selected in Lower Class");
		}
		else if (seatNo> 84 || seatNo <= 169)
		{
			System.out.println(seatNo + " is Selected in First Class");
		}
		else if (seatNo> 170 || seatNo <= 250)
		{
			System.out.println(seatNo + " is Selected in Balcony");
		}
		else
		{
			System.out.println(seatNo+" Invalid Seat Number");
		}
	}

	/**
	 * This Method is used to do Payment in Book My show Application by using "UPI"
	 */
	public static void Payment(int UPI_PIN)
	{
		System.out.println("Clicked on pay button");
		System.out.println("Enter UPI PIN");
		if(UPI_PIN == 1996)
		{
			String Result = Passed;
			System.out.println(Result);
			System.out.println("Ticket Booked Succesfully");
		}
		else
		{
			String Result = failed;
			System.out.println(Result);
			System.out.println("Ticket Not Booked Succesfully");
		}
	}

	/**
	 * This Method is used to do Payment in Book My show Application by using "Debit Card"
	 */
	public static void Payment(String cardnumber,int cvv,int month,int year)
	{
		System.out.println("Clicked on Pay Button");
		if (cardnumber.equals("4578963214569789") && cvv == 369 && month == 12 && year == 2012 )
		{
			String Result = Passed;
			System.out.println(Result);
			System.out.println("Ticket Booked Sucessfuly");
		}
		else
		{
			String Result = failed;
			System.out.println(Result);
			System.out.println("Ticket Not Booked Succesfully");
		}
	}

//	/**
//	 * This Method is used confirming ticket booked in Book My show Application
//	 */
//	public static void Confirmation()
//	{
//		System.out.println(Result);
//		if (Result.equals("Transaction Done Succesfully"))
//		{
//			System.out.println("Ticket Booked Sucessfully");
//		}
//		else 
//		{
//			System.out.println("Ticket Not Booked Succesfully");
//		}
//	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Name");
		String Name = sc.nextLine();

		System.out.println("Enter the Phone Number");
		String Num = sc.next();
		System.out.println(Num.length());
		if (Num.length()==10)
		{
			System.out.println(Num);
		}
		else
		{
			System.out.println("Please Enter valid 10 digit Numbers");
		}
		System.out.println("Enter Username: ");
		String username = sc.next();
		System.out.println(username);

		System.out.println("Enter Password: ");
		String password = sc.next();
		System.out.println(password);
		BookMyShow.CreateAccount();
		System.out.println(Name+" Account created Succesfully");
		System.out.println(Num+ " Phone Number updated Succesfully");

		// Login to BookMyshow Application
		System.out.println("Logging into Application by using Credentials: ");
		System.out.println("Enter Login USERNAME: ");
		String USERNAME = sc.next();
		System.out.println("Enter Login PASSWORD: ");
		String PASSWORD = sc.next();
		if (username.contains(USERNAME) && password.contains(PASSWORD))
		{
			System.out.println("Logged Into Application Succesfully");
			BookMyShow.MovieSelection("Dasara");
			BookMyShow bs = new BookMyShow();
			bs.MovieTheaters("INOX");
			BookMyShow.SeatSelection(5);
			BookMyShow.Payment("4578963214569789", 36, 12, 2012);
		}
		else
		{
			System.out.println("Invalid Login Credentials");
		}
	}
}

	


