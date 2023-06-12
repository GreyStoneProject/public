package firstproject1;
import java.util.Scanner;
public class WeekOfTheDay {

	public static void main(String[] args){


		Scanner sc=new Scanner(System.in);
		System.out.println("enter the week name ");
		String Name = sc.next() ;

		if (Name.equals("saturday") || Name.equals("sunday")) {
			System.out.println( "uff,its a weekend ");
		}
		else {
			System.out.println("its a weekday ");
		}

	}
}



