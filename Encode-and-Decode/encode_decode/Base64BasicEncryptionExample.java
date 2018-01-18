package encode_decode;

import java.util.Base64;

public class Base64BasicEncryptionExample {
	private static final String byteArr2 = null;
	private static final byte[] byteArr = null;
	private static final String x = null;
	private static final String byteArr3 = null;

	public static <bytebyteArr, bytebyteArr2, bytebyteArr3> void main(String[] args) {
		// Getting encoder  
        Base64.Encoder encoder = Base64.getEncoder();  
        // Creating byte array  
        bytebyteArr[] = {1,2};  
        // encoding byte array  
        byte[] = encoder.encode(byteArr);  
        System.out.println("Encoded byte array: "+byteArr2);  
        bytebyteArr3[][] newbyte;
		bytebyteArr3[] = newbyte[5];                // Make sure it has enough size to store copied bytes  
        System.out.println("Encoded byte array written to another array: "+byteArr3);  
        System.out.println("Number of bytes written: "+x);  
      
        // Encoding string  
        String str = encoder.encodeToString("JavaTpoint".getBytes());  
        System.out.println("Encoded string: "+str);  
        // Getting decoder  
        Base64.Decoder decoder = Base64.getDecoder();  
        // Decoding string  
        String dStr = new String(decoder.decode(str));  
        System.out.println("Decoded string: "+dStr);  
	}
}
