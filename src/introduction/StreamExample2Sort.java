package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public abstract class StreamExample2Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names= {"nagarjuna","Bharath","Deepak","Deeraj"};
		
	List<String> names1=	Arrays.asList(names);
	
	//below line will make the stream which was filtered to sort using sorted function and then convert to lowercase using map function and display using for each
	
	names1.stream().filter(s->s.startsWith("D")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
	
	ArrayList<String> names3=new ArrayList<String>();
	names3.add("Arun");
	names3.add("Virat");
	names3.add("Anirudh");
	names3.add("Qurer");
	names3.add("bombst");
//below line will concat the two stream and following line will print the concat stream	
Stream<String> newStream=Stream.concat(names1.stream(), names3.stream());
//newStream.sorted().forEach(s->System.out.println(s));

Boolean t=newStream.anyMatch(s->s.startsWith("A"));
System.out.println(t);
	}

}
