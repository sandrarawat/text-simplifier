

A command line menu-driven user interface is launched in the Runner class. Text is entered in the console and replacement text is returned via Console Output. Replaced words will be coloured Red.

Below is a list of classes and their methods.

Class : Runner
METHODS:
Main method. Initislises menu. 
inherits scannerMethod from ConsoleInputOutput.java



class: ConsoleColourInput
METHODS:
snannerMethod :Initialises Thesaurus.init(); Creates scanner object. Takes user input loops using overloaded operator == to find matches to getGoogleEquivalent(); Outputs result.



Class: Menu
METHODS:protected final static void menu(),menu layout, initilised in Runner.java



Class:	Thesaurus
METHODS:
Init() Method reads input from googleWordFile object. Reads input from mobyThesaurus2Fileobject. Adds words to Treeset and Treemap Respectively.

addall() the private method addAll is encapsulated. Inherited from WordInterface. Method adds words to Map that correspond to Google 1000 words.

getGoogleEquivalent() Inherited from WordInterface. Method gets Google Equivalent of user input words. Instantiated in ConsoleInputOutput.java

Class: Console Colour(enumeration)
METHODS:
colour() colour object
String() return colour
toString() @Overrides Console Colour toString to enable Strings to change colour
valueOf(java.lang.String name)Returns the enum constant of this type with the specified name.
values() Returns an array containing the constants of this enum type, in the order they are declared.

Interface:WordInterface
METHODS:
addAll() 
getGoogleEquivalent() 
init() 

Interface: EnumInterface

METHODS:
public enum ConsoleColour
public void String();



