import java.lang.reflect.InaccessibleObjectException;
import java.util.Vector;

public class MultipleChoice extends Question{

    private Vector<String> CorrectAnswers= new Vector<>();
    private boolean initialized=false;

    public void setCorrectAnswers(Vector<String> correctList) {
        CorrectAnswers=(Vector)correctList.clone();
        initialized=true;
    }

    public int getNumOfCorrectAnswers(){
        if(!initialized)
        {
            throw new InaccessibleObjectException("Correct Answers have not been initialized!");
        }
        else
            return CorrectAnswers.size();
    }

    //not too sure if i need to get rid of this class because of the check answer
    public String getCorrectAnswer(int index){
        return CorrectAnswers.elementAt(index);
    }

    @Override
    public boolean checkAnswer(String answer){
        boolean check=false;
        for(int i=0;i<CorrectAnswers.size();i++){
            if(answer.equalsIgnoreCase(CorrectAnswers.elementAt(i))){
                check= true;
                break;
            }
        }
        return check;

    }
}
