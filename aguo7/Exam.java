/**
* @author Alexander Guo
*
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//use a javadoc comments to get a nice looking documentation
public class Exam {
	private String title;
	private String name;
	private String netid;
	private List<Question> questionBank = new ArrayList<Question>();
	
	/**
	 * exam constructor
	 * @param e string that titles the exam
	 *
	 */
	Exam(String e){
		title = e;
	}
	/**
	 * sets the netid of the person taking the exam
	 * @param id the netid 
	 *
	 */
	public void setNetID(String id) {
		netid = id;
	}
	/**
	 * sets the name of the person taking the exam
	 * @param n the name
	 *
	 */
	public void setName(String n) {
		name = n;
	}
	/**
	 * gets the netid of the person taking the exam
	 * @return the netid
	 *
	 */
	public String getNetID() {
		return netid;
	}
	/**
	 * gets the name of the person taking the exam
	 * @return the name
	 *
	 */
	public String getName() {
		return name;
	}
	/**
	 * adds a question the the exam 
	 * @param q the question being added
	 *
	 */
	public void AddQuestion(Question q) {
		questionBank.add(q);
	}
	/**
	 * gets the number of questions
	 * @return the number of quesitons currently on the exam
	 *
	 */
	public int getNumOfQs() {
		return questionBank.size();
	}
	/**
	 * prints out the exam starting with the name, netid, exam title and then questions and their answers
	 *
	 */
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("NetID: " + netid);
		System.out.println("Exam: " + title);
		for(Question q : questionBank) {
			q.print(questionBank.indexOf(q) + 1);
		}
	}
	/**
	 * gets the question at a specific position
	 * @param position ith position of the question 
	 *@return the question if the position is valid otherwise returns and empy question and lets the user know
	 */
	public Question getQuestion(int position) {
		if(position > questionBank.size() || position < 1) {
			System.out.println("Position out of range. Returning empty question.");
			return new Question("Position out of range.");
		}
		return questionBank.get(position - 1);
	}
	/**
	 * reorders the questions on the exam
	 *
	 */
	public void reorderQuestions() {
		Collections.shuffle(questionBank);
	}
	/**
	 * gets the values of the answers 
	 * @return the total score of the user so far
	 *
	 */
	public double getValue() {
		double total = 0;
		for(Question q : questionBank) {
			total+=q.getValue();
		}
		return total;
	}
}
