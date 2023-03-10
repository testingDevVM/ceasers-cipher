package ceasers.cipher;

public class CeasersCipher {
	
	private static final char LETTER_A = 'a';
	private static final char LETTER_Z = 'z';
	private static final int ALPHABET_SIZE = 26;
	
//String message <- is the original msg, int offset <- how much to offset
	public String cipher(String message, int offset) {
		
		offset %= ALPHABET_SIZE; //so the num don't go over 26
		char[] character = message.toCharArray(); //store msg into array
		
		offsetBy(character, offset);
		return new String(character);
	}

	private void offsetBy(char[] character, int offset) {
		for (int i = 0; i < character.length; i++) {
			if(character[i] != ' ') {
				character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z);
			}
		}
	}

	private char offsetChar(char c, int offset, char letterA, char letterZ) {
		c += offset;
		if (c < letterA) { //doing a left rotation only
			return (char)(c + ALPHABET_SIZE);
		}
		if (c > letterZ) { //doing a right rotation only
			return (char)(c - ALPHABET_SIZE);
		}
		return c;
	}
}
