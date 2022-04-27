package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import labs.Lab01;

class Lab01_Tests {

	public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}

	@Test
	@DisplayName("Test Problem #1")
	void test1() {
		String problemNumber = "#1 getString()";
		String[][] tests = {{"Enter a word: ", "hello there"},
							{"Blargh", "12345"},
							{"Is this what's printed?", "Are we doing this again?!?!!"}
							};
		int numTests = tests.length;
		int i = 0;
		String answer = "";
		
		try {
			for (; i < tests.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][1]);
				answer = Lab01.getString(tests[i][0]);
				assertTrue(inOut.getOutputStream().contains(tests[i][0]));
				assertTrue(answer.equals(tests[i][1]));
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + numTests + " tests\n\n\n\n");
			
		}
		catch (AssertionError e){
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + numTests
					+ "\n   Possibly didn't return the parameter: " + tests[i][0]
					+ "\n   Expected return should be: " + tests[i][1] 
					+ "\n   Your return: " + answer
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			fail();
		}
	}
	
	
	
	
	@Test
	@DisplayName("Test Problem #2")
	void test2() {
		String problemNumber = "#2 diagonal()";
		String[][] tests = {{"Hello!", "H\n e\n  l\n   l\n    o\n     !\n"},
							{"Juenbuggy", "J\n u\n  e\n   n\n    b\n     u\n      g\n       g\n        y\n"},
							{"For Reals?!?", "F\n o\n  r\n    \n    R\n     e\n      a\n       l\n        s\n         ?\n          !\n           ?\n"}
							};
		int numTests = tests.length;
		int i = 0;
		String answer = "";
		
		try {
			for (; i < tests.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				Lab01.diagonal(tests[i][0]);
				assertTrue(inOut.getOutputStream().equals(tests[i][1]));
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + numTests + " tests\n\n\n\n");
			
		}
		catch (AssertionError e){
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + numTests
					+ "\n   Input: " + tests[i][0]
					+ "\n   Expected output should be: \n" + tests[i][1] 
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			fail();
		}
	}
	
	
	
	
	
	
	@Test
	@DisplayName("Test Problem #3")
	void test3() {
		String problemNumber = "#3 diagonals()";
		String[][] tests = {{"Howdy Y'all!", "H\n o\n  w\n   d\n    y\nY\n '\n  a\n   l\n    l\n     !\n"},
							{"School's almost out. :)", "S\n c\n  h\n   o\n    o\n     l\n      '\n       s\na\n l\n  m\n   o\n    s\n     t\no\n u\n  t\n   .\n:\n )\n"},
							{"For Reals?!?", "F\n o\n  r\nR\n e\n  a\n   l\n    s\n     ?\n      !\n       ?\n"}
							};
		int numTests = tests.length;
		int i = 0;
		String answer = "";
		
		try {
			for (; i < tests.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][0]);
				Lab01.diagonals();
				assertTrue(inOut.getOutputStream().contains(tests[i][1]));
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + numTests + " tests\n\n\n\n");
			
		}
		catch (AssertionError e){
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + numTests
					+ "\n   Input: " + tests[i][0]
					+ "\n   Expected output should be: \n" + tests[i][1] 
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			fail();
		}
	}
	
	
	@Test
	@DisplayName("Test Problem #4")
	void test4() {
		String problemNumber = "#4 letterToBinary()";
		
		String letters = " abcz'(!";
		char[] tests = letters.toCharArray();
		String[] expectedResults = {"00100000", "01100001", "01100010", "01100011", "01111010", "00100111", "00101000", "00100001"};
		
		int numTests = tests.length;
		int i = 0;
		String answer = "";
		
		try {
			for (; i < tests.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				answer = Lab01.letterToBinary(tests[i]);
				assertTrue(answer.equals(expectedResults[i]));
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + numTests + " tests\n\n\n\n");
			
		}
		catch (AssertionError e){
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + numTests
					+ "\n   Input: " + tests[i]
					+ "\n   Expected return should be: " + expectedResults[i] 
					+ "\n   Your return: " + answer
					+ "\n\n\n\n");
			fail();
		}
	}
	
	
	
	@Test
	@DisplayName("Test Problem #5")
	void test5() {
		String problemNumber = "#5 sentenceToBinary()";
		
		String[] tests = {"Howdy Y'all!",
						  "Yes, it's a crazy class!",
						  "Supercalafragelisticexpyalidocious",
						  "It's a Me! Mario!"
							};
		String[] expectedResults = {"010010000110111101110111011001000111100100100000010110010010011101100001011011000110110000100001",
									"010110010110010101110011001011000010000001101001011101000010011101110011001000000110000100100000011000110111001001100001011110100111100100100000011000110110110001100001011100110111001100100001",
									"01010011011101010111000001100101011100100110001101100001011011000110000101100110011100100110000101100111011001010110110001101001011100110111010001101001011000110110010101111000011100000111100101100001011011000110100101100100011011110110001101101001011011110111010101110011",
									"0100100101110100001001110111001100100000011000010010000001001101011001010010000100100000010011010110000101110010011010010110111100100001"
									};
		
		int numTests = tests.length;
		int i = 0;
		String answer = "";
		
		try {
			for (; i < tests.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i]);
				answer = Lab01.sentenceToBinary();
				assertTrue(answer.equals(expectedResults[i]));
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + numTests + " tests\n\n\n\n");
			
		}
		catch (AssertionError e){
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + numTests
					+ "\n   Input: " + tests[i]
					+ "\n   Expected return should be: " + expectedResults[i] 
					+ "\n   Your return:               " + answer
					+ "\n\n\n\n");
			fail();
		}
	}
	
}
