package oop07.inheritance;

class Aaaa {}
class Bbbb extends Aaaa{}
class Cccc extends Bbbb{}
class Dddd extends Bbbb{}

public class Polymorphism {
	public static void main(String[] args) {
		Aaaa a1 = new Aaaa();
		Aaaa a2 = new Bbbb();
		Aaaa a3 = new Cccc();
		Aaaa a4 = new Dddd();

		//Bbbb b1 = new Aaaa();
		Bbbb b2 = new Bbbb();
		Bbbb b3 = new Cccc();
		Bbbb b4 = new Dddd();

		//Cccc c1 = new Aaaa();
		//Cccc c2 = new Bbbb();
		Cccc c3 = new Cccc();
		//Cccc c4 = new Dddd();

		//Dddd d1 = new Aaaa();
		//Dddd d2 = new Bbbb();
		//Dddd d3 = new Cccc();
		Dddd d4 = new Dddd();
	}
}
