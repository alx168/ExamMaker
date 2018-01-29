/**
* <h1>Exam Maker</h1>
* Simple exam maker that is built off of answers and questions classes.
* Is the driver/tester for the rest of the classes
*
* @author  Alexander Guo
* @version 1.0
* @since   2017-28-01
*/

import java.util.Random;

public class ExamDriver {

	public static void main(String[] args) {
		Exam e = new Exam("Exam1");
		
		Question q = new Question("What is your name?");
		Answer a = new Answer("Alex");
		Answer a1 = new Answer("Will");
		Answer a2 = new Answer("Stephen");
		Answer a3 = new Answer("Mounia");
		Answer a4 = new Answer("Mike");
		a.setValue(1, 0);
		q.AddAnswer(a);
		q.AddAnswer(a1);
		q.AddAnswer(a2);
		q.AddAnswer(a3);
		q.AddAnswer(a4);
		Question q1 = new Question("What is your goal in life?");
		Answer a11 = new Answer("To be happy");
		Answer a12 = new Answer("To move to California");
		Answer a13 = new Answer("To always do my best");
		Answer a14 = new Answer("To be better");
		Answer a15 = new Answer("Every answer");
		a15.setValue(1, 0);
		q1.AddAnswer(a11);
		q1.AddAnswer(a12);
		q1.AddAnswer(a13);
		q1.AddAnswer(a14);
		q1.AddAnswer(a15);
		Question q2 = new Question("What is the answer to life?");
		Answer a21 = new Answer("42");
		Answer a22 = new Answer("Couch potatoes");
		Answer a23 = new Answer("Who knows?");
		Answer a24 = new Answer("-42");
		Answer a25 = new Answer("That which is only known to you");
		a21.setValue(1, 0);
		q2.AddAnswer(a21);
		q2.AddAnswer(a22);
		q2.AddAnswer(a23);
		q2.AddAnswer(a24);
		q2.AddAnswer(a25);
		Question q3 = new Question("Your favorite cookie is?");
		Answer a31 = new Answer("Chocolate Chip");
		Answer a32 = new Answer("Oatmeal Raison");
		Answer a33 = new Answer("Sugar");
		Answer a34 = new Answer("Mint Double Chocolate");
		Answer a35 = new Answer("Toffee");
		a34.setValue(1, 0);
		q3.AddAnswer(a31);
		q3.AddAnswer(a32);
		q3.AddAnswer(a33);
		q3.AddAnswer(a34);
		q3.AddAnswer(a35);
		
		e.AddQuestion(q);
		e.AddQuestion(q1);
		e.AddQuestion(q2);
		e.AddQuestion(q3);
		e.setName("Alex");
		e.setNetID("aguo7");
		e.print();
		e.reorderQuestions();
		for(int i = 1; i <= e.getNumOfQs(); i++) {
			e.getQuestion(i).reorderAnswers();
		}
		e.print();
		//randomly selecting answers. Expect low scores because only 1/5 chance to get the right answer per question
		Random rm = new Random();
		for(int i = 1; i <= e.getNumOfQs(); i++) {
			e.getQuestion(i).selectAnswer(rm.nextInt(5 - 1 + 1) + 1);
		}
		System.out.println("Overall Score is: " + e.getValue());
		
		for(int i = 1; i <= e.getNumOfQs(); i++) {
			System.out.println("Q" + i + ". contributed: " + e.getQuestion(i).getValue());
		}
	}
}
