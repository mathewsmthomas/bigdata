import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ListMap {
	
	public static void main(String args[]){
	
		List<Map<String,Object>> newList = new ArrayList<Map<String,Object>>();


        Map<String,Object> integerMap = new HashMap<String,Object>();

        integerMap.put("one",new Integer(1));
        integerMap.put("two",new Integer(2));
        integerMap.put("two",new Integer(3));

        Map<String,Object> map1 = new HashMap<String,Object>();

        Map<String,Object> doubleMap = new HashMap<String,Object>();

        doubleMap.put("one",new Double(1.0));
        doubleMap.put("two",new Double(2.0));
        doubleMap.put("two",new Double(3.0));


        newList.add(integerMap);
        newList.add(doubleMap);
        
        for (Map<String,Object> currentMap : newList) {
        	for (Map.Entry<String,Object> curEntry:currentMap.entrySet()){ 
                String s = (String) curEntry.getValue().toString();  //handle your case accordingly,with null check and other to stirng
                String k = curEntry.getKey();
                System.out.println(k + "  "+s);
             }	
        
        }
        
        //target list to which will have all the values of the map
        List<String> targetList = new ArrayList<String>(); 

        /*Code to iterate Map and add the value to the list */

        for (Map<String,Object> currentMap : newList) {
               //check for currentMap null check
                 for (Map.Entry<String,Object> curEntry:currentMap.entrySet()){ 
                    String s = (String) curEntry.getValue().toString();  //handle your case accordingly,with null check and other to stirng
                    targetList.add(s);
                 }
        }


        /*Testing the targetList */

        for (String s : targetList) {
                System.out.println(s);
         }


		
	
	
}

}
