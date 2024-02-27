package j01;
import java.util.Scanner;
import java.lang.Math;
public class j01 {
	static int pv,fv,interval;
	static final double interest=0.05; 
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	System.out.println("輸入本金:");
    	pv=s.nextInt();
    	System.out.println("輸入週期:");
    	interval=s.nextInt();

    	fv=(int) (pv*Math.pow((1+interest), interval));
    	System.out.println("my pv is\t"+pv+"\tand after\t"+interval+" year it would be\t"+fv);

    	
    }
}
