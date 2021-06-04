import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Mettl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map =new HashMap();
		map.put("1", "two");
		map.put("1", "two");
		System.out.println("This is map"+map);
		System.out.println("These are keys");
		displaymap(map.keySet());
		System.out.println("Thesea are values");
		displaymap(map.values());
	}

	static void displaymap(Collection A) {
		Iterator itrobject =A.iterator();
		while(itrobject.hasNext()) {
			String s=(String) itrobject.next();
			System.out.println(s+" ");
		}
	}
}
