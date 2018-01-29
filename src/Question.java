/**
 * 
 * @author Alexander Guo
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
	/**
	 *Question class that contains the question and then the answers corresponding to that question
	 *
	 */
	private List<Answer> answerBank = new ArrayList<Answer>();
	private String question;
	private int numOfAnswers = 0;
	/**
	 * Question constructor taking string which is the question being asked
	 * @param q the question that will be printed to the user
	 *
	 */
	Question(String q){
		question = q;
	}
	/**
	 * gets the number of answers currently in this question
	 * @return how many answers there are for this question
	 *
	 */
	public int getNumOfAnswers() {
		return numOfAnswers;
	}
	/**
	 * Adds a new answer to the question
	 * @param a the new answer to be added
	 *
	 */
	public void AddAnswer( Answer a) {
		answerBank.add(a);
		numOfAnswers++;
	} 
	/**
	 * prints out the position of the question and then the actual question along with it's answers
	 * @param position the ith position of the question
	 *
	 */
	public void print( int position ) {
		//printing out which question number this is and then the question. Correct position when passing not in function
		System.out.println("Q" + position + ". " + question);
		for(Answer a : answerBank) {
			a.print(answerBank.indexOf(a) + 1);
		}
	}
	/**
	 * selects an answer to this question and unselects any previously selected answer
	 * @param position is the ith position of the answer but be aware that valid positions are from 1 to # of questions
	 *
	 */
	//be aware that we start at 1 in this implementation...
	public void selectAnswer( int position ){
		if(position > answerBank.size() || position < 1) {
			System.out.println("That isn't a valid number");
			return;
		}else {
			//professor wants only one answer selected each time. Go through and unselect any previous answers.
			for(Answer a : answerBank) {
				a.setSelected(false);
			}
			answerBank.get(position - 1).setSelected(true);
			System.out.println("Selected answer number " + position);
		}
	}
	/**
	 * unselects an answer
	 * @param position ith position to unselect the answer
	 *
	 */
	public void unselectAnswer( int position ) {
		if(position > answerBank.size() || position < 1) {
			System.out.println("That isn't a valid number");
			return;
		}else {
			answerBank.get(position - 1).setSelected(false);
			System.out.println("Unselected answer number " + position);
		}
	}
	/**
	 * randomly shuffles the order of the answers
	 *
	 */
	public void reorderAnswers(){
		Collections.shuffle(answerBank);
	}
	/**
	 * @return the values of all the answers selected and unselected
	 *
	 */
	public double getValue() {
		//return the value of the answers currently selected/unselected
		double total = 0;
		for(Answer a : answerBank) {
			total += a.getValue();
		}
		return total;
	}
	
}
