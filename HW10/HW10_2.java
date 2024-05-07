import java.io.File;
import java.io.IOException;

public class HW10_2{
    public static void main(String args[]){
        File dir=new File("dir");
        dir.mkdir();
        File fl=new File("dir","fl.txt");
        try{
            fl.createNewFile();

        }
        catch(IOException e){;}
        File newDir=new File("newDir");
        dir.renameTo(newDir);
    }
}