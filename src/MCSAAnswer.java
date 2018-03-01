
public class MCSAAnswer extends MCAnswer{

	public MCSAAnswer(String t, double cIfSelected) {
		super(t, cIfSelected);
	}
	public double getCredit(Answer rightAnswer) {
		if(rightAnswer == null) {
			System.out.println("right answer is null");
		}
		
		MCSAAnswer a = (MCSAAnswer)rightAnswer;
		if(a.text.equals(this.text)) {
				return creditIfSelected;
		}else {
			return 0.0;
		}
//		}else {
//			System.out.println("Answer not instanceof MCSAAnswer");
//			return 0.0;
//		}
	}
	
}
