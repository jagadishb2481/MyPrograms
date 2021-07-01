package testpack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static List<String> getNthFreqString(String str, Integer n) {
		List<String> list = new ArrayList<String>() ;
		 str = str.replaceAll("\\s+", "");
		String upcase = str.toUpperCase();
		String []listOfstr = upcase.split("");
		//List<String> distinct = Arrays.stream(listOfstr).distinct().collect(Collectors.toList());
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for(String s: listOfstr) {
			if(!map.containsKey(s)) {
				map.put(s, 1);
			}else {
				map.put(s, map.get(s)+1);
			}
		}
		LinkedHashMap<String, Integer> sortmap = new LinkedHashMap<>();
		map.entrySet()
	    .stream()
	    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
	    .forEachOrdered(x -> sortmap.put(x.getKey(), x.getValue()));
		System.out.println(map);
		System.out.println(sortmap);
		LinkedHashMap<Integer, List<String>> finalMap = new LinkedHashMap<>();
		sortmap.forEach((k,v)->{
			if(!finalMap.containsKey(v)) {
				List<String> ls= new ArrayList<String>();
				ls.add(k);
				finalMap.put(v, ls);
			}else {
				List<String> x = finalMap.get(v);
				x.add(k);
				finalMap.put(v, x);
			}
		});
		
		System.out.println("FINAL MAP: " + finalMap);
		if(n!=0 && n<=finalMap.keySet().stream().collect(Collectors.toList()).size()) {
		 list = finalMap.get(finalMap.keySet().stream().collect(Collectors.toList()).get(n-1));
		 }
		System.out.println(list);
		System.out.println("This is from Pavan Branch");
		return list;
	}
	public static void getDisplay(){
		System.out.println("This is from Pavan Branch");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getNthFreqString("This is a String", 0);
		//System.out.println("Testing");
	}

}
