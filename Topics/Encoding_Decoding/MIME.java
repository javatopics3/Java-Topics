package Encoding_Decoding;

import java.util.Base64;

public class MIME {
	public static void main(String[] args) {
		// Getting MIME encoder
		Base64.Encoder encoder = Base64.getMimeEncoder();
		String message = "Hello World";
		String eStr = encoder.encodeToString(message.getBytes());
		System.out.println("Encoded MIME message: " + eStr);

		// Getting MIME decoder
		Base64.Decoder decoder = Base64.getMimeDecoder();
		String dStr = new String(decoder.decode(eStr));
		System.out.println("Decoded MIME message: " + dStr);
	}

}
