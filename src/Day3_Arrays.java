
public class Day3_Arrays {

	public static void main(String[] args) {
		
		String[] projects = {"HCSC", "CareFirst"};
		int[] teamSize = {8, 6};
		int[] testCases = {200, 150};
		
		for (int i=0;i<projects.length;i++)
		{
			System.out.println("projects "+ (i+1) + ": " +projects[i] + " | Team: " + teamSize[i] 
	                 + " | Test Cases: " + testCases[i]);
		}

	}

}
