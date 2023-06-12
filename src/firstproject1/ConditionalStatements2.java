package firstproject1;

public class ConditionalStatements2 {

	public static void main(String[] args) {
		String examstatus = "pass";
		if ( examstatus == "pass")	{
			System.out.println(" wait for further rounds  ");
			String round1Status="pass";
			
			if (round1Status == "pass") {
				System.out.println("you have cleared  round 1 interview,please wait for round 2");
			}
			else {
				System.out.println("you can go to home  "  );
			}
		}
		else {
			System.out.println("you can go to home  "  );
		}
	}

}
