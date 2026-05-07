
public class day3_Strings {
	
	public static void main(String args[])
	{
		String name = "  naveen kumar  ";
		
		System.out.println("Original name:" +name );
		System.out.println("Length:" +name.length() );
		
		System.out.println("Upper case:" +name.toUpperCase() );
		System.out.println("Contains Kumar:" +name.contains("kumar") );
		System.out.println("After trim:" +name.trim());
		
		System.out.println("Replace naveen with NAVEEN:" +name.replace("naveen","NAVEEN"));
	}
	

}
