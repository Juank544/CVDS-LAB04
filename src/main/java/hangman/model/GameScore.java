package hangman.model;

public interface GameScore {
	
	public abstract int calcularScore(int correctCount, int incorrectCount);

}
