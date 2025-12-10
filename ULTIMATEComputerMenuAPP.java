package ULTIMATEComputerMenuAPP;
import java.util.Scanner;
import java.util.InputMismatchException;
public class ULTIMATEComputerMenuAPP {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		// trap any errors related to the input type
		while (true) {
			try {
				// get user input about what program they want to run
				System.out.println("\nEnter the number of the APP "
						+ "that you would like to run: \n(1=Display, "
						+ "2=Text Art, 3=Calculator, 4=Binary "
						+ "Calculator, \n5=Encouragement, 6=Dice, "
						+ "7=Oppish, 8=Fibonacci, 9=Double Factorial,\n"
						+ " enter 'quit' when done)");
				int APP=userinput.nextInt();
				// run the correct program
				if (APP==1) {
					DisplayAPP.main(new String[]{});
				}
				if (APP==2) {
					TextArtAPP.main(new String[]{});
				}
				if (APP==3) {
					CalculatorAPP.main(new String[]{});
				}
				if (APP==4) {
					BinaryCalculatorAPP.main(new String[]{});
				}
				if (APP==5) {
					EncouragementAPP.main(new String[]{});
				}
				if (APP==6) {
					DiceAPP.main(new String[]{});
				}
				if (APP==7) {
					OppishAPP.main(new String[]{});
				}
				if (APP==8) {
					FibonacciAPP.main(new String[]{});
				}
				if (APP==9) {
					DoubleFactorialAPP.main(new String[]{});
				}
			}
			// break the loop when the user wants to quit
			catch (InputMismatchException e) {
				break;
			}	
		}
	}
}
