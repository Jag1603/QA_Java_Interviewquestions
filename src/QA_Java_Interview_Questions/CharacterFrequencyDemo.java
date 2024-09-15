package QA_Java_Interview_Questions;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyDemo {
	public static void main(String[] args) {
		
		String p="banana";
		
		//characterCount('n' , p);
		CharachterFrequency(p);
		
		
		
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void CharachterFrequency(String s)
	{
	Map<Character,Integer>	 h=new HashMap<>();
	
	for (int i = 0; i < s.length(); i++) 
	{
		
		if(h.containsKey(s.charAt(i)))
			
	{
			
		h.put(s.charAt(i), h.get(s.charAt(i))+1);
		
		
	}
		else {
			//System.out.println(h.get(s.charAt(i)));
			h.put(s.charAt(i),1);
			
		}
		
		
	}
	
	System.out.println(h);
	
	}
	
	
	
	static int characterCount(Character c ,String s) 
	{
		int count=0;
		char [] ca=s.toCharArray();
		for (char d : ca) 
		{
			if(d==c)
			{count++;
				
			}
			
		}
		System.out.println(c+" is Repeated for "+count+""); 
		
		return count;

	}
}
