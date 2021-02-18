package hangman.model;

public class PowerScore implements GameScore{

	/**
	 * @obj: Calculate the final score, initial score = 0 points, umpteenth correct letter is credited with 5^i and incorrect letters are penalized with 8 points. The max score is 500. 
	 * @param correctCount - Number of correct letters
	 * @param incorrectCount - Number of incorrect letters
	 * @pre TRUE
	 * @pos return the final score
	 */
	public int calcularScore(int correctCount, int incorrectCount) {
		// TODO Auto-generated method stub
		return 0;
	}

}