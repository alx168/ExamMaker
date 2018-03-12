import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
* <h1>Exam Maker</h1>
* Simple exam maker that is built off of answers and questions classes.
* Is the driver/tester for the rest of the classes
*
* @author  Alexander Guo
* @version 1.0
* @since   2017-28-01
*/

public class ExamDriver {

	public static void main(String[] args) throws FileNotFoundException{
	    
	    Scanner input = new Scanner(new File("sample_exam_file.txt"));
	    
	    Exam e = new Exam(input);
	    System.out.println(e.title);
	/*	
		MCSAQuestion q = new MCSAQuestion("What is your name?", 1);
		Answer a = q.getNewAnswer("Alex", 1);
		q.addAnswer((MCAnswer)a);
		q.setRightAnswer(a);
		q.addAnswer((MCAnswer)q.getNewAnswer("Will"));
		q.addAnswer((MCAnswer)q.getNewAnswer("Mounia"));
		q.addAnswer((MCAnswer)q.getNewAnswer("Mike"));
		q.addAnswer((MCAnswer)q.getNewAnswer("Stephen"));
		
		SAQuestion q1 = new SAQuestion("What is your goal in life?", 1);
		Answer a4 = q1.getNewAnswer("Get a cs degree");
		q1.setRightAnswer((SAAnswer)a4);
		
		MCSAQuestion q2 = new MCSAQuestion("What is the answer to life?", 1);
		Answer a1 = q2.getNewAnswer("42", 1);
		q2.addAnswer((MCAnswer)a1);
		q2.setRightAnswer(a1);
		q2.addAnswer((MCAnswer)q2.getNewAnswer("Who knows? Who cares?"));
		q2.addAnswer((MCAnswer)q2.getNewAnswer("Staying up all night to finish a CS342 Project."));
		q2.addAnswer((MCAnswer)q2.getNewAnswer("Sleeping."));

		SAQuestion q3 = new SAQuestion("Your favorite cookie is?", 1);
		Answer a3 = q3.getNewAnswer("chocolate");
		q3.setRightAnswer((SAAnswer)a3);
		
		e.addQuestion(q);
		e.addQuestion(q1);
		e.addQuestion(q2);
		e.addQuestion(q3);
		
		e.setName("Alex");
		e.setNetID("aguo7");

		e.print();
		e.reorderMCAnswers(0);
		e.reorderMCAnswers(2);
		e.reorderQuestions();
		e.print();
		e.getAnswerFromStudent(0);
		e.getAnswerFromStudent(1);
		e.getAnswerFromStudent(2);
		e.getAnswerFromStudent(3);
		
		System.out.println("Overall Score is: " + e.getValue());
		System.out.println("Questions Values Report:");
		e.reportQuestionValues();
		*/
//		for(int i = 1; i <= e.getNumOfQs(); i++) {
//			System.out.println("Q" + i + ". contributed: " + e.getQuestion(i).getValue());
//		}
	}
}
