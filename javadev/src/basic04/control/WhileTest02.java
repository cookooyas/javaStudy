package basic04.control;

public class WhileTest02 {
	public static void main(String[] args) {
		int i= 0;
		int sum= 0;
		while (i<=1000) {
			sum+=i;
			i+=3;
		}
		System.out.println(sum);
		
		i= 0;
		sum= 0;
		while (i<=1000) {
			if(i%3==0)sum+=i;
			i++;
		}
		System.out.println(sum);
	}
}
