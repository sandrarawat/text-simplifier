

# Text-Simplifier-Java
This is a text simplifier application that is maintainable and encapsulated . A command line menu-driven user interface is launched in the Runner class. Text is entered in the console and replacement text is returned via Console Output. Replaced words will be coloured Red.

Below is a list of classes and their methods.

## Class: [Runner](https://github.com/sandrarawat/text-simplifier/blob/358d264048bfce2fffbda722916789535cb00a9e/src/ie/gmit/dip/Runner.java#L3)
METHODS:
[Main method](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/Runner.java#L18) initialises [menu](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/Runner.java#L20)and [scannerMethod](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/Runner.java#L21)

## Class: [ConsoleColourInputOutput](https://github.com/sandrarawat/text-simplifier/blob/358d264048bfce2fffbda722916789535cb00a9e/src/ie/gmit/dip/ConsoleInputOutput.java#L7)
METHODS:
[scannerMethod](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/ConsoleInputOutput.java#L23) initialises Thesaurus.init(); [Creates scanner object](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/ConsoleInputOutput.java#L26). Takes user [input](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/ConsoleInputOutput.java#L31) loops over using overloaded operator == to find matches to [getGoogleEquivalent()](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/ConsoleInputOutput.java#L33); if true outputs result.


## Class: [Menu](https://github.com/sandrarawat/text-simplifier/blob/358d264048bfce2fffbda722916789535cb00a9e/src/ie/gmit/dip/Menu.java#L7)
METHODS:
protected final static void [menu()](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/Menu.java#L7),menu layout, initialised in Runner.java

## Class:	[Thesaurus](https://github.com/sandrarawat/text-simplifier/blob/main/src/ie/gmit/dip/Thesaurus.java)
METHODS:
[Init() Method](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/Thesaurus.java#L35) [reads input](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/Thesaurus.java#L38) from [googleWordFile](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/Thesaurus.java#L38) object. [Reads input](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/Thesaurus.java#L49) from mobyThesaurus2Fileobject. Adds words to Treeset and Treemap respectively.

addall() is a private encapsulated method that inherits from WordInterface. [addAll()](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/Thesaurus.java#L74) adds words to Map that correspond to Google 1000 words.

[getGoogleEquivalent()](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/Thesaurus.java#L87) inherits from [WordInterface](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/WordInterface.java#L12). Gets Google Equivalent of user input words. Instantiated in [ConsoleInputOutput.java](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/ConsoleInputOutput.java#L7)

## Enum: [Console Colour](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/ConsoleColour.java#L7)
METHODS:
[colour()](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/ConsoleColour.java#L94) colour object
String() return colour

[toString()](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/ConsoleColour.java#L102) @Overrides Console Colour toString to enable Strings to change colour

valueOf(java.lang.String name)Returns the enum constant of this type with the specified name.

values() Returns an array containing the constants of this enum type, in the order they are declared.

## Interface:[WordInterface](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/WordInterface.java#L12)
Interface containing methods inherited by base class [Thesaurus](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/Thesaurus.java#L14)
METHODS:
addAll() 
getGoogleEquivalent() 
init() 

## Interface: [EnumInterface](https://github.com/sandrarawat/text-simplifier/blob/0c330d41263c5cadbfaa54dac013c303dc6fdac2/src/ie/gmit/dip/EnumInterface.java#L3)
Interface used to denote colour
METHODS:
public enum ConsoleColour
public void String();
