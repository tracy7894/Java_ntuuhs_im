import java.util.Scanner;
public class HW3_1 {
	public static void main(String[] args) {
		int score[],input,score2[];

		Scanner s=new Scanner(System.in);
		System.out.print("要輸入多少數字:");
		input=s.nextInt();
		score=new int[input];
		score2=new int[input];
		
		for(int i=0;i<score.length;i++) {
			System.out.print("輸入數字:");
			score[i]=s.nextInt();
		}
		int j=(score.length)-1,i=0;
		while(i<5) {
			score2[j]=score[i];
			i++;
			j--;
		}
		System.out.print("反轉前:");
		for(int x=0;x<score.length;x++) {
			System.out.print(score[x]+" ");
		}
		System.out.println();
		System.out.print("反轉後:");
		for(int x=0;x<score.length;x++) {
			System.out.print(score2[x]+" ");
		}
	}
}
