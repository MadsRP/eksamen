import java.util.Random;

public class JuleGave {

    Boolean isSoft = false;
    Boolean isRectangular;
    Boolean doesRattle;
    Random rn = new Random();
    int random;

    public JuleGave(){
    }

    public Boolean isItSoft (){

        random = rn.nextInt(1,3);
        if (random == 1){
            isSoft = true;
        } else {
            isSoft = false;
        }
        return isSoft;
    }

    public Boolean isItRectangular(){
        random = rn.nextInt(1,3);
        if (random == 1){
            isRectangular = true;
        } else {
            isRectangular = false;
        }
        return isRectangular;
    }

    public Boolean doesItRattle(){
        random = rn.nextInt(3);
        if (random == 1){
            doesRattle = true;
        } else {
            doesRattle = false;
        }
        return doesRattle;
    }

    public Boolean couldBeLego(){
        Boolean itsLego;
        isItRectangular();
        isItSoft();
        doesItRattle();
        if (doesRattle&&isSoft&&isRectangular){
            itsLego = true;
        } else {
            itsLego = false;
        }
        return itsLego;
    }

}
