package ie.gmit.dip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Thesaurus implements WordInterface {

	private static Map<String, String> map = new TreeMap<>();
	private static Set<String> googleWords = new TreeSet<>();
	private static final String googleWordFile = "google-1000.txt";
	private static final String mobyThesaurus2File = "MobyThesaurus2.txt";

	public Thesaurus() {
	}

	/**
	 * Method reads input from @googleWordFile, mapping to Treeset
	 * object @googleWords
	 * 
	 * @param String Line
	 * @param br
	 * @return added to map
	 * 
	 *         Reads input @param br BufferedReader from @mobyThesaurus2File object,
	 *         mapping to Treemap object @map.
	 */
	protected static void init() throws FileNotFoundException, IOException {
		String line = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(googleWordFile))));

		while ((line = br.readLine()) != null) {

			map.put(line, line);

			googleWords.add(line);
		}

		br.close();

		br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(mobyThesaurus2File))));

		while ((line = br.readLine()) != null) {

			String[] entryWords = line.split(",");

			if (googleWords.contains(entryWords[0])) {

				addAll(entryWords, entryWords[0]);
			}

		}

	}

	/**
	 * Encapsulated Method adds all words @map, looping through @map and mapping
	 * keyword to matching word synonym
	 * 
	 * @param words
	 * @param googleWordInFile
	 * @param keyWord
	 * 
	 */

	private final static void addAll(String[] words, String googleWordInFile) {
		for (String keyWord : words) {
			map.put(keyWord.toLowerCase(), googleWordInFile);
		}
	}

	/**
	 * Method searches @map for @word, returns synonym if @containsKey, or returns
	 * original word
	 * 
	 * @param word
	 * @return word
	 */
	protected static String getGoogleEquivalent(String word) {
		if (map.containsKey(word)) {
			return map.get(word);
		} else {
			return word;
		}
	}

}