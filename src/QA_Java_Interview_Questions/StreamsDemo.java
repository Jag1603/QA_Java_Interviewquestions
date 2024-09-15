package QA_Java_Interview_Questions;
import java.util.Arrays;
import java.util.OptionalInt;

public class StreamsDemo {

	

	
	    public static void main(String[] args) {
	    	  int[] x = {12, 23, 34, 45};

	          
	          int[] modifiedArray = Arrays.stream(x)
	              .map(num -> num > 20 ? num * 2 : num) 
	              .toArray(); 

	          
	          System.out.println("Modified array: " + Arrays.toString(modifiedArray));
	        
	       
	    }
}



