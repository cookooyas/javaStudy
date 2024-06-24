package oop15.enum04;

public class EnumTest {
	public static void main(String[] args) {
		System.out.println("서울 인구 : "+City.SEOUL.getPopulation());
		System.out.println("부산 인구 : "+City.BUSAN.getPopulation());
		System.out.println("제주 인구 : "+City.JEJU.getPopulation());
	}
}
