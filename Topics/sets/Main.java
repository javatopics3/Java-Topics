package sets;
import java.util.ArrayList;
import java.util.ListIterator;
public class Main {
	public static void main(String[] args) {
        ArrayList days = new ArrayList<>();
        days.add("Sun");
        days.add("Mon");
        days.add("Tue");
        days.add("Thu");
        days.add("Fri");
        days.add("Sat");
        ListIterator iterator = days.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.set("None");
        System.out.println("After set : ");
        for (String item : days) {
            System.out.println(item);
        }
    }
}
