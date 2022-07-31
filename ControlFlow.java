import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	//	Scanner class = new Scanner(System.in);

		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();
	
		
	System.out.println("Please enter your name.");
	String name = input.nextLine();
	System.out.println("Hello " + name);
	
	System.out.println("Do you wish to continue?");
	String answer = input.nextLine();
	if(answer == "yes") {
			
			System.out.print("Please return later to complete the survey.");
			System.exit(0);
	}
	

		System.out.println("Do you have a red car? (yes, no):"); 
		String carColor = input.nextLine();
	
		System.out.println("What is the name of your favorite pet?");
		String petName = input.nextLine();

		System.out.println("How old is your favorite pet.");
		String petAge = input.nextLine();

		System.out.println("What is your lucky number?");	
		String lucky = input.nextLine();

		System.out.println("Do you have a favorite quarterback?  If so what is their jersey number?");	  
		String qbNumber = input.nextLine();

		System.out.println("What is two-digit model year of you car?");	
		String carModelNumber = input.nextLine();

		System.out.println("What is the first name of your favorite actor or actress?");	  
		String favActor = input.nextLine();

		System.out.println("Enter a random number between 1 and 50.");
		String randomNumber = input.nextLine(); 
		
		int magic = 75;
		
		
		
	
	} 
	

}