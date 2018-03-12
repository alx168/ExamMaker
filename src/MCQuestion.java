import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public abstract class MCQuestion extends Question{
	protected ArrayList<MCAnswer> answers;
	/**
	 * @param t the text to set this MCQuestion to
	 * @param max the maximum value of the question
	 */
	protected MCQuestion(String t, double max) {
		super(t, max);
		answers = new ArrayList<MCAnswer>();
	}
	/**
	 * @param s the scanner to be passed into this question to construct it from a file.
	 */
	protected MCQuestion(Scanner s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	public void print() {
		super.print();
		char answerCount = 'A';
		for(Answer a : answers) {
			System.out.print("	" + answerCount + ". ");
			a.print();
			answerCount++;
		}
	}
	public void addAnswer(MCAnswer a) {
		answers.add(a);
	}
	public void reorderAnswers() {
		Collections.shuffle(answers);
	}
	public double getValue(MCAnswer a) {
		double total = 0.0;
		for(MCAnswer c : answers) {
			total += c.getCredit(a);
		}
		return total * maxValue;
	}
	public void save(PrintWriter p) {
		
	}
}