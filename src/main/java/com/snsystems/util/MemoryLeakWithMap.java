package com.snsystems.util;

import java.util.HashMap;
import java.util.Map;

public class MemoryLeakWithMap {

	private MemoryLeakWithMap() {
		
	}
	
	public static Map<String, String> createMap(int numberOfElements) {
		Map<String, String> map = new HashMap<String, String>();
		
		for (int i=0;i<=numberOfElements; i++) {
			map.put("Key_"+i, "Value:"+i);
		}
		
		return map;
	}
}
