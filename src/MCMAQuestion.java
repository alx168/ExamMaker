import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MCMAQuestion extends MCQuestion {
	protected ArrayList<Answer> studentAnswer = new ArrayList<Answer>();
	protected double baseCredit;
	public MCMAQuestion(String t, double max, double baseC) {
		super(t, max);
		baseCredit = baseC;
	}
	/**
	 * will make a new MCMAQuestion based on the file scanned in by s
	 * @param s
	 */
	public MCMAQuestion(Scanner s) {
		super(s);
	}
	public Answer getNewAnswer() {
		return new MCMAAnswer(text, baseCredit);
	}
	public Answer getNewAnswer(String t, double cIfSelected) {
		return new MCMAAnswer(t, cIfSelected);
	}

	public Answer getAnswerFromStudent() {
		
		return null;
	}
	public double getValue() {
		double total = 0.0;
		for(Answer c : studentAnswer) {
			total += super.getValue((MCAnswer)c);
		}
		return total + baseCredit;
	}
	public void save(PrintWriter p) {}
	public void saveStudentAnswer(PrintWriter p) {}
	public void restoreStudentAnswer(PrintWriter p) {}

}
