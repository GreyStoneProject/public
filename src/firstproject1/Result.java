package firstproject1;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the result ");
		int Marks=sc.nextInt();
		if( Marks < 35 )
		{
			System.out.println( " fail  ");
		}
		else if (Marks == 35)
		{
			System.out.println("pass");
		}
		else if ( Marks >= 35 && Marks <=70 )
		{
			System.out.println(" Third class");
		}
		else if (Marks >= 70 && Marks >= 35)
		{
			System.out.println(" Second class");
		}
		else if (Marks > 85)
		{
			System.out.println(" First class ");
		}
			else
			{
				System.out.println("student is not promoted ");
			}
		}
	}

