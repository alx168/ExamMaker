import java.util.Scanner;
public class MCSAQuestion extends MCQuestion {

	MCSAQuestion(String t, double max) {
		super(t, max);
	}
	public Answer getNewAnswer(){
		System.out.println("What is the new Answer to " + text);
		Scanner sc = new Scanner(System.in);
		String q = sc.nextLine();
		double value = -1;
		while(value < 0.0 || value > 1.0) {
			System.out.println("How much is it scaled by? Enter a number between 0 and 1.");
			value = sc.nextDouble();
		}
		MCSAAnswer a = new MCSAAnswer(q,value);
		return a;
	}
	public Answer getNewAnswer(String text) {
		return new MCSAAnswer(text, 0.0);
	}
	public Answer getNewAnswer(String text, double creditIfSelected) {
		return new MCSAAnswer(text, creditIfSelected);
	}
	public Answer getAnswerFromStudent() {
		boolean s = false;
		int index = 0;
		System.out.println(text + " Please input a Letter.");
		char aCount = 'A';
		for(Answer a : answers) {
			System.out.print(aCount + ". ");
			a.print();
			aCount++;
		}
		Scanner sc = new Scanner(System.in);
		while(s == false) {
			char a = sc.next().charAt(0);
			index = a%65;
			if(index < 0 || index > answers.size()-1) {
				System.out.println("Out of Bounds, choose another answer!");
			}else {
				studentAnswer = answers.get(index);
				s = true;
			}
		}
		return (Answer)(answers.get(index));
	}
	public double getValue() {
		return maxValue * studentAnswer.getCredit(rightAnswer);
	}
	
}
