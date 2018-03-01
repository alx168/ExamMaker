import java.util.*;
public class SAQuestion extends Question{

	public SAQuestion(String t, double maxV) {
		super(t, maxV);
	}
	public Answer getNewAnswer() {
		System.out.println("Please input an answer to " + text);
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		return new SAAnswer(s);
	}
	public Answer getNewAnswer(String text) {
		return new SAAnswer(text);
	}
	public Answer getAnswerFromStudent() {
		System.out.println("What is the answer to: " + text);
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("You input: " + a);
		SAAnswer answer = new SAAnswer(a);
		studentAnswer = answer;
		return answer;
	}
	public double getValue() {
		return maxValue * studentAnswer.getCredit(rightAnswer);
	}

}
