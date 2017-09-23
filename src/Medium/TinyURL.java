package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TinyURL {
	
	HashMap<Integer, String> map = new HashMap<>();
	String name = "http://tinyurl.com/";
	ArrayList<String> list = new ArrayList<>();
	
	public String encode(String longUrl){
		int key = longUrl.hashCode();
		if(!map.containsKey(key)){
			map.put(key, longUrl);
		}
		return name+key;
		
	}
	
	public String encode1(String longUrl){
		list.add(longUrl);
		return String.valueOf(list.size()-1);
		
	}
	
public String decode(String shortUrl){
		int key = Integer.parseInt(shortUrl.replace(name, ""));
		return map.get(key);
	}

public String decode1(String shortUrl){
	int index = Integer.valueOf(shortUrl);
	return (index<list.size() ? list.get(index) : "");
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TinyURL turl = new TinyURL();
		System.out.println(turl.decode1(turl.encode1("https://leetcode.com/problems/design-tinyurl")));
		System.out.println(turl.encode("https://leetcode.com/problems/design-tinyurl"));
		System.out.println(turl.encode("https://leetcode.com/problems/implement-tinyurl"));
		System.out.println(turl.encode1("https://leetcode.com/problems/implement-tinyurl"));

	}

}
