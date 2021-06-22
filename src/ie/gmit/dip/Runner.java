package ie.gmit.dip;

public class Runner extends ConsoleInputOutput {

	public Runner() {
		super();
	}

	/**
	 * @author SandraRawat
	 * @version 1.0
	 * @since 1.8 Runner, main method of package, initialises @menu
	 *        and @scannerMethod.
	 * @throws Exception
	 * @see Menu
	 * @see ConsoleInputOutput
	 */
	public static void main(String[] args) throws Exception {

		Menu.menu();
		scannerMethod();
		
	}
}
