package generate_key;

import java.util.UUID;

public class OTP {
	public static void main(String[] args) {
		UUID uid = UUID.randomUUID();
		System.out.println(uid);
	}

}
