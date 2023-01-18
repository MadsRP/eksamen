public class Producer extends Film {


    private String producer;
    public Producer(){

    }

    public Producer(String filmtitel, int udgivelsesår, String producer){
        super(filmtitel, udgivelsesår);
        this.producer = producer;
    }

}
