package ie.gmit.dip;

final class Menu {
	/**
	 * protected final static constructor used to create Menu @see Runner
	 */
	protected final static void menu() {

		System.out.print(ConsoleColour.BLUE_BRIGHT);

		System.out.println("***************************************************");
		System.out.println("* GMIT - Dept -Computer Science & Applied Physics *");
		System.out.println("*                                                 *");
		System.out.println("*             Text Simplifier V0.1                *");
		System.out.println("*       (AKA Orwellian Language Compliance)       *");
		System.out.println("*                                                 *");
		System.out.println("***************************************************");

		System.out.print("Enter Text> ");

	}
}