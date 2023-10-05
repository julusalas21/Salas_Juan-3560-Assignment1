import java.rmi.server.UID;
public class Student {
    private UID uid= new UID();
    public String stringID(){
        return uid.toString();
    }
}
