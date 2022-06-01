package four;

public class ColorPoint extends Point{
	String color;
	ColorPoint(int x,int y,String color){
		super(x,y);
		this.color=color;
	}
	public void setPoint(int x,int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void show() {
		System.out.println(color+"»öÀ¸·Î("+getX()+","+getY()+")");
	}
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setPoint(10,20);
		cp.setColor("GREEN");
		cp.show();
	}

}
