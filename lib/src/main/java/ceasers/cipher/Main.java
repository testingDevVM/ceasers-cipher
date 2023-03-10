package ceasers.cipher;

public class Main {

	public static void main(String[] args) {
		
		String message = "how are you doing today";
		int offset = 12;
		
		CeasersCipher ceasarsCipher = new CeasersCipher();
		String chipheredMessage = ceasarsCipher.cipher(message, offset);
		
		ceasarsCipher.cipher(message, offset);
		System.out.println("Original message: " + message);
		System.out.println("Original offset: " + offset);
		System.out.println("Chiphered message: " + chipheredMessage);
	}

}
