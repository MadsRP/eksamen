import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class ExamQuestion {

    int number;
    String grade;
    File questions = new File("C:\\Users\\mosen\\OneDrive\\Skrivebord\\questions.txt");

    public String randomGrade(){
        Random rn = new Random();
        int randomNumber = rn.nextInt(1,6);
        switch (randomNumber){
            case 1:
            grade = "a";
                break;
            case 2:
                grade = "b";
                break;
            case 3:
                grade = "c";
                break;
            case 4:
                grade = "d";
                break;
            case 5:
                grade = "e";
                break;
            case 6:
                grade = "f";
                break;
        }
        return grade;
    }

    public ArrayList<String> examQuestions(){
        int i = 0;
        ArrayList<String> questions = new ArrayList<>();
        do  {
                questions.add(i + randomGrade());
                i++;
        } while (questions.size()<14);
        return questions;
    }

    public void writeQuestions() throws IOException {
        FileWriter fileWriter = new FileWriter(questions,false);
        for (String examQuestions : examQuestions()) {
            System.out.println(examQuestions);
            fileWriter.write(examQuestions + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }



}
