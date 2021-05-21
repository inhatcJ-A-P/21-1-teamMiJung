package five;

public class StringStack implements StackInterface {
	int top=0;
	int n;
	String[] strStack;
	
	public void getNum(int n) {
		this.n=n;
		strStack= new String[n];
	}
	
	@Override
	public int length() {
		return top;
	}

	@Override
	public String pop() {
		String Max = strStack[n-1];
		n=n-1;
		return Max;
	}

	@Override
	public boolean push(String ob) {
		strStack[top]=ob;
		top++;
		return false;
	}

}
