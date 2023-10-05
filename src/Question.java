public abstract class Question {
    private String question;
    private int numOfAnswers;

    public abstract void AnswerKey();

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
