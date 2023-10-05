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

    public String getCorrectAnswer(int index){
        return CorrectAnswers.elementAt(index);
    }
}
