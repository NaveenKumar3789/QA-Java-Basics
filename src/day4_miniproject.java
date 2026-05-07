
public class day4_miniproject {
	
	public static String checkGrade(int marks)
	{
		if (marks >= 75) {
	        return "A — Excellent!";
	    } else if (marks >= 60) {
	        return "B — Good!";
	    } else if (marks >= 50) {
	        return "C — Average!";
	    } else {
	        return "F — Fail!";
	    }
	}
	
	public static void main(String args[])
	{
	String [] names  = {"Naveen","Ravi","Priya"};
	int [] marks = {85, 45, 72};
	
	for(int i=0; i<names.length; i++)
	{
		 String grade = checkGrade(marks[i]);
	        
	        // Print the result
	        System.out.println("Student " + (i+1) + 
	                          ": " + names[i] + 
	                          " | Marks: " + marks[i] + 
	                          " | Grade: " + grade);
	}
	}
}
	


