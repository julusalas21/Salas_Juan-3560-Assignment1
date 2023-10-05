import java.util.Vector;

public class VotingService {
    private boolean multipleChoice=false;
    private boolean questionInitialized=false;
    private Vector<Student> listOfStudentAnswers= new Vector<>();
    private Student temp;
    private Question question;

    VotingService(){
        question=new SingleChoice();
    }
    //can only be initialized when created
    VotingService(String questionType){
        if (questionType.equalsIgnoreCase("MultipleChoice"))
        {
            multipleChoice=true;
            question=new MultipleChoice();
        }
        else
        {
            question=new SingleChoice();
        }
    }

    public void setQuestion(Question question){
        this.question=question;
        questionInitialized=true;
    }

    public void addStudent(Student student)
    {
        listOfStudentAnswers.add(student);
    }
    public Student getStudent(int index){
        return listOfStudentAnswers.elementAt(index);
    }
    public int getAmountOfStudents()
    {
        return listOfStudentAnswers.size();
    }

    public void outputResults(){
        for(int i=0;i<question.getNumOfAnswers();i++)
        {
            String answerChoice=question.getAnswerChoice(i);
            int numOfAnswers=0;
            for(int j=0;j<getAmountOfStudents();j++)
            {
                if(listOfStudentAnswers.elementAt(j).getAnswer().equalsIgnoreCase(answerChoice)) {
                    numOfAnswers++;
                }
            }
            if(question.checkAnswer(answerChoice)) {
                System.out.println(answerChoice + ": " + numOfAnswers+" Correct!");
            }
            else {
                System.out.println(answerChoice + ": " + numOfAnswers);
            }
        }
    }


    public boolean isCorrect(Student student){
        boolean check=false;
        if(question.checkAnswer(student.getAnswer()))
        {
            check=true;
        }
        return check;
    }

}
