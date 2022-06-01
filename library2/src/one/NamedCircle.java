//Circle 클래스를 상속받은 NamedCircle클래스를 작성하여, 
//다음 main()을 실행할 때 다음 실행 결과와 같이 출력되도록 하라.
package one;

public class NamedCircle extends Circle{
	String name;
	public NamedCircle(int radius,String name) {
		super(radius);
		this.name=name;
		
	}
	public void show() {
		System.out.println(name+", 반지름 = "+getRadius());
	}
	
	public static void main(String[] args) {
		NamedCircle w = new NamedCircle(5,"waffle");
		w.show();
	}

}
