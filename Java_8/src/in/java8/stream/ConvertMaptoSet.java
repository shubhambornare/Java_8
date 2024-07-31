package in.java8.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConvertMaptoSet {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Ramesh");
		map.put(3, "Kalpesh");
		map.put(5, "Ashish");
		map.put(2, "Rakesh");
		map.put(4, "Depesh");
		
		Set<Integer> i = map.keySet();
		i.stream().sorted().forEach(f->System.out.println(f));
		System.out.println("------------"); 
		
		Set<Map.Entry<Integer, String>> s = map.entrySet();
		s.stream().sorted((a,b) -> a.getKey() > b.getKey() ? 1 : a.getKey() < b.getKey() ? -1 :0).forEach(f->System.out.println(f));
		System.out.println("------------");
		s.stream().sorted((a,b) -> a.getValue().compareTo(b.getValue())).forEach(f->System.out.println(f));
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		Map<String, Integer> ma = new HashMap<>();
		ma.put("Ramesh",5);
		ma.put("Kalpesh",3);
		ma.put("Rajesh",4);
		ma.put("Rakesh",1);
		ma.put("Depesh",2);
		
		Set<Integer> i1 = map.keySet();
		i1.stream().sorted().forEach(f->System.out.println(f));
		System.out.println("------------"); 
		
		Set<Map.Entry<Integer, String>> s1 = map.entrySet();
		s1.stream().sorted((a,b) -> a.getKey() > b.getKey() ? 1 : a.getKey() < b.getKey() ? -1 :0).forEach(f->System.out.println(f));
		System.out.println("------------");
		s1.stream().sorted((a,b) -> a.getValue().compareTo(b.getValue())).forEach(f->System.out.println(f));
			
	}
}


















