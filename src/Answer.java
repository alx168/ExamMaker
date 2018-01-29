/**
 * 
 * @author Alexander Guo
 *
 */
public class Answer {

	private String data;
	private double correct;
	private double incorrect;
	private boolean selected;
	/**
	 * Used to print out the answer 
	 * @param position the ith position of the answer when printed
	 */
	public void print(int position) {
		System.out.println("	" + position  + ". " + data);
	}
	/**
	 * sets an answer to be selected when the user selects it
	 * @param s bool stating whether or not the answer was selected
	 */
	public void setSelected(boolean s) {
		selected = s;
	}
	/**
	 * Sets how much the answer is worth 
	 * @param selected This is the value the answer is worth is it is selected
	 * @param unselected This is the value the answer is worth if it is unselected
	 */
	public void setValue(double selected, double unselected) {
		correct = selected;
		incorrect = unselected;
	}
	/**
	 * gets value of answer
	 * @return the value of the answer based on whether or not it was selected
	 */
	public double getValue() {
		if(selected) {
			return correct;
		}else {
			return incorrect;
		}
	}
	/**
	 * constructor for an Answer class
	 * @param a this is the data an answer will contain and will be printed.
	 */
	public Answer(String a){
		data = a;
		selected = false;
		correct = 0;
		incorrect = 0;
		
	}
	
}
