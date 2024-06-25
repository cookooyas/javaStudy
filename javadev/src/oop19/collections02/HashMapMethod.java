package oop19.collections02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {
	public static void main(String[] args) {
		Map<Integer, String> hm1 = new HashMap<Integer, String>();

		// 1. put
		hm1.put(2, "나다라");
		hm1.put(1, "가나다");
		hm1.put(3, "다라마");
		System.out.println(hm1.toString());

		Map<Integer, String> hm2 = new HashMap<Integer, String>();
		hm2.putAll(hm1);
		System.out.println(hm2.toString());

		hm2.replace(1, "가가가");
		hm2.replace(4, "라라라");
		System.out.println(hm2.toString());

		hm2.replace(1, "가가가", "나나나");
		hm2.replace(2, "다다다", "라라라");
		System.out.println(hm2.toString());

		System.out.println(hm2.get(1));
		System.out.println(hm2.get(2));
		System.out.println(hm2.get(3));

		System.out.println(hm2.containsKey(1));
		System.out.println(hm2.containsKey(5));

		System.out.println(hm2.containsValue("나나나"));
		System.out.println(hm2.containsValue("다다다"));

		Set<Integer> keySet = hm2.keySet();
		System.out.println(keySet.toString());

		Set<Map.Entry<Integer, String>> es = hm2.entrySet();
		System.out.println(es.toString());

		System.out.println(hm2.size());

		hm2.remove(1);
		hm2.remove(4);

		System.out.println(hm2.toString());

		hm2.remove(2, "나다라");
		hm2.remove(3, "다다다");
		System.out.println(hm2.toString());

		hm2.clear();

		System.out.println(hm2.toString());
	}
}
