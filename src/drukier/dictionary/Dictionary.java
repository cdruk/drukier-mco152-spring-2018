package drukier.dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {
	private ArrayList<Definition> dictionary = new ArrayList<Definition>();

	public Dictionary(String fileName) throws FileNotFoundException {
		File myDictionary = new File(fileName);
		FileReader fReader = new FileReader(myDictionary);
		Scanner dictionaryFile = new Scanner(fReader);
		createArray(dictionaryFile);
	}

	private void createArray(Scanner dictionaryFile) {

		while (dictionaryFile.hasNext()) {
			String line = dictionaryFile.nextLine();
			Boolean hasSpace = line.contains("\\s+");
			if (hasSpace) {
				String[] nextLine = dictionaryFile.nextLine().split(" ", 2);
				dictionary.add(new Definition(nextLine[0], nextLine[1]));
			} else {
				String nextLine = dictionaryFile.nextLine();
				dictionary.add(new Definition(nextLine, null));
			}
		}
	}

	public String define(String word) {
		String fullDefinition = null;
		if (contains(word)) {
			fullDefinition = (word + " " + getDefinition(word));
		}
		return fullDefinition;
	}
	
	private boolean contains(String word) {
		String checkWord = word.toUpperCase();
		for (int i = 0; i <= dictionary.size(); i++) {
			if (dictionary.get(i).getWord().equals(checkWord)) {
				return true;
			}

		}
		return false;
	}

	private String getDefinition(String word) {
		String checkWord = word.toUpperCase();
		String definition = null;
		for (int i = 0; i <= dictionary.size(); i++) {
			if (dictionary.get(i).getWord().equals(checkWord)) {
				definition = dictionary.get(i).getDefinition();
				break;
			}
		}
		return definition;
	}

	
}