package basic05.array;

public class PrimaryAndReference {
	public static void main(String[] args) {
		int v1 =3;
		int v2=v1;
		v2=7;
		System.out.println(v1+","+v2);
		System.out.println();
		
		int[] arr1 = new int[] {3,4,5};
		int[] arr2 =arr1;
		arr2[0]=7;

		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
	}
}
