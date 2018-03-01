import java.util.ArrayList;
import java.util.Collections;

public abstract class MCQuestion extends Question{
	protected ArrayList<MCAnswer> answers;
	MCQuestion(String t, double max) {
		super(t, max);
		answers = new ArrayList<MCAnswer>();
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
}