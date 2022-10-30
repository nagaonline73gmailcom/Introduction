package introduction;

import java.util.stream.Stream;

public class StreamMapExample {
	public static void main(String[] args) {
	
		
		Stream.of("Nagarjuna","Bharath","Deepak","Deeraj","Suraj").filter(s->s.startsWith("D")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
