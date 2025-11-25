package exam04;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
//		String str1 = "Hi";
//		String str2 = "Hi";
//		String str3 = new String("Hi");
//		//Object obj = str1;
//		
//		System.out.println(str1.hashCode());
//		System.out.println(str2.hashCode());
//		System.out.println(str3.hashCode());
//		//System.out.println(obj.hashCode());

			HashMap<String, String> hashMap = 
					new HashMap<String, String>();
			
			hashMap.put("1234", "Park");
			
			System.out.println(hashMap.get("1234"));
			
			System.out.println(hashMap.get(new String("123")));
	}

}