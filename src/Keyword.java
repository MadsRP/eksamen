public class Keyword {
    String definition;
    String word;

    String seeAlso;

    public Keyword(){

    }

    public Boolean matches(){
        Boolean match = null;
        String søgeord = null;
        if (søgeord.toLowerCase().contains(word.toLowerCase())) {
            match = true;
        } else {
            match = false;
        }
        return match;
    }

    public String seeAlso(){


        return seeAlso;
    }


}
