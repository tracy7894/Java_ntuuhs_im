import java.util.Scanner;
public class HW4_1 {
	public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        String in="1";
        while(!(in.equals("0"))){
            System.out.print("輸入:");
            in=s.next();
            if(in.contains("嗎")){
                in=in.replace("嗎","");            
            }
            if(in.contains("?")){
                in=in.replace("?","!");
            }
            if(in.contains("會不會")){
                in=in.replace("會不會","會");
                if(in.contains("你")) {
                	in=in.replace("你","我");
                }
            }
            else if(in.contains("你會")){
                in=in.replace("你會","我會");
            }
            if(in.contains("能不能")){
                in=in.replace("能不能","能");
                if(in.contains("你")) {
                	in=in.replace("你","我");
                }
            }
            else if(in.contains("你能")){
                in=in.replace("你能","我能");
            }
            System.out.println(in); 
        }
        System.out.println("結束");

    }
}
