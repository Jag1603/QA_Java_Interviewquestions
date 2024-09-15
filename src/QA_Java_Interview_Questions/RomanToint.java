package QA_Java_Interview_Questions;

public class RomanToint 
{

	public static void main(String[] args)
	{
		
		int r=romanToInt("MMX");
		
		System.out.println(r);
	}
	public static int romanToInt(String s)
	
	
    {
		
		int result=0;
		char[] c=s.toUpperCase().toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='X')
			{
				result=result+10;
			}
			else if (c[i]=='I') 
			{
				result=result+1;
			}
			else if (c[i]=='V') 
			{
				result=result+5;
			}
			else if (c[i]=='L') 
			{
				result=result+50;
			}
			else if (c[i]=='C') 
			{
				result=result+100;
			}
			else if (c[i]=='D') 
			{
				result=result+500;
			}
			else if (c[i]=='M') 
			{
				result=result+1000;
			}
			else
			{
				System.out.println("invalid");
				break;
			}
		}
		return result;
       
	
		
		
		
		
   }

}
