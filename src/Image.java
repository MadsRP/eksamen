import java.util.ArrayList;
import java.util.List;

public class Image {

    String fileName = "painting.jpg";
    int width = 100;
    int height = 30;

    public Boolean isKnownFileType(){
        Boolean isKnownFileType = null;
        String[] fileType = fileName.split("\\.");
        ArrayList<String> fileTypes = new ArrayList<String>();
        fileTypes.add("gif");
        fileTypes.add("jpg");
        fileTypes.add("jpeg");
        fileTypes.add("png");
        fileTypes.add("webp");
        fileTypes.add("bmp");


        for (int i = 0;i<fileTypes.size();i++ ){
                if (fileType[1].matches(fileTypes.get(i))){
                    isKnownFileType = true; 
                    break;
                } else {
                    isKnownFileType = false;
                }
        }

        return isKnownFileType;
        
    }

    public Boolean isPortrait(){
        Boolean isPortrait;
        if (height>width){
            isPortrait = true;
        } else {
            isPortrait = false;
        }
        return isPortrait;
    }

    public Boolean isLandscape(){
        Boolean isLandscape;
        if (width>height){
            isLandscape = true;
        } else {
            isLandscape = false;
        }
            return isLandscape;
    }
}
