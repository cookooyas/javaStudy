package oop11.inner03;

class Button{
	OnClickListener ocl;
	void setOnClickListener(OnClickListener ocl) {
		this.ocl=ocl;
	}
	interface OnClickListener{
		public abstract void onClick();
	}
	void onClick() {
		ocl.onClick();
	}
}

public class ButtonAPIExmple {
	public static void main(String[] args) {
		// 1. 클릭하면 음악재성
		Button btn1 = new Button();
		btn1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("1. 음악재성");
			}
		});
		btn1.onClick();
		
		Button btn2 = new Button();
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("2. 네이버 접속");
			}
		});
		btn2.onClick();
	}
}
