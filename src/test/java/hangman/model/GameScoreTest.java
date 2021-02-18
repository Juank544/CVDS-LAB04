package hangman;

import hangman.model.OriginalScore;
import hangman.model.BonusScore;
import hangman.model.PowerScore;
import hangman.exceptions.ExcepcionParametrosInvalidos;

import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {
    @Test
    public void ParametrosInvalidosEnOriginalScoreDuring(){
        int correctCount = 0; 
        int incorrectCount = 0; 
        int ans,value;

        OriginalScore score = new OriginalScore();

        try{
            ans = score.calculateScore(correctCount,incorrectCount);

            value = 100;

            Assert.assertEquals(ans,value);
        } 
        catch(ExcepcionParametrosInvalidos e){
            //None
        }
    }

    @Test
    public void ParametrosInvalidosEnBonusScoreDuring(){
        int correctCount = 0; 
        int incorrectCount = 0; 
        int ans,value;

        BonusScore score = new BonusScore();

        try{
            ans = score.calculateScore(correctCount,incorrectCount);

            value = 0;

            Assert.assertEquals(ans,value);
        } 
        catch(ExcepcionParametrosInvalidos e){
            //None
        }
    }

    @Test
    public void PuntajeMenorCeroEnBonusScore(){
        int correctCount = 0; 
        int incorrectCount = 3; 
        int ans,value;

        BonusScore score = new BonusScore();

        try{
            ans = score.calculateScore(correctCount,incorrectCount);

            value = 0;

            Assert.assertEquals(ans,value);
        } 
        catch(ExcepcionParametrosInvalidos e){
            //None
        }
    }


@Test
    public void ParametrosInvalidosEnPowerScoreBefore(){
        int correctCount = -1; 
        int incorrectCount = 0; 
        int ans;

        PowerScore score = new PowerScore();

        try {
            ans = score.calculateScore(correctCount,incorrectCount);

            Assert.fail();
        } 
        catch (ExcepcionParametrosInvalidos e) {
            Assert.assertEquals(ExcepcionParametrosInvalidos.PARAMETRO_NEGATIVO,e.getMessage());
        }
    }

    @Test
    public void ParametrosInvalidosEnPowerScoreDuring(){
        int correctCount = 0; 
        int incorrectCount = 0; 
        int ans,value;

        PowerScore score = new PowerScore();

        try{
            ans = score.calculateScore(correctCount,incorrectCount);

            value = 0;

            Assert.assertEquals(ans,value);
        } 
        catch(ExcepcionParametrosInvalidos e){
            //None
        }
    }

    @Test
    public void PuntajeExcedeElLimiteEnPowerScore(){
        int correctCount = 4; 
        int incorrectCount = 0; 
        int ans,value;

        PowerScore score = new PowerScore();

        try{
            ans = score.calculateScore(correctCount,incorrectCount);

            value = 500;

            Assert.assertEquals(ans,value);
        } 
        catch(ExcepcionParametrosInvalidos e){
            //None
        }
    }
}