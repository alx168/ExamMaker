import java.io.PrintWriter;
import java.util.Scanner;

public class SAAnswer extends Answer  {
	protected String text;
	public SAAnswer(String t) {
		text = t;
	}
	public SAAnswer(Scanner s) {}
	public void print() {
		System.out.println(text);
	}
	public double getCredit(Answer rightAnswer) {
		//if(rightAnswer instanceof SAAnswer) {
			SAAnswer a = (SAAnswer)rightAnswer; 
			if(rightAnswer == null) {
				System.out.println("WE HAVE A NULL");
			}
			if(a.text.toLowerCase().equals(this.text.toLowerCase())) {
				return 1;
			}else {
		//}else {
				System.out.println("Incorrect Answer.");
			//System.out.println("Answer not an instanceof SAAnswer.");
			return 0.0;
		}
		//return 0;
	}
	public void save(PrintWriter p) {}
}
