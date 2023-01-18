public class BMI {

    int height;
    int weight;

    public int bmiCalculalation(){
        int bmi;
        bmi = weight / (height*height);
        return bmi;
    }

    public Boolean isUnderWeight(){
        Boolean isUnderWeight;
        if (bmiCalculalation()<18.5){
            System.out.println("You are under weight");
            isUnderWeight = true;
        } else {
            isUnderWeight = false;
        }
        return isUnderWeight;
    }

    public Boolean isOverWeight(){
        Boolean isOverWeight;
        if (bmiCalculalation()>25){
            System.out.println("You are under weight");
            isOverWeight = true;
        } else {
            isOverWeight = false;
        }
        return isOverWeight;
    }

    public Boolean isNormalWeight(){
        Boolean isNormalWeight;
        if (18.5<=bmiCalculalation()&&bmiCalculalation()<25){
            System.out.println("You are under weight");
            isNormalWeight = true;
        } else {
            isNormalWeight = false;
        }
        return isNormalWeight;
    }

    public void weight(){

        if (bmiCalculalation()<18.5){
            System.out.println("You are under weight");
        }
        else if (bmiCalculalation()<25){
            System.out.println("You are a correct weight");
        }
        else{
            System.out.println("You are overweight");
        }

    }

}
