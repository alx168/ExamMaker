import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author Alexander Guo
 *
 */

public abstract class Question {
	/**
	 *Question class that contains the question and then the answers corresponding to that question
	 *
	 */
	protected String text;
	protected Answer rightAnswer;
	protected Answer studentAnswer;
	protected double maxValue;
	/**
	 * Question constructor taking string which is the question being asked and it's maximum value if the answer recieves full credit.
	 * @param q the question that will be printed to the user
	 * @param maxV the maximum value if the answer gets full credit.
	 *
	 */
	protected Question(String t, double maxV){
		text = t;
		maxValue = maxV;
	}
	/**
	 * question constructor with a scanner to read in from a file and make a new question
	 *
	 * @param s the scanner containing the info for question construction 
	 */
	public Question(Scanner s) {
		
	}
	/**
	 * prints out the question
	 *
	 */
	public void print() {
		System.out.println(text);
	}
	
	public void setRightAnswer(Answer ans) {
		rightAnswer = ans;
	}
	public abstract Answer getNewAnswer();
	public abstract Answer getAnswerFromStudent();
	public double getValue() {
		return maxValue * studentAnswer.getCredit(rightAnswer);
	}
	
	public abstract void save(PrintWriter p);
	public void saveStudentAnswer(PrintWriter p) {
		
	}
	public void restoreStudentAnswers(PrintWriter p) {
		
	}
}
