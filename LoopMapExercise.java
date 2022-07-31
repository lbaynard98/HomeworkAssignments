import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LoopMapExercise {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Can you give me an number?");
		String number1 = input.nextLine();
		
		System.out.println("Can you give me another number?");
		String number2 = input.nextLine();
		
		System.out.println("And another number?");
		String number3 = input.nextLine();
		
		System.out.println("Aaaaand another number?");
		String number4 = input.nextLine();
		
		System.out.println("Ok. Just one more number?");
		String number5 = input.nextLine();
		
		String[] numberArray= {};
		List<String>numbers = new ArrayList<>(Arrays.asList(numberArray));
		
		System.out.println(numbers);
		

	}

}
