public class SingleChoice extends Question{

    private String answer;

    //not sure if this class is essential
    public String getCorrectAnswer() {
        return answer;
    }
    public void setCorrectAnswer(String answer) {
        this.answer=answer;
    }
    public boolean checkAnswer(String answer)
    {
        boolean check=false;
        if(answer.equalsIgnoreCase(this.answer)){
            check=true;
        }
        return check;
    }
}
