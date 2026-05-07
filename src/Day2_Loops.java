
public class Day2_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long salary = 600000;
		
		if(salary > 1000000)
		{
			System.out.println("You are in High Package!");
		}
		else if(salary >= 600000 & salary < 1000000 )
		{
			System.out.println("You are in Mid Package!");
		}
		else 
		{
			System.out.println("You are in Low Package!");
		}
	}

}
