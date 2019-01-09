package Automate.AutomateTC1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Testcase1 {
	
public static void main(String...s) {
	
Map map1=new HashMap();

map1.put(1, "Flash");
map1.put(2, "Arrow");
map1.put(3, "Supergirl");
map1.put(4, "Vampire Diaries");

System.out.println(map1);
	
Set S1=map1.entrySet();

Iterator itr=S1.iterator();

while(itr.hasNext()) {
System.out.println("verify");
Map.Entry M1=(Map.Entry)itr.next();	

System.out.println("Key: "+M1.getKey());
System.out.println("Value: "+M1.getValue());
	
}




	
}
	

}
