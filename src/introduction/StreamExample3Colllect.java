package introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3Colllect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("Arun");
		names.add("Virat");
		names.add("Anirudh");
		names.add("Qurer");
		names.add("bombst");
	List<String> l1=	names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	
	}

}
