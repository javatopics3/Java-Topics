package generate_key;

import java.util.UUID;

import org.w3c.dom.traversal.NodeIterator;

import com.sun.javafx.image.impl.General;

public class TimeBasedUUID {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		NodeIterator timeBasedGenerator = General.timeBasedGenerator();

		// Generate time based UUID
		UUID firstUUID = timeBasedGenerator.generate();
		System.out.printf("1. First UUID is : %s ", firstUUID.toString());
		System.out.printf("\n2. Timestamp of UUID is : %d ",
				firstUUID.timestamp());

		UUID secondUUID = timeBasedGenerator.generate();
		System.out.printf("\n3. Second UUID is :%s ", secondUUID.toString());
		System.out.printf("\n4. Timestamp of UUID is : %d ",
				secondUUID.timestamp());

		// Generate custom UUID from network interface
		timeBasedGenerator = Generators.timeBasedGenerator(EthernetAddress
				.fromInterface());
		UUID customUUID = timeBasedGenerator.generate();
		UUID anotherCustomUUID = timeBasedGenerator.generate();

		System.out.printf("\n5. Custom UUID is :%s ", customUUID.toString());
		System.out.printf("\n6. Another custom UUID : %s ",
				anotherCustomUUID.toString());
	}// main
}// TimeBasedUUID
