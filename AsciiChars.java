
public class AsciiChars {
	
	  public static void printNumbers()
	  {
	    // TODO: print valid numeric input
	  }

	  public static void printLowerCase()
	  {
	    // TODO: print valid lowercase alphabetic input
	  }

	  public static void printUpperCase()
	  {
	    // TODO: print valid uppercase alphabetic input
	  }
	

	public static void main(String[] args) {
		for(int Numbers=48; Numbers<=57; Numbers++) {
			System.out.println(Numbers);
			
	}
		
		for(int UpperCase=65; UpperCase<=90; UpperCase++) {
			System.out.println(UpperCase);	
			
		}
		
		for(int LowerCase=97; LowerCase<=122; LowerCase++) {
			System.out.println(LowerCase);	
		

		}
	
		


		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();

	}
		

}
