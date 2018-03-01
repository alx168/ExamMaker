
public abstract class MCAnswer extends Answer{
	protected String text;
	protected boolean selected;
	protected double creditIfSelected;
//	protected String getText() {
//		return text;
//	}
	protected MCAnswer(String t, double cIfSelected) {
		text = t;
		creditIfSelected = cIfSelected;
	}
	public void print() {
		System.out.println(text);
	}
	public void setSelected(boolean s) {
		selected = s;
	}
}
