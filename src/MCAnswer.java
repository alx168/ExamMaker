import java.io.PrintWriter;
import java.util.Scanner;

public abstract class MCAnswer extends Answer{
	protected String text;
	protected double creditIfSelected;
//	protected String getText() {
//		return text;
//	}
	protected MCAnswer(String t, double cIfSelected) {
		text = t;
		creditIfSelected = cIfSelected;
	}
	public MCAnswer(Scanner s) {}
	public void print() {
		System.out.println(text);
	}
	public double getCredit(Answer rightAnswer) {
		if(rightAnswer == this) {
			return ((MCAnswer)rightAnswer).creditIfSelected;
		}else {
			return 0.0;
		}
	}
	public void save(PrintWriter p) {}
}
