package oop12.garbage;

interface A{
	
}

interface B{
	
}

public class RefMe extends Object implements A,B{

	public RefMe(){
		System.out.println("태어남");
	}
	// shift + alt + s -> v
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("ㅠㅠ");
	
	}
}
