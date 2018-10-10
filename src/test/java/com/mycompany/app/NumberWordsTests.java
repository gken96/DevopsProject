package com.mycompany.app;

import org.junit.*;

import com.mycompany.app.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberTest1() {
		Assert.assertEquals("One", numberWords.toWords(1));
	}
	@Test
	public void numberTest2() {
		Assert.assertEquals("Two", numberWords.toWords(2));
	}
	@Test
	public void numberTest3() {
		Assert.assertEquals("Five", numberWords.toWords(5));
	}
	@Test
	public void numberTest4() {
		Assert.assertEquals("Seven", numberWords.toWords(7));
	}
	@Test
	public void numberTest5() {
		Assert.assertEquals("Nine", numberWords.toWords(9));
	}
	@Test
	public void numberTest6() {
		Assert.assertEquals("Thirteen", numberWords.toWords(13));
	}
	@Test
	public void numberTest7() {
		Assert.assertEquals("Fifteen", numberWords.toWords(15));
	}
	@Test
	public void numberTest8() {
		Assert.assertEquals("Seventeen", numberWords.toWords(17));
	}
	@Test
	public void numberTest9() {
		Assert.assertEquals("Nineteen", numberWords.toWords(19));
	}
	@Test
	public void numberTest10() {
		Assert.assertEquals("Twenty Two", numberWords.toWords(22));
	}
	@Test
	public void numberTest11() {
		Assert.assertEquals("Twenty Five", numberWords.toWords(25));
	}
	@Test
	public void numberTest12() {
		Assert.assertEquals("Twenty Nine", numberWords.toWords(29));
	}
	
	@Test
	public void numberTest13() {
		Assert.assertEquals("Eleven", numberWords.toWords(11));
	}
	@Test
	public void numberTest14() {
		Assert.assertEquals("Thirty Three", numberWords.toWords(33));
	}
	@Test
	public void numberTest15() {
		Assert.assertEquals("Fifty Three", numberWords.toWords(53));
	}
	
	@Test
	public void numberTest16() {
		Assert.assertEquals("Seventy Nine", numberWords.toWords(79));
	}
	
	@Test
	public void numberTest17() {
		Assert.assertEquals("One Hundred One", numberWords.toWords(101));
	}

	@Test
	public void numberTest18() {
		Assert.assertEquals("Two Hundred Fifty Three", numberWords.toWords(253));
	}

	@Test
	public void numberTest19() {
		Assert.assertEquals("Three Hundred Seventy Nine", numberWords.toWords(379));
	}
	
	@Test
	public void numberTest20() {
		Assert.assertEquals("Five Hundred Eighty Six", numberWords.toWords(586));
	}

	@Test
	public void numberTest21() {
		Assert.assertEquals("Nine Hundred Ninety Nine", numberWords.toWords(999));
	}

	@Test
	public void numberOutofRange() {
		Assert.assertEquals("Number Out of Range", numberWords.toWords(1000));
	}
	
	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", numberWords.toWords( -1 )) ;
	}

}
