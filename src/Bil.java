public class Bil {

    private Boolean tilkoblet;
    private int totalVægt;
    Trailer trailer = new Trailer();

    public Bil(){

    }

    public int returnTotalVægt(){
        if (tilkoblet = true){
            totalVægt = totalVægt + trailer.trailerVægt;
            return totalVægt;
        } else {
            return totalVægt;
        }
    }

    public void tilkoblingAfTrailer(){
        if (totalVægt + trailer.trailerVægt < 3500){
            returnTotalVægt();
        } else {
            System.out.println("Your vehicle and trailer weigh too much.");
        }
    }

}
