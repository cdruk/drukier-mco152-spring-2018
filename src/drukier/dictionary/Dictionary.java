package drukier.dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Dictionary {
	private Map<String, String> dictionary = new HashMap<String, String>();

	public Dictionary(String fileName) throws FileNotFoundException {
		File myDictionary = new File(fileName);
		FileReader fReader = new FileReader(myDictionary);
		Scanner dictionaryFile = new Scanner(fReader);
		fillMap(dictionaryFile);
	}

	private void fillMap(Scanner dictionaryFile) {
		String word = null;

		while (dictionaryFile.hasNext()) {
			word = dictionaryFile.next();
			String definition = dictionaryFile.nextLine();
			dictionary.put(word.toLowerCase(), definition);

		}
	}


	public boolean contains(String word) {
		String checkWord = word.toLowerCase();
		return dictionary.containsKey(checkWord);
	}

	public String define(String word) {
		String fullDefinition = null;
		if (dictionary.containsKey(word.toLowerCase())) {
			fullDefinition = (word + ": " + dictionary.get(word.toLowerCase()));
		} else {
			fullDefinition = ("\"" + word + "\"" + " is not a valid entry");
		}
		return fullDefinition;
	}

}
