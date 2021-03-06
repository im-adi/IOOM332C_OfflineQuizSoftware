import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;


// Abstract Class
abstract class question {

    private String content;
    private Dictionary options;
    private int correctAnswer;
    private int selectedAnswer;
    private boolean isAttempted;
    private boolean isCorrect;
    private int marks;
    
    public String getContent() {
        return content;
    }

    public int getSelectedAnswer() {
        return selectedAnswer;
    }

    public Dictionary getOptions() {
        return options;
    }

    public boolean isAttempted() {
        return isAttempted;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public boolean checkAnswer(int _selected){
        
        selectedAnswer = _selected;
        isAttempted = true;
        isCorrect = (correctAnswer == selectedAnswer);

        return isCorrect;
    
    }

}