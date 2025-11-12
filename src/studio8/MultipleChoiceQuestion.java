package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {

	private String[] choices;

	/**
	 * Constructor
	 * 
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
		super(prompt, answer, points);
		this.choices = choices;
	}

	/**
	 * Display the prompt for the question in addition to
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		for (int i = 0; i < choices.length; i++) {
			System.out.println((i + 1) + ". " + choices[i]);
		}
	}

	/**
	 * Getter method for the available choices
	 * 
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
	}

	public static void main(String[] args) {
		// TODO: create your own MultipleChoiceQuestion
		String[] choices = { "1", "2", "3", "4", "5" };
		Question q1 = new MultipleChoiceQuestion("What's my favorite number?", "5", 100, choices);

		System.out.println(q1.getAnswer());
		System.out.println(q1.getPoints());
		q1.displayPrompt();
		System.out.println(q1.checkAnswer("2"));
	}

}
