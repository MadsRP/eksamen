import java.util.ArrayList;
import java.util.Random;

public class Raflebæger {

    int antalTerninger;

    ArrayList <Integer>terningeØjne = new ArrayList<>();


    public Raflebæger(){
    }

    public Raflebæger(int antalTerninger){
        this.antalTerninger = antalTerninger;
    }

    public int ryst(){
        Random rn = new Random();
        int antalØjne=0;
        int total=0;
        int terninger=antalTerninger;
        do {
            antalØjne = rn.nextInt(1,6);
            total = total + antalØjne;
            terninger = terninger-1;
            terningeØjne.add(antalØjne);
        } while (terninger>0);
        return total;
    }

    public void se(){
        System.out.println("Det totale mængde øjne er " + ryst());
        for (int terningeøjne : terningeØjne){
            System.out.println(terningeøjne);
        }
    }


}
