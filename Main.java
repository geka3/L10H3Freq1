package net.ukr.geka3;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> array = new ArrayList<Object>();
		
		//System.out.println((new Integer(45)).hashCode() + " " + (new Integer (45)).hashCode());
		
		array.add(new Integer(45));
		array.add(67);
		array.add(new Integer(45));
		array.add("Hello");
		array.add(new File("hi.txt"));
		
		HashMap<Object, Integer> hm = new HashMap<>();
		//hm.put(new Integer(45), 15);
		
		for( Object o : array){
			if(hm.containsKey(o)) {
				Integer i = hm.get(o);
				i++;
				hm.put(o, i);
				
			}else{
				hm.put(o, 1);
			}
			
			
		}
		
		for(Entry<Object, Integer> sm : hm.entrySet()){
				System.out.println(sm.getKey() + " " + sm.getValue());
			}
		
		
	}

}
