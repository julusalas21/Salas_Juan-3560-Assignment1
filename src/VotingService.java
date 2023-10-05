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

    public void setQuestionClass(Question question){
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

    private boolean isCorrect(Student student,Question question){
        if(multipleChoice==true)
        {

        }
    }

}
