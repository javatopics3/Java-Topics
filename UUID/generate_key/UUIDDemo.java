package generate_key;

import java.util.UUID;

public class UUIDDemo {
	public static void main(String[] args) {
		// creating UUID
		UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");

		// checking the value of random UUID
		System.out.println("Random UUID value: " + uid.randomUUID());
	}
}
