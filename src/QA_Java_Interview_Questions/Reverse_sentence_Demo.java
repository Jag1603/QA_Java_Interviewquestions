package QA_Java_Interview_Questions;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse_sentence_Demo {
	
	public static void main(String[] args) {
		
		String sentence = "This is a sentence";

	    String reversed = Arrays.stream(sentence.split(" "))
	            .reduce((a, b) -> b + " " + a)
	            .orElse("");

	    System.out.println(reversed); 
		
	}
	
	
	

	   
}
