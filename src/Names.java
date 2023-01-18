import java.util.List;

public class Names {
    private String firstName;
    private String middleName = null;
    private String lastName;

    public Names(){

    }

    public Names(String fullName){
        String [] splitName = fullName.split(" ");
        if (splitName.length == 2)
        {
            firstName = splitName[0];
            middleName = "";
            lastName = splitName[1];
        }else if (splitName.length == 3) {
        firstName = splitName[0];
        middleName = splitName[1];
        lastName = splitName[2];
        }
    }


    public String tooString(){
            return firstName + middleName + lastName;
    }

}
