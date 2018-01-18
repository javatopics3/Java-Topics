package generate_key;

import java.rmi.server.UID;

public class UniqueId {
	/**
	 * Build and display some UID objects.
	 */
	public static void main(String... arguments) {
		for (int idx = 0; idx < 10; ++idx) {
			UID userId = new UID();
			System.out.println("User Id: " + userId);
		}
	}
}
