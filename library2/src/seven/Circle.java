package seven;

public class Circle implements Shape{
	int a;
	public Circle(int a) {
		this.a=a;
	}
	@Override
	public void draw() {
		System.out.print("¹İÁö¸§ "+a+" ");
	}

	@Override
	public double getArea() {
		return PI*a*a;
	}
	
}
