public class DateAge {

    int yourAge = 30;
    int dateAge = 24;

    public int lowestDateAge(){
        int lowestDateAge;
        lowestDateAge = yourAge / 2 + 7;
        return lowestDateAge;
    }

    public Boolean tooYoung(){
        Boolean tooYoung = false;
        if (dateAge > lowestDateAge()){
            return tooYoung = false;
        } else {
            return tooYoung = true;
        }
    }

}
