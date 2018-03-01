/**
* @author Alexander Guo
*
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//use a javadoc comments to get a nice looking documentation
public class Exam {
	private String title;
	private String name;
	private String netid;
	private List<Question> questions = new ArrayList<Question>();
	
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
	public void addQuestion(Question q) {
		questions.add(q);
	}
	/**
	 * gets the number of questions
	 * @return the number of quesitons currently on the exam
	 *
	 */
	public int getNumOfQs() {
		return questions.size();
	}
	/**
	 * prints out the exam starting with the name, netid, exam title and then questions and their answers
	 *
	 */
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("NetID: " + netid);
		System.out.println("Exam: " + title);
		int questionCount = 1;
		for(Question q : questions) {
			System.out.print("Q" + questionCount + ". ");
			q.print();
			questionCount++;
		}
	}
	
	/**
	 * reorders the questions on the exam
	 * 
	 */
	public void reorderQuestions() {
		Collections.shuffle(questions);
	}
	//need to write code that garentees MC type question because this method should only work with MC types.
	/**
	 * Reorders the MC question's answers given the position of the MC question.
	 * @param position if negative, reorder all MC answers.  If not, reorder the ith quesiton's answers.
	 */
	public void reorderMCAnswers(int position) {
		if(position > questions.size() -1 || position < 0) {
			System.out.println("Invalid position.");
			return;
		}else{
			if(questions.get(position) instanceof MCQuestion) {
				((MCQuestion)(questions.get(position))).reorderAnswers();
			}else {
				System.out.println("question is not an instanceof MCQuestion");
			}
		}
	}
	//not done
	public void getAnswerFromStudent(int position) {
		questions.get(position).getAnswerFromStudent();
	}
	/**
	 * prints out a table of the values of each question on the exam and the total.
	 */
	public void reportQuestionValues(){
		System.out.println("Question Values");
		int qCount = 1;
		for(Question q : questions) {
			System.out.println("Q" + qCount + ". " + "is worth " + q.getValue());
			qCount++;
		}
	}
	
	/**
	 * gets the values of the questions
	 * @return the total score of the user so far
	 *
	 */
	public double getValue() {
		double total = 0;
		for(Question q : questions) {
			total+=q.getValue();
		}
		return total;
	}
}
