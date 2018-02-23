package drukier.hashdictionary;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class DictionaryTest {

	@Test
	public void testDefine() throws FileNotFoundException{
		// given
		HashDictionary D = new HashDictionary("/Users/chana/Documents/Touro/Spring 2018/Computer Methodology/drukier-mco152-spring-2018/dictionary.txt");
		
		// when
			String word = "apple";
			String definition =  "apple:  an edible fruit [n -S]";

		// then
		assertEquals(definition, D.define(word));
	}

}
