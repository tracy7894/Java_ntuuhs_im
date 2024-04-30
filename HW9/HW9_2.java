import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
class HW9_2{
    public static void main(String[] args) {
        Set<Integer> phone=new HashSet<>();
        String p;
        int a=0;
        Scanner s=new Scanner(System.in);
        while(a!=-1){
            System.out.println("輸入電話號碼(結束輸入-1):");
            a=s.nextInt();
            if(a==-1)
                break;
            phone.add(a);
        }
        System.out.println(phone);
        System.out.print("手機號碼數量:");
        System.out.println(phone.size());
    }
}