import java.util.Random;

public class User {

    String name = "Mads Rosenmeyer";
    String userID = "adsd2932";

    public User(){

    }

    public Boolean validUserID(){
        Boolean validUserID = null;
        String fourLetters = userID.substring(0,4);
        String fourNumbers = userID.substring(4,8);

        if (fourNumbers.matches("[0-9]+")) {
            if (fourLetters.matches("[a-zA-Z]+")){
                validUserID = true;
            }
        } else {
            validUserID=false;
        }

        return validUserID;
    }

    public String createUserID(){
        String firstNameLetters = name.substring(0,2);
        String [] splitString = name.split(" ");
        String lastNameLetters = splitString[1].substring(0,2);
        Random rn = new Random();
        int randomNumber = rn.nextInt(1000,9999);
        userID = firstNameLetters + lastNameLetters + randomNumber;
        return userID.toLowerCase();

    }



}
