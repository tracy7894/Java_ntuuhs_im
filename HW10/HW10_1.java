import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HW10_1 {
    public static void main(String args[]){
        try{
            File x1=new File("Mytest.txt");
            FileReader x2=new FileReader(x1, null);
            BufferedReader x4 = new BufferedReader(x2);
            String x3=null;
            while((x3=x4.readLine())!=null){
                System.out.println(x3);
            }
            x4.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
