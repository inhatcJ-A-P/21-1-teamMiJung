/*AdderInterface를 상속받은 클래스 MyAdder를 작성하여, 다음 main()을 실행할 때 아래 실행 결과와 같이
 * 출력되도록 하라.
 */
package two;

public class MyAdder implements AdderInterface {

	@Override //추상메소드 구현
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
