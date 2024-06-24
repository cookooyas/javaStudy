package oop15.enum04;

import java.util.Scanner;

public class EnumTest2 {
public static void main(String[] args) {
	System.out.print("seoul, busan, jeju >>");
	Scanner sc = new Scanner(System.in);
	
	String where = sc.nextLine();
	
	where=where.toUpperCase();
	City city = City.valueOf(where); // 타입정의
	
	switch(city) {
	case SEOUL:
		System.out.println("서울 인구 : "+City.SEOUL.getPopulation());
		break;
	case BUSAN:
		System.out.println("부산 인구 : "+City.BUSAN.getPopulation());
		break;
	case JEJU:
		System.out.println("제주 인구 : "+City.JEJU.getPopulation());
		break;
	}
	
	sc.close();
}
}
