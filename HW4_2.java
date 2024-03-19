import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class HW4_2 {
    public static void main(String[] args){
        String content,bpp="\".*?\"",b2="\"";//bpp="\"\\d\\w\\b/\\b";
       //bpp="\"[a-z0-9]{8}/[0-9]{6}[a-z]{1}\"$";
        Path filePath=Path.of("C:\\Users\\User\\Desktop\\HW4/demo.txt");
        try{
            content=Files.readString(filePath);
            Pattern pattern=Pattern.compile(bpp);
            Matcher matcher=pattern.matcher(content);
            while(matcher.find()){
                pattern=Pattern.compile(b2);
                matcher=pattern.matcher(matcher.group());
                System.out.println(matcher.group());
            }

        }
        catch(IOException e){
            e.printStackTrace();
        } 
    }
}
