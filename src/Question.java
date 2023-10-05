import java.util.Vector;

public abstract class Question {
    //the main parts of a question class are the question itself, the number of answers,
    //and the answer choices that are listed
    private String question;
    private int numOfAnswers;
    private Vector<String> AnswerChoices= new Vector<>();

    public void setAnswerChoices(Vector<String> answerChoices){
        AnswerChoices=(Vector)answerChoices.clone();
    }

    public String getAnswerChoice(int index){
        String answerChoice = AnswerChoices.elementAt(index);
        return answerChoice;
    }

    // the correct answer is the next important part of a question
    //however, that needs to be handled by the children which go into more detail

    public void setNumOfAnswers(int numOfAnswers) {
        this.numOfAnswers = numOfAnswers;
    }

    public int getNumOfAnswers() {
        return numOfAnswers;
    }

    public void setQuestion(String usrQuestion) {
        question=usrQuestion;
    }

    public String getQuestion() {
        return question;
    }
}
