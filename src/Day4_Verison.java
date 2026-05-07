
public class Day4_Verison {
	
	public static String experienc(int exp)
	{
		if(exp >= 5)
		{
		return "Senior QA";
		}
		else if(exp >= 3)
		{
	    return "Mid Level QA";
		}
		else if(exp < 3)
		{
	    return "Junior QA";
		}
		else
		{
		return null;
		}
		
	}

	public static void main(String[] args) {
		
		String [] names  = {"Naveen","Ravi","Priya"};
		int [] Experience  = {3, 1, 5};
		
		for(int i=0;i<names.length;i++)
		{
			String chkexper = experienc(Experience[i]);
			
			System.out.println("Engineer" + (i+1) + " - " + names[i] + ": |" + "EXP: " + Experience[i] + " |" + "Level: " + chkexper );
		}
		
		
	}

}
