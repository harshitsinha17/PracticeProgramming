package miscellaneous;

import java.util.Map;
import java.util.TreeMap;

public class Nagarro {
	
	public static String findCount(String str) {
		Map<Character, Integer> mp = new TreeMap<>();
		for(int i =0;i<str.length();i++) {
			if(  mp.containsKey((str.charAt(i)))  ) {
				mp.put(str.charAt(i), mp.get(str.charAt(i))+1);
			}else {
				mp.put(str.charAt(i), 1);
			}
		}
		
		StringBuffer characterCounts = new StringBuffer();
		for(Character c : mp.keySet()) {
			characterCounts.append(c);
			characterCounts.append( mp.get(c) );
			
		}
		
		
		return characterCounts.toString();
	}
	
	public static String convertCToJavaViceVersa(String str) {
		
		StringBuffer converted = null;
		if(str.contains("_")) {
			String CSplitted[] = str.split("_");
			converted = new StringBuffer(CSplitted[0]);
			for(int i = 1;i<CSplitted.length;i++) {
				StringBuffer temp = new StringBuffer(CSplitted[i]);
				temp.setCharAt(0, Character.toUpperCase(temp.charAt(0)));
				CSplitted[i] = temp.toString();	
				converted.append(CSplitted[i]);
			}
			//System.out.println(CSplitted);
		}
		else {
			converted = new StringBuffer(str.substring(0, 1));
			for(int  i =1;i<str.length();i++) {
				if( Character.isUpperCase(str.charAt(i)) ) {
					converted.append("_");
					converted.append(Character.toLowerCase(str.charAt(i)));
					
					
				}else {
					converted.append(str.substring(i,i+1));
				}
				
			}
		}
		
		return converted.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findCount("harshit")+"##");
		System.out.println(convertCToJavaViceVersa("harshit_sinha_shubham_garg")+"##");
		System.out.println(convertCToJavaViceVersa("harshitSinhaShubhamGarg")+"##");
		
		
	}

}
