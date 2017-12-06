/* convert a List of object 
 * e.g. List<T> into a Map e.g. Map<K, V>, 
 * where K is some property of the object and 
 * V is the actual object. 
 * For example, suppose you have a List<Order> 
 * and you want to convert it into a Map e.g. Map<OrderId, Order>, 
*/

package collection_n_DataStructures;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConvertListToMap {
	// converts AL to Map
	HashMap<Integer, Order> hs = new HashMap<>();
	private Map convertToMap(ArrayList pAl)
	{
		//iterate throigh the AL and get all the orderId. make the orderId as the key
		//and add it to the HM
		
		
		return hs;
	}
	public static void main(String[] args) {
		ConvertListToMap clm = new ConvertListToMap();
		//Order od1= new Order(1, "clothes"); -- 
		//usual object creation does not work as Order is inner class
		//to access the innerclass's object we have to use the outerclass instance
		//use <OuterCLass>.<Innerclass> obj = <OuterclassObj>.new <Innerclass>();
		ConvertListToMap.Order od1 = clm.new Order(1, "clothes");
		ConvertListToMap.Order od2 = clm.new Order(2, "dress");
		ConvertListToMap.Order od3 = clm.new Order(4, "ties");
		ArrayList<Order> li = new ArrayList<>();
		li.add(od1);
		li.add(od2);
		li.add(od3);
		Map<Integer, Order> mp = clm.convertToMap(li);
	}
	// Inner class 
	class Order{
		int orderId;
		String orderName;
		Order(int id, String nm)
		{
			orderId = id;
			orderName = nm;
		}
	}

}
