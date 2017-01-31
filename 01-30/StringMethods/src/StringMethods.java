
public class StringMethods {

	
	public static boolean endsWithRep(String s1, String s2, int n) {
		
		String newstring = s2;

		for (int i = 2; i <= n;)
		{newstring = newstring + s2;
		i++;
		}
		
		 if (s1.endsWith(newstring) == true)
			 return true;
		 else return false;
			 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		endsWithRep("foobarbar", "bar", 2);
		endsWithRep("foobarbar", "baz", 1);
	}

}
