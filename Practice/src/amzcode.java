import java.util.ArrayList;
import java.util.List;

public class amzcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> listOfLists = new ArrayList<>();
		 // Creating innerList 
        List<Integer> innerList = new ArrayList<>();
        
        // Adding elements to innerList
        innerList.add(3000);
        innerList.add(5000);
        innerList.add(7000);
        innerList.add(10000);
        
        // Adding innerList to listOfLists
        listOfLists.add(innerList);
        
        // Creating another inner list 
        List<Integer> innerList2 = new ArrayList<>();
        
        // Adding elements to innerList2
        innerList2.add(2000);
        innerList2.add(3000);
        innerList2.add(4000);
        innerList2.add(5000);
        
        // Adding innerList2 to listOfLists
        listOfLists.add(innerList2); 
        
        
        
        

	}

}
