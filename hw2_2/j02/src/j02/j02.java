package j02;
import java.util.Scanner;
import java.util.Random;
public class j02 {
	public static void main(String args[]) {
		Random ran=new Random();
		int ans=ran.nextInt(100),guess=0;
		Scanner s=new Scanner(System.in);
		//System.out.print("ans:"+ans);
		int max=100,min=0;
		while(true) {
			System.out.println("範圍:"+max+'~'+min);
			System.out.print("請輸入數字:");
			guess=s.nextInt();
			if(ans>guess) {
				System.out.println("數字太小");	
				min=guess;
			}
			else if(ans<guess) {
				System.out.println("數字太大");
				max=guess;
			}
			else {
				System.out.print("猜對");
				break;
			}
		}	
	}
}
