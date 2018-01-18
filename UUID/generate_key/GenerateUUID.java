package generate_key;

import java.util.UUID;

public class GenerateUUID {
	public static void main(String[] args) {
		// generate random UUIDs
		UUID idOne = UUID.randomUUID();
		UUID idTwo = UUID.randomUUID();
		log("UUID One: " + idOne);
		log("UUID Two: " + idTwo);
	}

	private static void log(Object aObject) {
		System.out.println(String.valueOf(aObject));
	}
}
