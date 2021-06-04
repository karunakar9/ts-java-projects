import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex  {
	public static void main(String[] args) {
	List<String> friendslist= new ArrayList<>();
	friendslist.add("mothi");
	friendslist.add("eshwar");
	friendslist.add("dihith");
	friendslist.add("anil");
	friendslist.add("madhukar");
	System.out.println(friendslist);
	Collections.sort(friendslist);//ascending order
	System.out.println(friendslist);
	Collections.reverse(friendslist);//reverse order
	System.out.println(friendslist);

}}