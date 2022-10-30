package introduction;

import java.util.ArrayList;

public class StreamPrintUsingForEach {
public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Arun");
		names.add("Virat");
		names.add("Anirudh");
		names.add("Qurer");
		names.add("bombst");
	//the belw line is to filter the stream based on the condition and display each one from new stream	
	names.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
	
	//The below line is to  filter the stream based on the condition and limiting it to one and display if even though it have multiple strings in the string	
	names.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));

	}

}
