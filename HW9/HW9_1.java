import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
//import java.util.Arrays.sort();
class HW9_1{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int a,n=0,m,max,min,sum=0;
        Integer num;
        Scanner s=new Scanner(System.in);
        while(n!=-1){
            System.out.println("請輸入數字，結束請輸入(-1)");
            n=s.nextInt();
            if(n==-1){
                break;
            }
            
            list.add(n);
        }

        Collections.sort(list);
        System.out.println(list);
        min=list.get(0);
        max=list.get((list.size()-1));
        for(int x:list){
            sum+=x;
        }
        System.out.print("最大值:");
        System.out.println(max);
        System.out.print("最小值:");
        System.out.println(min);
        System.out.print("平均值:");
        System.out.println(sum);
    }
}