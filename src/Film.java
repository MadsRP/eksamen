public class Film {
    private String filmtitel;
    private int udgivelsesår;


    public Film(){

    }

    public Film(String filmtitel, int udgivelsesår){
        this.filmtitel = filmtitel;
        this.udgivelsesår = udgivelsesår;
    }

    public Film (String filmtitel){
        this.filmtitel = filmtitel;
        udgivelsesår = 2023;
    }



}
