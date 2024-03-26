import java.util.Scanner;
public class HW5 {
	static int totalCardNum;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StoreValueCard card1[] = {new StoreValueCard("NTUNHS001",500,0)};
		totalCardNum=card1.length;
		int menu=1,money;
		while(menu!=0) {
			System.out.print("1.儲值 2.扣款 3.兌換紅利 4.查看明細 0.離開系統 \n輸入功能: ");
			menu=s.nextInt();
			if(menu==1) {
				System.out.println("輸入儲值金額 ");
				money=s.nextInt();
				card1[0].addValue(money);
				
			}
			else if(menu==2) {
				System.out.println("輸入扣款金額 ");
				money=s.nextInt();
				card1[0].charge(money);
			}
			else if(menu==3) {
				System.out.println("輸入兌換紅利 ");
				money=s.nextInt();
				card1[0].exchangeBonus(money);
			}
			else if(menu==4) {
				card1[0].printDetails();	
			}
			else if(menu==0) {
				break;
			}
			else {
				System.out.println("輸入錯誤");
			}
		}
		System.out.println("結束");
	}
}
class StoreValueCard{
	private String cardID;
	private int balance,bonus;
	
	String getcardID() {
		return cardID;
	}

	int getBalance() {
		return balance;
	}

	int getBonus() {
		return bonus;
	}

	void addValue(int value){
		if(value<0) {
			System.out.println("金額不能為負");	
		}
		else {
			if(value>1000){
				bonus+=value/1000;
			}
			this.balance=this.balance+value;
			System.out.println(cardID+','+balance+','+bonus);
		}
	}

	void charge(int value){
		if(value<0) {
			System.out.println("金額不能為負");
		}
		else if(this.balance<value) {
			System.out.println("餘額不足");
		}
		else{
			this.balance=this.balance-value;
			System.out.println(cardID+','+balance+','+bonus);
		}
	}

	void exchangeBonus(int b) {
		if(b<0) {
			System.out.println("不能為負");
		}
		else if(bonus<b) {
			System.out.println("紅利不足");
		}
		else {
			bonus=bonus-b;
			System.out.println(cardID+','+balance+','+bonus);
		}
	}
    
	void printDetails() {
		System.out.println(cardID+','+balance+','+bonus);
	}

	StoreValueCard(String id,int balance,int bonus){
		cardID=id;
		this.balance=balance;
		this.bonus=bonus;
	}
}
