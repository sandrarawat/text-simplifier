package ie.gmit.dip;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ConsoleInputOutput extends Thesaurus {

	public ConsoleInputOutput() {
		super();
	}

	/**
	 * ConsoleInputOutput initialises @init method @see Thesaurus. Creates new
	 * instance of scanner, uses @getGoogleEquivalent to check against @map. Loops
	 * over to check if output equals input == true
	 * 
	 * @returns output, else returns new match in colour red
	 * 
	 * @throws FileNotFoundException and IOException
	 */

	public static void scannerMethod() throws FileNotFoundException, IOException {
		init();

		Scanner scanner = new Scanner(System.in);

		String input = null;
		while (scanner.hasNext()) {

			input = scanner.next().toLowerCase();

			String output = getGoogleEquivalent(input);

			if (output.equals(input) == true)
				System.out.print(output + " ");
			else
				System.out.print(ConsoleColour.RED + output + " " + ConsoleColour.RESET);
		}
		scanner.close();
	}

}
