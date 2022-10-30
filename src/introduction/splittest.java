package introduction;

/**
 * @author nagao
 *
 */
public class splittest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String naga="Please use temporary password 'rahulshettyacademy' to Login.";
		String[] newarra=naga.split("'");
		for(String s:newarra)
		{
			System.out.println(s);
		}

	}

}
