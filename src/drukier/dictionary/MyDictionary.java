package drukier.dictionary;

import java.io.FileNotFoundException;

public class MyDictionary {
	public static void main(String[] args) throws FileNotFoundException {
		//
		String myDictionary = "/Users/chana/Documents/Touro/Spring 2018/Computer Methodology/VendingMachine/dictionary.txt";
		//
		Dictionary mine = new Dictionary(myDictionary);
		System.out.println(mine.define("apple"));
		System.out.println(mine.define("apdle"));
		System.out.println(mine.define("ardvark"));

	}
}
