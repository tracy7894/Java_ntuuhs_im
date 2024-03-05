package hw2_1;

import java.util.Random;
import java.util.Scanner;

public class hw2_1 {
	public static void main(String args[]) {
		String ans;
		Scanner s=new Scanner(System.in);
		System.out.print("發燒?");
		ans=s.next();
		
		if(ans.equals("y")) {
			System.out.print("咳?");
			ans=s.next();
			if(ans.equals("y")) {
				
				System.out.print("疲倦?");
				ans=s.next();
				if(ans.equals("y")) {System.out.print("感冒");}
				else {System.out.print("其他");}
			}
			
			
			else {
				System.out.print("高血壓?");
				ans=s.next();
				if(ans.equals("y")) {
					
					System.out.print("口乾?");
					ans=s.next();
					if(ans.equals("y")) {
						System.out.print("肝病");}
					else {
						System.out.print("其他");}
				}
				else {
					
					System.out.print("盜汗?");
					ans=s.next();
					if(ans.equals("y")) {
						
						System.out.print("肺病");
						}
					else {
						
						System.out.print("其他");}}
			}
		}
		else {
			System.out.print("正常");
		}
	}
}
