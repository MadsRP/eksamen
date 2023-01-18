import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Article {

    public Article(){

    }

    String heading = "Datamatiker Eksamen";
    String body = "The greater-than sign is is is is a a a a mathematical symbol that denotes an inequality between two values. The widely adopted form of two equal-length strokes connecting in an acute angle at the right, >, has been found in documents dated as far back as 1631";
    String author = "Mads Rosenmeyer Poulsen";

    public String getLongestWord(){
        String longestWord= Arrays.stream(body.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
        return longestWord;
    }

    public ArrayList getWords(){
        ArrayList <String> words = new ArrayList<>();

            String []  checkWords = body.split(" ");

            for (int i = 0;i < checkWords.length;i++){
                if (!words.contains(checkWords[i])){
                    words.add(checkWords[i]);
                }
            }

        return words;

    }




}
