package mypackage2;

public class SubstractionQuestion implements IntQuestion {

	private int a, b; // The numbers in the problem.

	public SubstractionQuestion() { // constructor
		a = (int) (Math.random() * 50 + 1);
		b = (int) (Math.random() * 50);
		if(b>a){
			int tmp=a;
			a=b;
			b=tmp;
		}
	}

	@Override
	public String getQuestion() {
		return "What is " + a + " - " + b + " ?";
		
	}

	@Override
	public int getCorrectAnswer() {
		return a - b;
	}

}
