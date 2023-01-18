import java.util.ArrayList;
import java.util.List;

public class MotherBoard {

    ArrayList <SataDrive> sataDrives = new ArrayList();
    SataDrive sataDrive = new SataDrive();



    public MotherBoard(){
        sataDrives.add(sataDrive);
        sataDrives.add(sataDrive);
        sataDrives.add(sataDrive);
    }

    public List listOfSataDrives(){
        return sataDrives;

    }

    public void coupleToMotherboarD(){
        if (sataDrives.size()<4){
            sataDrives.add(sataDrive);
        } else {
            System.out.println("Motherboard is full");
        }
    }


}
