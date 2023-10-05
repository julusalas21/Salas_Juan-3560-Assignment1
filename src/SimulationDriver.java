
import java.util.Vector;
import java.util.Random;
public class SimulationDriver {
    public static void main(String[] args){
        Random random=new Random();

        SingleChoice singleChoice = new SingleChoice();
        singleChoice.setQuestion("How many fingers do I have?");
        final int numOfStudents=10;

        Vector<String> answerChoices= new Vector<>();
        answerChoices.add("A.4");
        answerChoices.add("B.5");
        answerChoices.add("C.7");
        answerChoices.add("D.2");
        singleChoice.setAnswerChoices(answerChoices);

        singleChoice.setNumOfAnswers(4);
        singleChoice.setCorrectAnswer("B.5");

        VotingService voter=new VotingService();
        voter.setQuestion(singleChoice);

        for(int i=0;i<numOfStudents;i++)
        {
            int randomInt= random.nextInt()%answerChoices.size();
            if(randomInt<0) {
                randomInt *= -1;
            }
            Student tempStudent = new Student();
            tempStudent.chooseAnswer(answerChoices.elementAt(randomInt));
            voter.addStudent(tempStudent);
        }
        voter.outputResults();
    }
}
