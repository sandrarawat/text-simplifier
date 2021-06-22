package ie.gmit.dip;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Interface containing methods inherited by base class @see Thesaurus
 */

public interface WordInterface {
	static Map<String, String> map = new TreeMap<>();
	static Set<String> googleWords = new TreeSet<>();

	static void init() {
	}

	static void addAll() {

	}

	static void getGoogleEquivalent() {

	}

}