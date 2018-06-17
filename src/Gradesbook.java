/**
 * @author Mehreen Malik
 * mehreenmalik08@gmail.com
 * 13 Jun 2018 16:41:50
 */

public class Gradesbook 
{
	public double getGrade(String grade)
	{
		double gpv = 0;
		
		switch (grade.toUpperCase())
		{
	        case "A":
	        	gpv = 4;
	            break;
	        case "B+":
	        	gpv = 3.5;
	            break;
	        case "B":
	        	gpv = 3;
	            break;
	        case "B-":
	        	gpv = 2.75;
	        	break;
	        case "C+":
	        	gpv = 2.50;
	        	break;
	        case "C":
	        	gpv = 2.00;
	        	break;
	        case "D":
	        	gpv = 1.50;
	        	break;
	        case "F":
	        	gpv = 0;
	        	break;
	        case "G":
	        	gpv = 0;
	        	break;
		}
		return gpv;
	}
}