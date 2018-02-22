package drukier.hashdictionary;

import java.io.FileNotFoundException;

public class MyDictionary {
	public static void main(String[] args) throws FileNotFoundException {
		//
		String myDictionary = "/Users/chana/Documents/Touro/Spring 2018/Computer Methodology/VendingMachine/dictionary.txt";
		//
		HashDictionary mine = new HashDictionary(myDictionary);
		System.out.println(mine.define("apple"));
		System.out.println(mine.define("ANTIWHITE"));
		System.out.println(mine.define("aardvark"));

	}
}
