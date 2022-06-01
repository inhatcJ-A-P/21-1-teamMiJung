/*AdderInterface�� ��ӹ��� Ŭ���� MyAdder�� �ۼ��Ͽ�, ���� main()�� ������ �� �Ʒ� ���� ����� ����
 * ��µǵ��� �϶�.
 */
package two;

public class MyAdder implements AdderInterface {

	@Override //�߻�޼ҵ� ����
	public int add(int x, int y) {
			
		return x+y;
	}

	@Override
	public int add(int n) {
		int a =0;
		for (int i = 0; i <= n; i++) {
			a=a+i;
		}
		return a;
	}

	public static void main(String[] args) {
		MyAdder adder = new MyAdder();
		System.out.println(adder.add(5,10));
		System.out.println(adder.add(10));
	}

}
