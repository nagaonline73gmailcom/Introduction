package introduction;

import java.util.ArrayList;

public class StreamExample1 {
	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Arun");
		names.add("Virat");
		names.add("Anirudh");
		names.add("Qurer");
		names.add("bombst");
		
	long l=	names.stream().filter(s->s.startsWith("A")).count();
	System.out.println(l);

	}

}
