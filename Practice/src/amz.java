import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class amz {

	public static void main(String[] args) {
		int maxTravelDist = 10000;
		// Create listOfLists in Java
        List<List<Integer>> listOfLists = new ArrayList<>();
		Map<Integer, Integer> forwardRoutList = new HashMap<Integer, Integer>();
		forwardRoutList.put(1, 3000);
		forwardRoutList.put(2, 5000);
		forwardRoutList.put(3, 7000);
		forwardRoutList.put(4, 10000);
		Map<Integer, Integer> returnRoutList = new HashMap<Integer, Integer>();
		returnRoutList.put(1, 2000);
		returnRoutList.put(2, 3000);
		returnRoutList.put(3, 4000);
		returnRoutList.put(4, 5000);
//
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
        System.out.println(listOfLists.get(0).get(2));
        for (int i = 0; i < 4; i++) {
        	System.out.println(listOfLists.get(1).get(i));
		}
        
//        for (List<Integer> integer : listOfLists) {
//			for (Integer integer2 : integer) {
//				System.out.println(integer2);
//			}
//		}
//        
        
        
        
        
		// results
		Map<Integer, Integer> resultList = new HashMap<Integer, Integer>();
		Set<Integer> Fkeys = forwardRoutList.keySet();
		Set<Integer> Rkeys = returnRoutList.keySet();
		for (Integer FK : Fkeys) {
			for (Integer RK : Rkeys) {
				if (forwardRoutList.get(FK) + returnRoutList.get(RK) == maxTravelDist) {
					resultList.put(FK, RK);
				}

			}

		}
		if(resultList.size()==0) {
			
		}

	}
	
	//

}
