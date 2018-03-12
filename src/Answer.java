import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Alexander Guo
 *
 */
public abstract class Answer {
	protected Answer() {
		
	}
	/**
	 * Used to read in from an answer file and then pass the scanner to children
	 * @param s the scanner that will read in from file and be passed around
	 */
	public Answer(Scanner s) {}
	abstract void print();
	abstract double getCredit(Answer rightAnswer);
	public abstract void save(PrintWriter p);
}
