import java.rmi.server.UID;
public class Student {
    private final UID uid= new UID();
    private String answer;
    public String stringID(){
        return uid.toString();
    }
    public void chooseAnswer(String answerChoice){
        answer=answerChoice;
    }
    public String getAnswer(){
        return answer;
    }
}
