//Circle Ŭ������ ��ӹ��� NamedCircleŬ������ �ۼ��Ͽ�, 
//���� main()�� ������ �� ���� ���� ����� ���� ��µǵ��� �϶�.
package one;

public class NamedCircle extends Circle{
	String name;
	public NamedCircle(int radius,String name) {
		super(radius);
		this.name=name;
		
	}
	public void show() {
		System.out.println(name+", ������ = "+getRadius());
	}
	
	public static void main(String[] args) {
		NamedCircle w = new NamedCircle(5,"waffle");
		w.show();
	}

}
