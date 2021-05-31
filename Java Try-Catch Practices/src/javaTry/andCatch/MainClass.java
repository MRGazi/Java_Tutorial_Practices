package javaTry.andCatch;

public class MainClass {
	int x;
	int y;
	int z;
	
	MainClass(int x, int y){
		this.x = x;
		this.y = y;
	}
	/*
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	*/
	public int addition() {
		return  x + y;
	}

	public static void main(String[] args) {
		
		MainClass obj1 = new MainClass(90,250);
		//z = obj1.addition();
		System.out.println("Size = " + obj1.addition());
			
	}

}
